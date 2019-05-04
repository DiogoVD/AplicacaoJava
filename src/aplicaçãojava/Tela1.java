/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicaçãojava;

import javax.swing.*;

/**
 *
 * @author Diogo
 */
public class Tela1 {
    public static void criaTela(){
        JFrame f = new JFrame();
        f.setSize(290,100);
        f.setTitle("cadastro");
        f.setLocation(10, 10);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
