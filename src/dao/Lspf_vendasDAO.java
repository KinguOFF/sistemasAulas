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
import bean.Lspf_vendas;  
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author u09285835112
 */
public class Lspf_vendasDAO extends DAO_Abstract{
    public Lspf_vendasDAO() {
     super();
    }
    
    @Override
    public void insert(Object object){
    Lspf_vendas vendas = (Lspf_vendas) object;
    try {
            String sql = "insert into lspf_vendas values(?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vendas.getLspf_idVendas());
            pst.setDate(2, null);
            pst.setInt(3, vendas.getLspf_clientes());
            pst.setInt(4, vendas.getLspf_vendedores());
            pst.setDouble(5, vendas.getLspf_total());
 
           
            
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }}
    
    @Override
    public void update(Object object){
    Lspf_vendas vendas = (Lspf_vendas) object;
    try {
            String sql = "update lspf_vendas set lspf_data=?, set lspf_clientes=?, set lspf_vendedores=?, set lspf_total=? where lspf_idVendas=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(5, vendas.getLspf_idVendas());
            pst.setDate(1, null);
            pst.setInt(2, vendas.getLspf_clientes());
            pst.setInt(3, vendas.getLspf_vendedores());
            pst.setDouble(4, vendas.getLspf_total());
 
           
            
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }    
    }
    
    @Override
    public void delete(Object object) {
     Lspf_vendas vendas = (Lspf_vendas) object;
    try {
            String sql = "delete from lspf_vendas where lspf_idVendas=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vendas.getLspf_idVendas());
     
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }    
    }
    
    @Override
    public Object list(int id){
         Lspf_vendas vendas = new Lspf_vendas();
         
        try {
            String sql =  "select * from lspf_vendas where lspf_idVendas=?";
            PreparedStatement pst;
            pst = cnt.prepareStatement(sql);
            pst.executeQuery();
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true){
                vendas.setLspf_clientes(rs.getInt("lspf_clientes"));
                vendas.setLspf_data(null);
                vendas.setLspf_idVendas(rs.getInt("lspf_idVendas"));
                vendas.setLspf_total(rs.getInt("lspf_total"));
                vendas.setLspf_vendedores(rs.getInt("lspf_vendedores"));
            }
            
           
        } catch (SQLException ex) {
            System.out.println(ex);
            System.exit(0);
        }

                 
        return null;
    }
    
    @Override
    public ArrayList listAll() {
        return null;
    }
}
