package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
     * La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        float temp, F;

        System.out.println("A que temperatura se encuentra? (ingrese en grados centrigrados)");
        temp = scaner.nextFloat();

        F = 32 + (9 * temp/5);

        System.out.println("------------------------------------------------------------------");
        System.out.println("El equivalente en grados Fahrenheit es: " + F);
        
    }
}
