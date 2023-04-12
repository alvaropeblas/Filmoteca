/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filmoteca;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author MEDAC
 */
public class TableModelPeliculas extends AbstractTableModel {

    private static final String[] columnNames = {"Titulo", "Año", "Puntuación", "Sinopsis"};
    private LinkedList<Pelicula> list;

    public TableModelPeliculas(LinkedList<Pelicula> lista) {
        this.list=lista;
        // Notifica a la vista que el contenido ha cambiado para que se refresque.
        //fireTableDataChanged();
    }

    public Pelicula getValueAt(int rowIndex) {
        return list.get(rowIndex);
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getTitulo();
            case 1:
                return list.get(rowIndex).getAño();
            case 2:
                return list.get(rowIndex).getPuntuacion();
            case 3:
                return list.get(rowIndex).getSinopsis();
        }
        return null;
    }

}
