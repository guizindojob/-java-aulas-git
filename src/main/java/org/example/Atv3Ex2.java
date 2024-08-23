package org.example;

import java.util.Scanner;

public class Atv3Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont, x, res;

        System.out.print("Informe o número que deseja obter a tabuada da multiplicação: ");
        x = scanner.nextInt();
        System.out.println("TABUADA DO " + x);

        for (cont = 1; cont <= 10; cont++) {
            res = cont * x;
            System.out.println(cont + " X " + x + " = " + res);
        }

        scanner.close();
    }
}

