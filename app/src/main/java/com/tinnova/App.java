/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tinnova;

import com.tinnova.core.Votos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Digite o total de votos:");
        var totalVotos = input.nextInt();
        System.out.println("Digite o total de votos válidos:");
        var validVotos = input.nextInt();
        System.out.println("Digite o total de votos brancos:");
        var blankVotos = input.nextInt();
        System.out.println("Digite o total de votos nulos:");
        var nullVotos = input.nextInt();

        var votos = new Votos(totalVotos, validVotos, blankVotos, nullVotos);

        System.out.println("Resultado da apuração:");
        System.out.printf("Percentual de votos válidos: %.2f\n" +
                "Percentual de votos brancos: %.2f\n" +
                "Percentual de votos nulos: %.2f",
                votos.getValidPercent(), votos.getBlankPercent(), votos.getNullPercent());
    }
}