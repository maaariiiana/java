/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.loja;

import Endereço.Endereço;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa {

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the tiposangue
     */
    public String getTiposangue() {
        return tiposangue;
    }

    /**
     * @param tiposangue the tiposangue to set
     */
    public void setTiposangue(String tiposangue) {
        this.tiposangue = tiposangue;
    }

    /**
     * @return the planosaude
     */
    public String getPlanosaude() {
        return planosaude;
    }

    /**
     * @param planosaude the planosaude to set
     */
    public void setPlanosaude(String planosaude) {
        this.planosaude = planosaude;
    }

    /**
     * @return the cartaotrabalho
     */
    public String getCartaotrabalho() {
        return cartaotrabalho;
    }

    /**
     * @param cartaotrabalho the cartaotrabalho to set
     */
    public void setCartaotrabalho(String cartaotrabalho) {
        this.cartaotrabalho = cartaotrabalho;
    }

    /**
     * @return the codfuncionario
     */
    public int getCodfuncionario() {
        return codfuncionario;
    }

    /**
     * @param codfuncionario the codfuncionario to set
     */
    public void setCodfuncionario(int codfuncionario) {
        this.codfuncionario = codfuncionario;
    }

    /**
     * @return the salario
     */
    public Float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    /**
     * @return the residencial
     */
    public Endereço getResidencial() {
        return residencial;
    }

    /**
     * @param residencial the residencial to set
     */
    public void setResidencial(Endereço residencial) {
        this.residencial = residencial;
    }
   
    private int rg;
    private String tiposangue;
    private String planosaude;
    private String cartaotrabalho;
    private int codfuncionario;
    private Float salario;
    private Endereço residencial;    
    
}
