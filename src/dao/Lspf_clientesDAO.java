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
import bean.Lspf_clientes;  
import java.sql.ResultSet;
/**
 *
 * @author u09285835112
 */
public class Lspf_clientesDAO extends DAO_Abstract {
    public Lspf_clientesDAO() {
     super();
    }
    
    @Override
    public void insert(Object object){
    Lspf_clientes clientes = (Lspf_clientes) object;
    try {
            String sql = "insert into lspf_clientes values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, clientes.getLspf_idClientes());
            pst.setString(2, clientes.getLspf_nome());
            pst.setString(3, clientes.getLspf_cpf());
            pst.setString(4, String.valueOf(clientes.getLspf_rg()));
            pst.setString(5, null);
            pst.setString(6, clientes.getLspf_telefone());
            pst.setString(7, clientes.getLspf_email());
            pst.setString(8, clientes.getLspf_cep());
            pst.setString(9, clientes.getLspf_endereco());
            pst.setString(10, clientes.getLspf_bairro());
            pst.setString(11, clientes.getLspf_sexo());
            pst.setString(12, clientes.getLspf_ativo());
            pst.setString(13, clientes.getLspf_cidade());
            pst.setString(14, clientes.getLspf_celular());
            pst.setInt(15, clientes.getLspf_estado());
            pst.executeUpdate();
           
            
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    
    }
    
    @Override
    public void update(Object object){
    Lspf_clientes cliente = (Lspf_clientes) object;
    try {
            String sql = "update lspf_clientes set lspf_nome=?, lspf_rg=?, lspf_cpf=?,"
                    + "lspf_datanascimento=?, lspf_telefone=?, lspf_email=?, lspf_cep=? "
                    + "lspf_endereco=?, lspf_bairro=?, lspf_sexo=?, lspf_ativo=?, lspf_cidade=?, lspf_celular=?, lspf_estado=? "
                    + "where lspf_idClientes = ? ";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(15, cliente.getLspf_idClientes());
            pst.setString(1, cliente.getLspf_nome());
            pst.setString(2, cliente.getLspf_rg());
            pst.setString(3, cliente.getLspf_cpf());
            pst.setString(4, null);
            pst.setString(5, cliente.getLspf_telefone());
            pst.setString(6, cliente.getLspf_email());
            pst.setString(7, cliente.getLspf_cep());
            pst.setString(8, cliente.getLspf_endereco());
            pst.setString(9, cliente.getLspf_bairro());
            pst.setString(10, cliente.getLspf_sexo());
            pst.setString(11, cliente.getLspf_ativo());
            pst.setString(12, cliente.getLspf_cidade());
            pst.setString(13, cliente.getLspf_celular());
            pst.setInt(14, cliente.getLspf_estado());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
    }
    }
        
    @Override
    public void delete(Object object) {
    Lspf_clientes cliente = (Lspf_clientes) object;
    try {
            String sql = "delete from lspf_clientes where lspf_idClientes = ?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, cliente.getLspf_idClientes());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
    }
    }
    
    @Override
    public Object list(int id){
        Lspf_clientes clientes = new Lspf_clientes();
    try {
            String sql = "select * from lspf_clientes where lspf_idClientes=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeQuery();
            ResultSet rs = pst.executeQuery();
            if (rs.next() == true) {
                clientes.setLspf_nome(rs.getString("lspf_nome"));
                clientes.setLspf_cpf(rs.getString("lspf_cpf"));
                clientes.setLspf_rg(rs.getString("lspf_rg"));
                clientes.setLspf_ativo(rs.getString("lspf_ativo"));
                clientes.setLspf_dataNascimento(null);
                clientes.setLspf_telefone(rs.getString("lspf_telefone"));
                clientes.setLspf_email(rs.getString("lspf_email"));
                clientes.setLspf_cep(rs.getString("lspf_cep"));
                clientes.setLspf_endereco(rs.getString("lspf_endereco"));
                clientes.setLspf_bairro(rs.getString("lspf_bairro"));
                clientes.setLspf_celular(rs.getString("lspf_celular"));
                clientes.setLspf_sexo(rs.getString("lspf_sexo"));
                clientes.setLspf_ativo(rs.getString("lspf_ativo"));
                clientes.setLspf_cidade(rs.getString("lspf_cidade"));
                clientes.setLspf_estado(rs.getInt("lspf_estado"));
                // clientes.setLspf_date(rs.getDate("dataNasc"))
                clientes.setLspf_idClientes(rs.getInt("lspf_idClientes"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro SQL " + ex.getMessage());
            System.exit(0);
        }
    return clientes;
    }
    
    @Override
    public ArrayList listAll() {
        return null;
    }
}
