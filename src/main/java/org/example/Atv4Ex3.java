package org.example;

import java.util.Scanner;

public class Atv4Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valor = new double[3];
        double[] subtotal = new double[3];
        double[] quantidade = new double[3];
        double valorTotal = 0.0;
        String[] nome = new String[3];
        int x;

        for (x = 0; x < 3; x++) {
            System.out.print("Informe o nome do produto: ");
            nome[x] = scanner.nextLine();
            System.out.print("Informe a quantidade do produto: ");
            quantidade[x] = scanner.nextDouble();
            System.out.print("Informe o valor do produto: ");
            valor[x] = scanner.nextDouble();
            subtotal[x] = valor[x] * quantidade[x];
            valorTotal += subtotal[x];
            scanner.nextLine(); // Limpar o buffer
        }

        for (x = 0; x < 3; x++) {
            System.out.println("O subtotal do produto " + nome[x] + " é de R$ " + subtotal[x]);
        }

        System.out.println("O valor total é de R$ " + valorTotal);

        scanner.close();
    }
}

