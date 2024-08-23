package org.example;

import java.util.Scanner;

public class Atv3Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nro, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, cont;

        for (cont = 1; cont <= 5; cont++) {
            System.out.print("Informe o " + cont + "º número: ");
            nro = scanner.nextInt();

            if (maior < nro) {
                maior = nro;
            }
            if (menor > nro) {
                menor = nro;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}

