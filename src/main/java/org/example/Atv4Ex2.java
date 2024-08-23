package org.example;

import java.util.Scanner;

public class Atv4Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salario = new double[5];
        int x;

        for (x = 0; x < 5; x++) {
            System.out.print("Informe o " + (x + 1) + "º salário: ");
            salario[x] = scanner.nextDouble();

            if (salario[x] < 1500) {
                salario[x] += salario[x] * 0.1;
            }
        }

        System.out.println("Lista de salários:");
        for (x = 0; x < 5; x++) {
            System.out.println((x + 1) + "° salário é R$ " + salario[x]);
        }

        scanner.close();
    }
}

