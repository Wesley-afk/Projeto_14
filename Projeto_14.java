package com.mycompany.projeto14;

import java.io.DataInputStream;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import java.util.Arrays; //me ajuda a organizar arrays

/**
 *
 * @author wpass
 */
public class Projeto14 {

    public static void main(String[] args) throws IOException {
       DataInputStream [][]dado; dado = new DataInputStream [5][5]; 
       String [][]num_string; num_string = new String[5][5];
       int [][]num_int; num_int = new int[5][5];
       int []vetor; vetor = new int[25];
       
       int contador = 0; 

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Preencha a matriz");
                dado[i][j] = new DataInputStream(System.in);
                num_string[i][j] = dado[i][j].readLine();
                num_int[i][j] = (int) Float.parseFloat(num_string[i][j]);
                vetor[contador] = num_int[i][j];
                contador++;
            }
        }
           //Exibindo a maotriz digitada pelo meu usuário
          System.out.println("Matriz usuario: \n");
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(num_int[j][k] + " ");
                }
                System.out.println("\n-----\n");
            }
        Arrays.sort(vetor); 
        contador = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num_int[i][j] = vetor[contador];
                contador++;
            }
        }
        System.out.println("Matriz em ordem crescente: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num_int[i][j] + " ");
            }
            System.out.println("\n-----\n");
        }
        //exbir somas de linha e coluna
        
     }
}
