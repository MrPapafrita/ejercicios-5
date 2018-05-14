package desafio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DesafioPc {

    public static int cantPC() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de computadores: ");
        int cantPc = intro.nextInt();
        return cantPc;
    }

    public static boolean[] inicializarEstado(int cantidadPc) {
        boolean estado[] = new boolean[cantidadPc];
        for (int i = 0; i < estado.length; i++) {
            estado[i] = false;
        }
        return estado;
    }

    public static int menu() {
        int accion;
        String input = JOptionPane.showInputDialog("Menú:\n1. Mostrar estado de los computadores.\n2.Reservar computador\n3. Cancelar reserva\n4.Terminar progama. ");
        accion = Integer.parseInt(input);

        return accion;
    }

    public static void accion1(boolean []estado) {
        
        for (int i = 0; i < estado.length; i++) {
            if (estado[i] == false) {
                JOptionPane.showMessageDialog(null, "Pc nº" + (i + 1) + ": disponible");
            } else if (estado[i] == true) {
                JOptionPane.showMessageDialog(null, "Pc nº" + (i + 1) + ": ocupado");
            }
        }
    }
    public static void accion2(boolean[]estado){
        String input = JOptionPane.showInputDialog("Reserva\nIngresa el numero del Pc que a reservar");
        int i = Integer.parseInt(input);
        estado[i]=true;
    }
    public static void accion3(boolean[]estado){
        String input = JOptionPane.showInputDialog("Cancelación\nIngresa el numero del Pc que al que se le cancela la reserva");
        int i = Integer.parseInt(input);
        estado[i]=false;
    }

    public static void main(String[] args) {
        int cantidadPC = cantPC();
        int vector[] = new int[cantidadPC];
        boolean estado[] = inicializarEstado(cantidadPC);
        int accion =0;
        do {
        accion = menu();
            switch (accion) {
                case 1:
                    accion1(estado);
                    break;
                case 2:
                    accion2(estado);
                    break;
                case 3:
                    accion3(estado);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Apagando...");
                    break;
            }

}while(accion !=4);
}
}
