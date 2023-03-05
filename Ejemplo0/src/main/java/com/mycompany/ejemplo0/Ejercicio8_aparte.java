package com.mycompany.ejemplo0;

import java.util.Scanner;

public class Ejercicio8_aparte {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String frase;
            int longitudF;

            System.out.print("Ingrese una frase: ");
            frase = leer.nextLine();

            longitudF = frase.length();

            if(longitudF==8){
                System.out.println("CORRECTO!!!");
            }else{
                System.out.println("INCORRECTO!!!");
            }
        }

       
    }
}
