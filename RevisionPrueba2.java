package com.company;

import java.util.Scanner;

public class RevisionPrueba2 {
    public static void main(String[] args) {
        int n1 = entrada();
        int n2 = entrada();
        int primo1 = nuevoPrimo(n1);
        int primo2 = nuevoPrimo(n2);
        double contraseñaA = contA(primo1, primo2);
        double contraseñaB = contB(n1, n2);
        resultados(primo1, primo2, contraseñaA, contraseñaB);
    }

    public static void resultados(int p1, int p2, double cA, double cB) {
        System.out.println("---------------------");
        System.out.println("Primo 1:    " + p1);
        System.out.println("Primo 2:    " + p2);
        System.out.println("ContraseñaA:    " + cA);
        System.out.println("ContraseñaB:    " + cB);
        System.out.println("---------------------");
    }

    public static int entrada() {
        int numero = 0;
        do {
            try {
                System.out.println("Ingresa un numero mayor a 20");
                Scanner teclado = new Scanner(System.in);
                numero = teclado.nextInt();
                if (numero < 20) {
                    System.out.println("Numero < 20");
                }
            } catch (Exception e) {
                System.out.println("Numero invalido");
            }
        } while (numero < 20);
        return numero;
    }

    public static int nuevoPrimo(int n) {
        int nprimo = 1;
        int contador2 = 0;
        do {
            int contador = 0;
            nprimo++;
            for (int i = 1; i <= nprimo; i++) {
                if ((nprimo % i) == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                contador2++;
            }
        }while (contador2 < n);
        return nprimo;
    }

    public static double contA(int p1, int p2) {
        double c = Math.pow(p1, 2) * Math.pow(p2, 2);
        return c;
    }

    public static double contB(int n1, int n2) {
        double c = Math.pow(n1, 3) + Math.pow(n2, 3);
        return c;
    }
}