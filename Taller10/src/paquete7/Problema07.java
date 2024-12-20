/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author dalto
 */
public class Problema07 {
    
    public static void main(String[] args) {
        // Creación de arreglo bidimensional
        double suma1 = 0;
        double[][] dato1 = {
            {0, 2, 0},
            {1, 0, 0}
        };

        // Sumar todos los elementos de la matriz
        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                suma1 += dato1[i][j];
            }
        }

        if (suma1 == 0) {
            System.out.println("El arreglo es null");
        } else {
            System.out.println("La suma del es: " + suma1);
        }
    }
}
    

