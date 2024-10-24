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
import bean.Lspf_livros;  
import java.math.BigDecimal;
import java.sql.ResultSet;
/**
 *
 * @author u09285835112
 */
public class Lspf_livrosDAO extends DAO_Abstract{
    public Lspf_livrosDAO() {
     super();
    }

    @Override
    public void insert(Object object) {
        Lspf_livros livros = (Lspf_livros) object;
    try {
            String sql = "insert into lspf_livros values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, livros.getLspf_idLivros());
            pst.setBigDecimal(2, livros.getLspf_preco());
            pst.setInt(3, livros.getLspf_quantidade());
            pst.setString(4, livros.getLspf_descr());
            pst.setString(5, livros.getLspf_editora());
            pst.setString(6, livros.getLspf_autor());
            pst.setDate(7, null);
           pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void update(Object object) {
        Lspf_livros livros = (Lspf_livros) object;
        try {
        String sql = "update lspf_livros lspf_editora=?, lspf_descricao=?, lspf_autor=?, lspf_preco=?, lspf_quantidade=?, lspf_dataLancamento=?, where lspf_idLivros=?";
        PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setInt(7, livros.getLspf_idLivros());
        pst.setString(1, livros.getLspf_editora());
        pst.setString(2, livros.getLspf_descr());
        pst.setString(3, livros.getLspf_autor());
        pst.setBigDecimal(4, livros.getLspf_preco());
        pst.setInt(5, livros.getLspf_quantidade());
        pst.setDate(6, null);
        pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.exit(0);
        }
    }

    @Override
    public void delete(Object object) {
        Lspf_livros livros = (Lspf_livros) object;
        try {
        String sql = "delete from lspf_livros where lspf_idLivros=?";
        PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setInt(1, livros.getLspf_idLivros());
        pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.exit(0);
        }
    }

    @Override
    public Object list(int id) {
        Lspf_livros livros = new Lspf_livros(); 
        try{
        String sql = "select * from lspf_livros where lspf_idLivros=?";
        PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if(rs.next() == true) {
        livros.setLspf_autor(rs.getString("lspf_autor"));
        livros.setLspf_data(null);
        livros.setLspf_descr(rs.getString("lspf_descricao"));
        livros.setLspf_editora(rs.getString("lspf_editora"));
        livros.setLspf_quantidade(rs.getInt("lspf_quantidade"));
        livros.setLspf_idLivros(id);
        livros.setLspf_preco(rs.getBigDecimal("lspf_preco"));
        }
        } catch (SQLException ex) {
            System.out.println(ex);
            System.exit(0);
        }
        return livros;
    }

    @Override
    public ArrayList listAll() {
        return null;
    }
  
}
