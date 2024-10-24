/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09285835112
 */
public class ControllerUsuarios extends AbstractTableModel {

    private List lista;
    
    public void setLista(List lista){
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return 2;
    }

    @Override
    public int getColumnCount() {
        return 3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex  == 1) {
        return 1;
        } 
        else {
        return "";
        }
//To change body of generated methods, choose Tools | Templates.
    }
    
}
