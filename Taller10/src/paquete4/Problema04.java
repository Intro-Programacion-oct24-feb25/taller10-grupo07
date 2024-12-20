/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int valorIngresado;
        int[][] datos = new int[2][2];
        int fueraDeRango = 0; 

      
        System.out.println("Presentación de valores iniciales del arreglo:");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%d\t", datos[i][j]);
            }
            System.out.println(); // Salto de línea
        }

        
        System.out.println("Ingreso de datos al arreglo:");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("Ingrese valor para la posición, recuerde "
                        + "que solo son aceptados los números mayores a 1000 y "
                        + "menores a 1199 [%d][%d]: ", i, j);
                valorIngresado = entrada.nextInt();

                if (valorIngresado < 1000 || valorIngresado > 1199) {
                    datos[i][j] = 10; // Valor fuera de rango
                    fueraDeRango++;   // Incrementar el contador
                } else {
                    datos[i][j] = valorIngresado; // Valor dentro del rango
                }
            }
        }

    
        System.out.println("\nPresentación de valores finales del arreglo:");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%d\t", datos[i][j]);
            }
            System.out.println(); 
        }

        
        System.out.printf("\nCantidad de valores fuera de rango: %d\n", 
                fueraDeRango);
    }
}
    

