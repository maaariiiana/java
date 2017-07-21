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
public class Produto {

    /**
     * @return the codprod
     */
    public int getCodprod() {
        return codprod;
    }

    /**
     * @param codprod the codprod to set
     */
    public void setCodprod(int codprod) {
        this.codprod = codprod;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the custo
     */
    public float getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }

    /**
     * @return the lucro
     */
    public float getLucro() {
        return lucro;
    }

    /**
     * @param lucro the lucro to set
     */
    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    private int codprod;
    private String descricao;
    private String marca;
    private String modelo;
    private float custo;
    private float lucro;
    private float preco;
    
}
