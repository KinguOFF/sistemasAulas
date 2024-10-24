/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;
import java.math.BigDecimal;
import java.util.Date;
/**
 *
 * @author u09285835112
 */
public class Lspf_livros {
    private int lspf_idLivros;
    private Date lspf_data;
    private int lspf_quantidade;
    private String lspf_descr;
    private BigDecimal lspf_preco;
    private String lspf_editora;
    private String lspf_autor; 
     
    
    public Lspf_livros() {}

    /**
     * @return the lspf_idLivros
     */
    public int getLspf_idLivros() {
        return lspf_idLivros;
    }

    /**
     * @param lspf_idLivros the lspf_idLivros to set
     */
    public void setLspf_idLivros(int lspf_idLivros) {
        this.lspf_idLivros = lspf_idLivros;
    }

    /**
     * @return the lspf_data
     */
    public Date getLspf_data() {
        return lspf_data;
    }

    /**
     * @param lspf_data the lspf_data to set
     */
    public void setLspf_data(Date lspf_data) {
        this.lspf_data = lspf_data;
    }

    /**
     * @return the lspf_quantidade
     */
    public int getLspf_quantidade() {
        return lspf_quantidade;
    }

    /**
     * @param lspf_quantidade the lspf_quantidade to set
     */
    public void setLspf_quantidade(int lspf_quantidade) {
        this.lspf_quantidade = lspf_quantidade;
    }

    /**
     * @return the lspf_descr
     */
    public String getLspf_descr() {
        return lspf_descr;
    }

    /**
     * @param lspf_descr the lspf_descr to set
     */
    public void setLspf_descr(String lspf_descr) {
        this.lspf_descr = lspf_descr;
    }

    /**
     * @return the lspf_preco
     */
    public BigDecimal getLspf_preco() {
        return lspf_preco;
    }

    /**
     * @param lspf_preco the lspf_preco to set
     */
    public void setLspf_preco(BigDecimal lspf_preco) {
        this.lspf_preco = lspf_preco;
    }

    /**
     * @return the lspf_editora
     */
    public String getLspf_editora() {
        return lspf_editora;
    }

    /**
     * @param lspf_editora the lspf_editora to set
     */
    public void setLspf_editora(String lspf_editora) {
        this.lspf_editora = lspf_editora;
    }

    /**
     * @return the lspf_autor
     */
    public String getLspf_autor() {
        return lspf_autor;
    }

    /**
     * @param lspf_autor the lspf_autor to set
     */
    public void setLspf_autor(String lspf_autor) {
        this.lspf_autor = lspf_autor;
    }

  
}
