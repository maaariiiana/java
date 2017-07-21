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
public class Cliente extends Pessoa{

    /**
     * @return the codcliente
     */
    public int getCodcliente() {
        return codcliente;
    }

    /**
     * @param codcliente the codcliente to set
     */
    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }
   
    private int codcliente;
    
}


