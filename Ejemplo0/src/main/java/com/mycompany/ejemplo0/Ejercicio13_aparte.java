package com.mycompany.ejemplo0;

import java.util.Scanner;

public class Ejercicio13_aparte {
    /*
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
     * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
     */
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            int cuadrado;

            System.out.print("cuantos cm tiene su cuadrado?(Ingrese una cantidad entera) ");
            cuadrado = leer.nextInt();

            for(int i = 0 ; i < cuadrado ; i++){
                for(int j = 0 ; j < cuadrado ; j++){
                    if(i == 0 || i == (cuadrado-1)){
                        System.out.print(" * ");
                    }else if(j == 0 || j == (cuadrado-1)){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
