/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmoteca;

/**
 *
 * @author MEDAC
 */
public class Pelicula {

    private int id;
    private String titulo;
    private int anyo;
    private int puntuacion;
    private String sinopsis;

    public Pelicula(int id, String titulo, int anyo, int puntuacion, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.anyo = anyo;
        this.puntuacion = puntuacion;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", anyo=" + anyo + ", puntuacion=" + puntuacion + ", sinopsis=" + sinopsis
                + "]";
    }

}
