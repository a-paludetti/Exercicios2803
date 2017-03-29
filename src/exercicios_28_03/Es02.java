package exercicios_28_03;

import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aline.poliveira3
 */
public class Es02 {

    public static void main(String[] args) {
        //Escreva um programa que peça Login e Senhae valide a autorização de 
        // de acordo com a tabela:
        //   Usuario | Senha
        // guilherme | 0f5
        //      jair | 0706

        Scanner NN = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog(null, "Usuário: ");
        String senha = JOptionPane.showInputDialog(null, "Senha: ");

        if (nome.equalsIgnoreCase("guilherme") && senha.equals("0f5")) {
            JOptionPane.showMessageDialog(null, "Bem Vindo Guilherme");
        } else if (nome.equalsIgnoreCase("jair") && senha.equals("0706")) {
            JOptionPane.showMessageDialog(null, "Bem Vindo Jair.");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido");
        }
    }
}
