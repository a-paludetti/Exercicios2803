/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_28_03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aline.poliveira3
 */
public class Es02_01 {

    public static void main(String[] args) {
        //Escreva um programa que peça Login e Senhae valide a autorização de 
        // de acordo com a tabela:
        //   Usuario | Senha
        // guilherme | 0f5
        //      jair | 0706
        String login = JOptionPane.showInputDialog(null, "Usuário: ");
        String senha = JOptionPane.showInputDialog(null, "Senha: ");

        login = login.trim();

        boolean autorizado = (login.equalsIgnoreCase("guilherme") && senha.equals("0f5")) || login.equalsIgnoreCase("jair") && senha.equals("0706");

        if (autorizado) {
            JOptionPane.showMessageDialog(null, "Bem Vindo " + login);
        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha inválidos.");
        }

    }
}
