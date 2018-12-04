/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author aguinaldogonzalez
 */
public class Contar {
    
    public void temporizador(){
         
        JOptionPane.showConfirmDialog(null,"Escriba la siguiente frase:\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática . ");
        long iniciotemp = System.currentTimeMillis();
        String frasepuesta = JOptionPane.showInputDialog(null,"Pulsa Enter para rematar");
        long finaltemp = System.currentTimeMillis();
        long tardado = finaltemp-iniciotemp;
        JOptionPane.showMessageDialog(null,"TARDACHES "+ tardado+"m TEMPO EN ESCRIBIR A FRASE");
    }
    
}
