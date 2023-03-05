package ejercicio_extra_guia7;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio1 {
    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

    */
    public static void main(String[] args) {
        Scanner scaner = new Scanner (System.in);
        
        int min;
        double horas, dias;
        
        System.out.println("Ingrese minutos: ");
        min = scaner.nextInt();
        horas = min/60;
        System.out.println( horas);
    }
    
}
