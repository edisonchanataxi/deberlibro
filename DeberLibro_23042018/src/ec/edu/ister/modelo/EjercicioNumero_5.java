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
public class EjercicioNumero_5 {

    public static void Ejercicio_5() {
    int n1,n2,n3,promedio;
    
    n1= Integer.parseInt(JOptionPane.showInputDialog("ingrese nota primer bimestre")); 
    n2= Integer.parseInt(JOptionPane.showInputDialog("ingrese nota segundo bimestre"));
    n3= Integer.parseInt(JOptionPane.showInputDialog("ingrese nota examen final"));
    
    promedio=(n1+n2+n3)/3;
    JOptionPane.showMessageDialog(null,"El promedio es" + promedio);
 }
     }
