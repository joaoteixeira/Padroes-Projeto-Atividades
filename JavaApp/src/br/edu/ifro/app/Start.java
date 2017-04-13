/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.app;

import br.edu.ifro.app.screen.LoginAccess;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 2298760
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "Hello World!";
        //startApp();
    }
    
    private static void startApp() {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(new LoginAccess());
        frame.pack();
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }
}
