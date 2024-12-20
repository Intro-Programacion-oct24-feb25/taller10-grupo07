/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {
    
     public static void main(String[] args) {
        
        
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                  {"Carrie Burton", "Lauren Rice"},
                                  {"Emma Escobar", "Lori Flores"},
                                  {"Steven West", "Toni Martin"}};
        
        String cadena = "";
        
        for (int fila = 0; fila < estudiantes.length; fila++) {
           for (int columna = 0; columna < estudiantes[fila].length; 
                   columna++) {
               int tamaño = estudiantes[fila][columna].length();
               
               if (tamaño == 11) {
              cadena = String.format("%s%s - ", cadena,
                      estudiantes[fila][columna]);
               }
               
           }
        }
        
        System.out.printf("%s",cadena);
    }
}
    
