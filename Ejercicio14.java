package ejerciciosparte3;
import java.util.Scanner;

public class Ejercicio14 {

    private static Scanner intro;
    public static void main (String[] args) {
    
    float p1, p2, p3, pT;
    float pp1, pp2, pp3,
    
    Scanner intro = new Scanner (System.in);
    
    do{
        System.out.println("Ingrese la cantidad aportada por el primer amigo: ");
        p1 = intro.nextFloat();
        if(p1<=0){
            System.out.println("Monto invalido, ingreselo nuevamente.");
        }
    }while(p1<=0);
    
    do{
        System.out.println("Ingrese la cantidad aportada por el segundo amigo: ");
        p2 = intro.nextFloat();
        if(p2<=0){
            System.out.println("Monto invalido, ingreselo nuevamente.");
        }
    }while(p2<=0);
    
    do{
        System.out.println("Ingrese la cantidad aportada por el tercer amigo: ");
        p3= intro.nextFloat();
        if(p3<=0){
            System.out.println("Monto invalido, ingreselo nuevamente.");
        }
    }while(p3<=0);
    {
    pT = p1+p2+p3;
    pp1 = (p1*100)/pT;
    pp2 = (p2*100)/pT;
    pp3 = (p3*100)/pT;
    }
    System.out.println("El porcentaje aportado por el primer amigo es de " +pp1);
    System.out.println("El porcentaje aportado por el segundo amigo es de " +pp2);
    System.out.println("El porcentaje aportado por el tercer amigo es de " +pp3);
}
}