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
public class Dadosbancarios {

    /**
     * @return the banco
     */
    public int getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(int banco) {
        this.banco = banco;
    }

    /**
     * @return the ag
     */
    public int getAg() {
        return ag;
    }

    /**
     * @param ag the ag to set
     */
    public void setAg(int ag) {
        this.ag = ag;
    }

    /**
     * @return the cc
     */
    public int getCc() {
        return cc;
    }

    /**
     * @param cc the cc to set
     */
    public void setCc(int cc) {
        this.cc = cc;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    private int banco;
    private int ag;
    private int cc;
    private Float salario;
    private String email;
    
}
