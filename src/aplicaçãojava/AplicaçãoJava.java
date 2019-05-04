/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicaçãojava;

import javax.swing.JFrame;

/**
 *
 * @author Diogo
 */
public class AplicaçãoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=2;
        int num2=8;
        int soma;
        
        soma = num1+num2;
        System.out.printf("A soma é %d\n", soma);
        
        /*Tela1 tela = new Tela1();
        tela.criaTela();
        */
        Tela2 tela2 = new Tela2();
        tela2.criaTela();
    }
}
