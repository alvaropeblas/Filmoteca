/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmoteca;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.LinkedList;

/**
 * Clase para la conexión con una base de datos MySQL
 *
 */
public class ConexionDB4O {

    private static ObjectContainer bd;
    private final String rutabd;

    private ConexionDB4O(String rutabd) {
        this.rutabd = rutabd;
    }

    private static ConexionDB4O instance; // Solo habrá una conexión en toda la aplicación

    public static void crearConexion(String rutabd) throws Exception {

        instance = new ConexionDB4O(rutabd);

    }

    public static ConexionDB4O getInstance() throws Exception {
        if (instance == null) {
            throw new Exception("Debe crear una conexion antes de acceder");
        }
        return instance;
    }

    public void conectar() {
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), rutabd);
        System.out.print("[Conectado]");
    }

    public void desconectar() {
        bd.close();
        System.out.print("[Desconectado]");
    }

    public void añadirPeliculas(Pelicula p) {

        bd.store(p);
    }

    public void borrarPelicula(int id) {
        Pelicula pe = new Pelicula(id, null, 0, 0, null);
        ObjectSet res = bd.queryByExample(pe);
        while (res.hasNext()) {
            Pelicula p = (Pelicula) res.next();
            bd.delete(p);
        }

    }

    public LinkedList<Pelicula> listarPeliculas() {
        LinkedList<Pelicula> pelis = new LinkedList<>();
        try {
            Pelicula p = new Pelicula(0, null, 0, 0, null);
            ObjectSet<Pelicula> res = bd.queryByExample(p);
            while (res.hasNext()) {
                pelis.add(res.next());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return pelis;

    }

    void actualizarPelicula(int id, String titulo, int anyo, int puntuacion, String sinopsis) {
        Pelicula pe = new Pelicula(id, null, 0, 0, null);
        ObjectSet res = bd.queryByExample(pe);
        while (res.hasNext()) {
            Pelicula p = (Pelicula) res.next();
            p.setTitulo(titulo);
            p.setAnyo(anyo);
            p.setPuntuacion(puntuacion);
            p.setSinopsis(sinopsis);
            bd.store(p);
        }

    }
}
