/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_28_03;

import javax.swing.JOptionPane;

/**
 *
 * @author aline.poliveira3
 */
public class Es03 {

    public static void main(String[] args) {
//Escreva um programa em Java que lê as notas de duas provas de um aluno e calcula sua média.
//Se o aluno tiver média maior ou igual a 6,0, ele passa. Caso contrário, ele fará mais uma prova.
//Nesse caso, o programa deve ler essa terceira nota e recalcular a média, 
// substituindo a menor nota entre P1 e P2 pela nota da P3.
//Indique a nova média do aluno e se ela conseguiu passar ou não.
//Atenção: se o aluno fizer a P3, sua média máxima é 6,0.

        double P1 = Integer.parseInt(JOptionPane.showInputDialog(null, "nota de P1:"));
        double P2 = Integer.parseInt(JOptionPane.showInputDialog(null, "nota de P2:"));

        double media = (P1 + P2) / 2;

        boolean aprovado = media >= 6.0;

        if (aprovado) {
            JOptionPane.showMessageDialog(null, "Passou, média " + media);
        } else {
            double P3 = Integer.parseInt(JOptionPane.showInputDialog(null, "nota de P3:"));
            if (P1 > P2) {
                P2 = P3;
                media = (P1 + P2) / 2;
            } else {
                P1 = P3;
                media = (P1 + P2) / 2;
            }
            boolean aprovado2 = media >= 6.0;
            if (aprovado2) {
                media = 6.0;
                JOptionPane.showMessageDialog(null, "Passou, média " + media);
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado.");
            }
        }
    }
}
