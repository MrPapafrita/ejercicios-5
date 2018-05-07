package ejerciciofunciones;
import java.util.Scanner;
import java.util.Random;

public class EjercicioFunciones {

    public static void funcion1(int[] arreglo, int valor) {
        int i = 0;

        Scanner objeto = new Scanner(System.in);
        while (i < valor) {
            arreglo[i] = objeto.nextInt();
            i++;
        }
    }

    public static void funcion2(int[] arreglo, int valor) {
        int i = 0;

        while (i < valor) {

            System.out.println(arreglo[i] + "-");
            i++;
        }
    }

    public static boolean funcion3(int[] arreglo, int valor, int valor2) {
        int i = 0;

        while (i < valor) {
            if (arreglo[i] == valor2) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void funcion4(int[] arreglo, int valor) {
        int i = 0, j, x;

        while (i < valor) {
            j = i + 1;
            while (j < valor) {
                if (arreglo[i] > arreglo[j]) {
                    x = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = x;
                }
                j++;
            }
            i++;
        }
    }
    public static void main (String[] args){ 
        int valor;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        valor = x.nextInt();
        
        int vector[]= new int [valor]; 
        
        funcion1(vector,valor);
        
        System.out.println("Ingrese el numero que desea comprobar");
        int valor2 = x.nextInt();
        
        funcion3(vector,valor, valor2);
        if(funcion3=false){
            System.out.println("El numero ingresado no se encuentra");
        }else if{
            System.out.println("El numero ingresado se encuentra el vector");
        }
        
        }
    }

