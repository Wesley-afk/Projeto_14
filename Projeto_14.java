package com.mycompany.projeto14;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays; //me ajuda a organizar arrays
import java.util.ArrayList; //permite que eu tenha um array dinamico

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
       int []soma_linha; soma_linha = new int[5];
       int []vetor_coluna; vetor_coluna = new int[5];
       ArrayList<Integer> num_repetido = new ArrayList<>();
       ArrayList<Integer> contagem = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Preencha a matriz");
                dado[i][j] = new DataInputStream(System.in);
                num_string[i][j] = dado[i][j].readLine();
                num_int[i][j] = (int) Float.parseFloat(num_string[i][j]);
                soma_linha[i] += num_int[i][j];   
                vetor[contador] = num_int[i][j];
                contador++;
                vetor_coluna[j] += num_int[i][j];
            }
        }
           //Exibindo a matriz digitada pelo meu usuário
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
        //matriz em ordem crescente + soma
        System.out.println("Matriz em ordem crescente: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num_int[i][j] + " ");
             //verificando a existência de numeros repetidos.
              /**  if(num_int[i][j] == num_int[i + 1][j + 1]){
                    contagem.set(i, + 1);
                   num_repetido.set(i, num_int[i][j]);
                }*/
            }
            System.out.print(" Soma = " + soma_linha[i]);
            System.out.println("\n-----------------\n");
        }
        for (int i = 0; i < 5; i++) {
             System.out.print(vetor_coluna[i] + " ");
        }/*
        for (int i = 0; i < num_repetido.size() ; i++) { //com array.size com a biblioteca java.util.ArrayList, 
            System.out.println("Numeros repetidos = " +num_repetido); //permite com que eu use o array.size para descobrir o tamanho da matriz.
            System.out.println("Quantas vezes repetiram = " + contagem);*/
    }
 }
