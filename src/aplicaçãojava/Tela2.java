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
public class Tela2 {
    public void criaTela(){
    //Frame    
        JFrame f = new JFrame();
        f.setSize(300,100);
        f.setTitle("Cadastro de Categorias");
        f.setLocation(150, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    //Painel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        
    //Componentes
    //Label
        JLabel l1 = new JLabel("Codigo");
        l1.setBounds(10, 10, 60, 20);
        
    //Campo texto
        JTextField t1 = new JTextField(" ");
        t1.setBounds(80, 10, 60, 20);
        
    //Botã0
        JButton b1 = new JButton("MBotão");
        b1.setBounds(150, 10, 100, 20);
        
    //Colocando os componentes no painel
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        
    //Colocando o painel no frame
        f.add(p1);
        f.setVisible(true);
    }
}
