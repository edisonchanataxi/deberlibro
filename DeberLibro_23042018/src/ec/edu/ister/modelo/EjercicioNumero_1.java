/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;


import javax.swing.JOptionPane;
/**
 *
 * @author Edison Chanataxi
 */
public class EjercicioNumero_1 {
    public static void Ejercicio_1 () { 

        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1"));
     
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 2"));
       
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 3"));
       
        if(n1 > n2&& n1 > n3){
        JOptionPane.showMessageDialog(null,"El numero mayor es " + n1);
        }else{
            if(n2 > n1 && n2 > n3){
           JOptionPane.showMessageDialog(null,"El numero mayor es " + n2);
            }else{
            JOptionPane.showMessageDialog(null,"El numero mayor es " + n3);
            }
        }
     }
}
 

    

    


