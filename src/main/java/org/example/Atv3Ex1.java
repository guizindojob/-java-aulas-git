package org.example;

import java.util.Scanner;

public class Atv3Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, soma = 0;
        int cont;

        for (cont = 0; cont < 5; cont++) {
            System.out.print("Informe o número que você deseja somar: ");
            x = scanner.nextDouble();
            soma += x;
        }

        System.out.println("O somatório deu: " + soma);
        scanner.close();
    }
}

