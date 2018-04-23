/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Edison Chanataxi
 */
public class Aplicacion {
    public static void main(String[] args) {
        int ejercicios;
        
         do {
        ejercicios = Integer.parseInt(JOptionPane.showInputDialog("****MENU EJERCICIOS****\n"
                + "1. Determinar que numero es mayor.\n"
                + "2. suma de dos numeros.\n"
                + "3. Numero es par o impar.\n"
                + "4. Sueldo de un trabajador.\n"
                + "5. promedios de semestre.\n"
                + "6. Radio de un circulo."));
            switch (ejercicios) {
                case 1:
                    EjercicioNumero_1.Ejercicio_1();
                    break;
                case 2:
                    EjercicioNumero_2.Ejercicio_2();
                    break;
                case 3:
                     EjercicioNumero_3.Ejercicio_3();
                    break;
                case 4:
                     EjercicioNumero_4.Ejercicio_4();
                    break;
                case 5:
                    EjercicioNumero_5.Ejercicio_5();
                    break;
                case 6:
                     EjercicioNumero_6.Ejercicio_6();
                    break;
            
            }
        } while (ejercicios != 7);
    }
}
    
    

