/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.loja;

/**
 *
 * @author aluno
 */
public class Venda {

    /**
     * @return the codvenda
     */
    public int getCodvenda() {
        return codvenda;
    }

    /**
     * @param codvenda the codvenda to set
     */
    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    /**
     * @return the numnotafiscal
     */
    public int getNumnotafiscal() {
        return numnotafiscal;
    }

    /**
     * @param numnotafiscal the numnotafiscal to set
     */
    public void setNumnotafiscal(int numnotafiscal) {
        this.numnotafiscal = numnotafiscal;
    }

    /**
     * @return the quatidade
     */
    public String getQuatidade() {
        return quatidade;
    }

    /**
     * @param quatidade the quatidade to set
     */
    public void setQuatidade(String quatidade) {
        this.quatidade = quatidade;
    }

    /**
     * @return the subtotal
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    private int codvenda;
    private int numnotafiscal;
    private String quatidade;
    private String subtotal;
    private int total;
}
