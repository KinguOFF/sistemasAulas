/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import bean.Lspf_usuarios;

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
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lspf_usuarios usuarios = (Lspf_usuarios) lista.get(rowIndex);
        if (columnIndex  == 0) {
        return usuarios.getLspf_idUsuario();
        } 
        if (columnIndex  == 1) {
        return usuarios.getLspf_nome();
        } 
        if (columnIndex  == 2) {
        return usuarios.getLspf_cpf();
        } 
        
        return "";
        
//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getColumnName(int columnIndex) {
    if(columnIndex == 0){
    return "Código";
    }
    if(columnIndex == 1){
    return "Nome";
    }
    if(columnIndex == 2){
    return "CPF";
    }
    return "";
    }
    
}
