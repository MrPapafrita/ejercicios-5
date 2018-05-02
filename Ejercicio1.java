package revicion.prueba;

import java.util.Scanner;

class Ejercicio1 {

    public static int tienda1(int cL1, int cG1, int cM1) {
        int cantP1 = cL1 + cG1 + cM1;
        return cantP1;
    }

    public static int leve1(int cL1) {
        int cLP1 = cL1 * 1200;
        return cLP1;
    }

    public static int leve2(int cL2) {
        int cLP2 = cL2 * 1200;
        return cLP2;
    }

    public static int leve3(int cL3) {
        int cLP3 = cL3 * 1200;
        return cLP3;
    }

    public static int grave1(int cG1) {
        int cGP1 = cG1 * 5000;
        return cGP1;
    }

    public static int grave2(int cG2) {
        int cGP2 = cG2 * 5000;
        return cGP2;
    }

    public static int grave3(int cG3) {
        int cGP3 = cG3 * 5000;
        return cGP3;
    }

    public static int mayor1(int cM1) {
        int cMP1 = cM1 * 15000;
        return cMP1;
    }

    public static int mayor3(int cM3) {
        int cMP3 = cM3 * 15000;
        return cMP3;
    }

    public static int mayor2(int cM2) {
        int cMP2 = cM2 * 15000;
        return cMP2;
    }

    public static int tienda2(int cL2, int cG2, int cM2) {
        int cantP2 = cL2 + cG2 + cM2;
        return cantP2;
    }

    public static int tienda3(int cL3, int cG3, int cM3) {
        int cantP3 = cL3 + cG3 + cM3;
        return cantP3;
    }

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int cantP1 = 0;
        int cantP2 = 0;
        int cantP3 = 0;
        System.out.println("Ingresa la cantidad de problemas leves en la primera tienda: ");
        int cantL1 = intro.nextInt();
        System.out.println("Ingresa la cantidad de problemas graves de la primera tienda: ");
        int cantG1 = intro.nextInt();
        System.out.println("Ingresa la cantidad de problemas mayores de la primera tienda: ");
        int cantM1 = intro.nextInt();
        cantP1 = tienda1(cantL1, cantG1, cantM1);
        int cLP1 = leve1(cantL1);
        int cGP1 = grave1(cantG1);
        int cMP1 = mayor1(cantM1);
        int coste1 = cLP1 + cGP1 + cMP1;
        System.out.println("El numero de problemas en la primera tienda es de: " + cantP1);
        System.out.println("El numero de problemas leves es de: " + cantL1 + ", teniendo un coste de reparacion de: " + cLP1);
        System.out.println("El numero de problemas graves es de: " + cantG1 + ", teniendo un coste de reparacion de: " + cGP1);
        System.out.println("El numero de problemas mayores es de: " + cantM1 + ", teniendo un coste de reparacion de: " + cMP1);
        System.out.println("Tenindo un coste total de reparacion de :" + coste1);

        System.out.println("Ingresa la cantidad de problemas leves de la segunda tienda");
        int cantL2 = intro.nextInt();
        System.out.println("Ingresa la cantidad de problemas graves de la segunda tienda");
        int cantG2 = intro.nextInt();
        System.out.println("Ingresa la cantidad de problemas mayores de la segunda tienda");
        int cantM2 = intro.nextInt();
        cantP2 = tienda2(cantL2, cantG2, cantM2);
        int cLP2 = leve2(cantL2);
        int cGP2 = grave2(cantG2);
        int cMP2 = mayor2(cantM2);
        int coste2 = cLP2 + cGP2 + cMP2;
        System.out.println("El numero de problemas en la segunda tienda es de: " + cantP2);
        System.out.println("El numero de problemas leves es de: " + cantL2 + ", teniendo un coste de reparacion de: " + cLP2);
        System.out.println("El numero de problemas graves es de: " + cantG2 + ", teniendo un coste de reparacion de: " + cGP2);
        System.out.println("El numero de problemas mayores es de: " + cantM2 + ", teniendo un coste de reparacion de: " + cMP2);
        System.out.println("Tenindo un coste total de reparacion de :" + coste2);

        System.out.println("Ingresa la cantidad de problemas leves de la tercera tienda");
        int cantL3 = intro.nextInt();
        System.out.println("Ingresa la cantidad de problemas graves de la tercera tienda");
        int cantG3 = intro.nextInt();
        System.out.println("Ingresa la cantidad de problemas mayores de la tercera tienda");
        int cantM3 = intro.nextInt();
        cantP3 = tienda3(cantL3, cantG3, cantM3);
        int cLP3 = leve3(cantL3);
        int cGP3 = grave3(cantG3);
        int cMP3 = mayor3(cantM3);
        int coste3 = cLP3 + cGP3 + cMP3;
        System.out.println("El numero de problemas en la tercera tienda es de: " + cantP3);
        System.out.println("El numero de problemas leves es de: " + cantL3 + ", teniendo un coste de reparacion de: " + cLP3);
        System.out.println("El numero de problemas graves es de: " + cantG3 + ", teniendo un coste de reparacion de: " + cGP3);
        System.out.println("El numero de problemas mayores es de: " + cantM3 + ", teniendo un coste de reparacion de: " + cMP3);
        System.out.println("Tenindo un coste total de reparacion de :" + coste3);
    }

}
