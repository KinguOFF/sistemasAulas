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
import bean.Lspf_usuarios;  
import java.sql.ResultSet;
import java.util.List;
/**
 *
 * @author u09285835112
 */
public class Lspf_usuariosDAO extends DAO_Abstract{
    
    public Lspf_usuariosDAO() {
        super();
   }
    
    @Override
    public void insert(Object object){
        Lspf_usuarios Lspf_usuarios = (Lspf_usuarios) object;
    try {
            String sql = "insert into lspf_usuarios values(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, Lspf_usuarios.getLspf_idUsuario());
            pst.setString(2, Lspf_usuarios.getLspf_nome());
            pst.setString(3, Lspf_usuarios.getLspf_apelido());
            pst.setString(4, Lspf_usuarios.getLspf_cpf());
            pst.setString(5, null);
            pst.setString(6, Lspf_usuarios.getLspf_senha());
            pst.setInt(7, Lspf_usuarios.getLspf_nivel());
            pst.setString(8, Lspf_usuarios.getLspf_ativo());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    }
    
    @Override
    public void update(Object objeto){
     Lspf_usuarios Lspf_usuarios = (Lspf_usuarios) objeto;
    try {
            String sql = "update lspf_usuarios set lspf_nome=?, lspf_apelido=?, lspf_cpf=?,"
                    + "lspf_datanascimento=?, lspf_senha=?, lspf_nivel =?, lspf_ativo=? "
                    + "where lspf_idUsuarios = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(8, Lspf_usuarios.getLspf_idUsuario());
            pst.setString(1, Lspf_usuarios.getLspf_nome());
            pst.setString(2, Lspf_usuarios.getLspf_apelido());
            pst.setString(3, Lspf_usuarios.getLspf_cpf());
            pst.setString(4, null);
            pst.setString(5, Lspf_usuarios.getLspf_senha());
            pst.setInt(6, Lspf_usuarios.getLspf_nivel());
            pst.setString(7, Lspf_usuarios.getLspf_ativo());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    }
    
     
    @Override
    public void delete(Object objeto) {
        Lspf_usuarios Lspf_usuarios = (Lspf_usuarios) objeto;
    try {
            String sql = "delete from lspf_usuarios where lspf_idUsuarios=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, Lspf_usuarios.getLspf_idUsuario());
            pst.executeUpdate();
           
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
        System.out.println("Rodou");
}

    @Override
    public Object list(int id){
        Lspf_usuarios Lspf_usuarios = new Lspf_usuarios();
    try {
            String sql = "select * from lspf_usuarios where lspf_idUsuarios=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeQuery();
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                Lspf_usuarios.setLspf_nome(rs.getString("lspf_nome"));
                Lspf_usuarios.setLspf_apelido(rs.getString("lspf_apelido"));
                Lspf_usuarios.setLspf_cpf(rs.getString("lspf_cpf"));
                Lspf_usuarios.setLspf_ativo(rs.getString("lspf_ativo"));
                // Lspg_usuaeios.setLspg_ativo(rs.getDate("dataNasc"))
                Lspf_usuarios.setLspf_nivel(rs.getInt("lspf_nivel"));
                Lspf_usuarios.setLspf_idUsuario(rs.getInt("lspf_idUsuarios"));
                Lspf_usuarios.setLspf_senha(rs.getString("lspf_senha"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    return Lspf_usuarios;
    }
    
    @Override
    public ArrayList listAll() {
        List lista = new ArrayList();
    try {
            String sql = "select * from lspf_usuarios";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.executeQuery();
            ResultSet rs = pst.executeQuery();
            while (rs.next() == true) {
                Lspf_usuarios Lspf_usuarios = new Lspf_usuarios();
                Lspf_usuarios.setLspf_nome(rs.getString("lspf_nome"));
                Lspf_usuarios.setLspf_apelido(rs.getString("lspf_apelido"));
                Lspf_usuarios.setLspf_cpf(rs.getString("lspf_cpf"));
                Lspf_usuarios.setLspf_ativo(rs.getString("lspf_ativo"));
                // Lspg_usuaeios.setLspg_ativo(rs.getDate("dataNasc"))
                Lspf_usuarios.setLspf_nivel(rs.getInt("lspf_nivel"));
                Lspf_usuarios.setLspf_idUsuario(rs.getInt("lspf_idUsuarios"));
                Lspf_usuarios.setLspf_senha(rs.getString("lspf_senha"));
                lista.add(Lspf_usuarios);
            }
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    return (ArrayList) lista;
    }
    }
    
