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
public class EjercicioNumero_3 {

    public static void Ejercicio_3() {
      
      
        
        int NUMERO;
 
     NUMERO = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
 
        if(NUMERO % 2 == 0 )
        {
            JOptionPane.showMessageDialog(null,"EL NUMERO QUE USTED INGRESO ES PAR");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"EL NUMERO QUE USTED INGRESO ES IMPAR");
        }
    }
}
    

