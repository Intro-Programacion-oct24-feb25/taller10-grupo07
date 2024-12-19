/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
            double[][] notasCuantitativas = {
                {7.1, 8, 10},
                {3, 7, 9},
                {10, 9, 2.1}
            };
            String[][] notasCualitativas = new String[3][3];

            /*
        Rango de notas cualitativas:
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente
             */
            for (int i = 0; i < notasCuantitativas.length; i++) {
                for (int j = 0; j < notasCuantitativas[i].length; j++) {
                    double nota = notasCuantitativas[i][j];

                    if (nota >= 0 && nota <= 2.9) {
                        notasCualitativas[i][j] = "Insuficiente";
                    } else if (nota >= 3 && nota <= 4.9) {
                        notasCualitativas[i][j] = "Regular";
                    } else if (nota >= 5 && nota <= 7.9) {
                        notasCualitativas[i][j] = "Buena";
                    } else if (nota >= 8 && nota <= 9.5) {
                        notasCualitativas[i][j] = "Muy Buena";
                    } else if (nota > 9.5 && nota <= 10) {
                        notasCualitativas[i][j] = "Sobresaliente";
                    } else {
                        notasCualitativas[i][j] = "Nota inválida";
                    }

                    // Mostrar la nota y su condición cualitativa
                    System.out.printf("Nota: %.1f - Condición: %s\n", nota, notasCualitativas[i][j]);
                }
            }
        }
    }

