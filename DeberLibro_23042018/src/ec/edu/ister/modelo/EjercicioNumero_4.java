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
public class EjercicioNumero_4 {

    public static void Ejercicio_4() {
   
  int horas ,sueldo ;
  
   horas = Integer.parseInt(JOptionPane.showInputDialog("cuantas horas a trabajo en el mes: "));
  
  sueldo = horas*10;
   
  JOptionPane.showMessageDialog(null,"Tu sueldo de este mes es de: " + sueldo + "$");
 }
}
