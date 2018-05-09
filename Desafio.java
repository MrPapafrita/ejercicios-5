package desafio;

import java.util.Scanner;

public class Desafio {

    public static void llenarVector(int[] vector, int longitud) {
        int i = 0;
        System.out.println("Ingrese el ");
        Scanner objeto = new Scanner(System.in);
        while (i < longitud) {
            vector[i] = objeto.nextInt();
            i++;

        }
    
    public static int solicitarDimension() {
        Scanner dimencion = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int longitud = dimencion.nextInt();
        return longitud;
    }

    public static void mostrarVector(int[] vector, int longitud) {
        int i = 0;
        System.out.println("Los valores de su vector son:");
        for (i = 0; i < longitud; i++) {
            System.out.println(vector[i]);
        }
    }

    public static boolean determinarPar(int[] vector, int longitud) {
        int i = 0, par = 0;
        do {
            if (vector[i] % 2 == 0) {
                par=par+1;
            }
            i++;
        } while (i < longitud);
        return false;
    }

    public static void main(String[] args) {
        int longitud = solicitarDimension();
        int par = determinarPar();
        solicitarDimension();

        int vector[] = new int[longitud];
        llenarVector(vector, longitud);
        determinarPar(vector, longitud);
    }

}
