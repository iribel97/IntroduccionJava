package com.mycompany.ejemplo0;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            float num1, num2;

            System.out.print("Ingrese un numero: ");
            num1 = leer.nextFloat();
            System.out.print("Ingrese otro numero: ");
            num2 = leer.nextFloat();

            EsMultiplo(num1, num2);
        }

    }

    /*
     * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
     * validando que el primer numero múltiplo del segundo 
     * e imprima si el primer numero es múltiplo del segundo, 
     * sino informe que no lo son.
     */

     public static void EsMultiplo(float x, float y){
        if(x%y == 0){
            System.out.println("El primer numero es multiplo del segundo");
        }else{
            System.out.println("El primer nuero no es multiplo del segundo");
        }
     }
}
