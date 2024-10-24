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
import bean.Lspf_vendas_livros;  
import java.sql.ResultSet;
/**
 *
 * @author u09285835112
 */
public class Lspf_vendas_livrosDAO extends DAO_Abstract{
    public Lspf_vendas_livrosDAO() {
     super();
    }
    
    @Override
    public void insert(Object object){
    Lspf_vendas_livros vendas_livros = (Lspf_vendas_livros) object;
    try {
            String sql = "insert into lspf_vendas_livros values(?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vendas_livros.getLspf_idVendasLiivros());
            pst.setInt(1, vendas_livros.getLspf_vendas());
            pst.setInt(1, vendas_livros.getLspf_livros());
            pst.setInt(1, vendas_livros.getLspf_quant());
            pst.setDouble(1, vendas_livros.getLspf_valorUni());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }}
    
    @Override
    public void update(Object object){
    Lspf_vendas_livros vendas_livros = (Lspf_vendas_livros) object;
    try {
            String sql = "update lspf_vendas_livros set lspf_vendas=?, set lspf_livros=?, set lspf_quant=?, set lspf_valorUni=? where lspf_idVendasLiivros=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(5, vendas_livros.getLspf_idVendasLiivros());
            pst.setInt(1, vendas_livros.getLspf_vendas());
            pst.setInt(2, vendas_livros.getLspf_livros());
            pst.setInt(3, vendas_livros.getLspf_quant());
            pst.setDouble(4, vendas_livros.getLspf_valorUni());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    
    }
    
    @Override
    public void delete(Object object) {
    Lspf_vendas_livros vendas_livros = (Lspf_vendas_livros) object;
    try {
            String sql = "delete from lspf_vendas_livros where lspf_idVendasLiivros=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vendas_livros.getLspf_idVendasLiivros());
            pst.executeUpdate();
                      
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    }
    
    @Override
    public Object list(int codigo){
        Lspf_vendas_livros vendas_livros = new Lspf_vendas_livros();
    try {
            String sql = "select * from lspf_vendas_livros where lspf_idVendasLiivros=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vendas_livros.getLspf_idVendasLiivros());
            
            ResultSet rs = pst.executeQuery();
            
            vendas_livros.setLspf_idVendasLiivros(codigo);
            vendas_livros.setLspf_livros(rs.getInt("lspf_livros"));
            vendas_livros.setLspf_quant(rs.getInt("lspf_quant"));
            vendas_livros.setLspf_valorUni(rs.getDouble("lspf_valorUni"));
            vendas_livros.setLspf_vendas(rs.getInt("lspf_vendas"));
                      
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
        return null;
    }
    
    @Override
    public ArrayList listAll() {
        return null;
    }
}
