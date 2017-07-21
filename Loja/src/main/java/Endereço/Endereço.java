/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Endereço;

/**
 *
 * @author aluno
 */
public class Endereço {

    /**
     * @return the lograd
     */
    public int getLograd() {
        return lograd;
    }

    /**
     * @param lograd the lograd to set
     */
    public void setLograd(int lograd) {
        this.lograd = lograd;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    private int lograd;
    private String bairro;
    private int numero;
    private int cep;
    private String pais;
            
}
