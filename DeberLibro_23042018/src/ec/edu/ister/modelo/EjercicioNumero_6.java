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
public class EjercicioNumero_6 {

    public static void Ejercicio_6() {
             float rad,vol;
        
       
        rad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del radio: "));
        vol = (float)((4/3)*(3.1416)*(rad*rad*rad));
        JOptionPane.showMessageDialog(null,"El volumen deL CIRCULO es: "+vol);
       
        }
    }


