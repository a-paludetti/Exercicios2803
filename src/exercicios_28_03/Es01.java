/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_28_03;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Es01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escreva um programa que lê um número de 1-12, mostra o seu dobro e
        // valida a entrada.

        Scanner NN = new Scanner(System.in);
        //Entradas
        System.out.println("Escrea um número entre 1 e 12");
        int numero = NN.nextInt();

        // processamentos e saídas
        if (numero <= 1 && numero >= 12) {
            System.out.println("Número invalido");
        } else {
            int dobro = numero * 2;
            System.out.printf("O dobro de %S é %S", numero, dobro);
        }
    }

}
