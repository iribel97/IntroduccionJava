package com.mycompany.ejemplo0;

import java.util.Scanner;

public class Ejercicio9_aparte {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String frase;

            System.out.print("Ingrese una frase o palabra: ");
            frase = leer.nextLine();


           if(frase.substring(0,1).equals("A")){
                System.out.println("CORRECTO!!");
            }else{
                System.out.println("INCORRECTO!!");
            }
            if(frase.charAt(0) == 'A'){
                System.out.println("CORRECTO!!");
            }else{
                System.out.println("INCORRECTO!!");
            }
        }
    }
}
