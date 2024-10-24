/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import bean.Lspf_vendedores;  
import java.sql.ResultSet;
/**
 *
 * @author u09285835112
 */
public class Lspf_vendedoresDAO extends DAO_Abstract{
    public Lspf_vendedoresDAO() {
     super();
    }
    
    @Override
    public void insert(Object object){
        Lspf_vendedores vendedores = (Lspf_vendedores) object;
    try {
            String sql = "insert into lspf_vendedores values(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vendedores.getLspf_idVendedores());
            pst.setString(2, vendedores.getLspf_nome());
            pst.setString(3, vendedores.getLspf_email());
            pst.setString(4, vendedores.getLspf_endereco());
            pst.setString(5, vendedores.getLspf_cidade());
            pst.setInt(6, vendedores.getLspf_estado());
            pst.setString(7, vendedores.getLspf_cep());
            pst.setString(8, vendedores.getLspf_telefone());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }}
    
    @Override
    public void update(Object object){
        Lspf_vendedores vendedores = (Lspf_vendedores) object;
        try {
        String sql = "update lspf_vendedores set lspf_nome=?, lspf_email=?, lspf_endereco=? lspf_cidade=? lspf_estado=? lspf_cep=? where lspf_idVendedores=?";
        PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setString(1, vendedores.getLspf_nome());
        pst.setString(2, vendedores.getLspf_email());
        pst.setString(3, vendedores.getLspf_endereco());
        pst.setString(4, vendedores.getLspf_cidade());
        pst.setInt(5, vendedores.getLspf_estado());
        pst.setString(6, vendedores.getLspf_cep());
        pst.setInt(7, vendedores.getLspf_idVendedores());
        pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.exit(0);
        }
    }

    @Override
    public void delete(Object object) {
    Lspf_vendedores vendedores = (Lspf_vendedores) object;
        try {
        String sql = "delete from lspf_vendedores where lspf_idVendedores=?";
        PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setInt(1, vendedores.getLspf_idVendedores());
        pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.exit(0);
        }
    }
 
    
    @Override
    public Object list(int id){
        Lspf_vendedores vendedores = new Lspf_vendedores();
        try {
        String sql = "select * from lspf_vendedores where lspf_idVendedores=?";
        PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeQuery();
        ResultSet rs = pst.executeQuery();
        if(rs.next() == true) {
            vendedores.setLspf_nome(rs.getString("lspf_nome"));
            vendedores.setLspf_cep(rs.getString("lspf_cep"));
            vendedores.setLspf_email(rs.getString("lspf_email"));
            vendedores.setLspf_cidade(rs.getString("lspf_cidade"));
            vendedores.setLspf_estado(rs.getInt("lspf_estado"));
            vendedores.setLspf_endereco(rs.getString("lspf_endereco"));
            vendedores.setLspf_idVendedores(id);
            vendedores.setLspf_telefone(rs.getString("lspf_telefone"));
        }
        } catch (SQLException ex) {
            System.out.println(ex);
            System.exit(0);
        }
        return vendedores;
    }
    
    @Override
    public ArrayList listAll() {
        return null;
    }
}
