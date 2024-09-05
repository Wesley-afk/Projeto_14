/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author w.rocha
 */
public class Projeto_14 {

//adicionar o tratamento de erros.
    
    public static void main(String[] args) throws IOException {
       DataInputStream [][]dado; dado = new DataInputStream[5][5]; 
        String [][]num_string; num_string = new String[5][5];
         int [][]num_int; num_int = new int[5][5];
          int []soma; soma = new int[5];
           int[]soma_linha; soma_linha = new int[5];
            int w = 0;
          
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Preencha a matriz.");
                 dado[j][i] = new DataInputStream(System.in);
                  num_string[j][i] = dado[j][i].readLine();
                   num_int[j][i] = (int) Float.parseFloat(num_string[j][i]);
            }
        }      
      System.out.println("Matriz usuario: \n");
        for (int i = 0; i < 5; i++) {
            for (w = 0; w < 5; w++) {
                System.out.print(num_int[w][i] + " ");      
                 soma[w] += num_int[w][i];
            }
           try{
            System.out.print("\n---------- soma = " + soma[i] + "\n");
           }
           catch(ArrayIndexOutOfBoundsException e){
               System.out.println(e.getMessage());
                System.out.println(w);
           }
        }
    }
}
