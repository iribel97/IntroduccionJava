/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo0;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejemplo0{

    public static void main(String[] args) {
        try (Scanner frase = new Scanner(System.in)) {
            String palabras;

            System.out.println("Ingrese una frase");
            palabras = frase.nextLine();
            System.out.println("La nueva palabra es: " + CambiarPalabra(palabras));
        }
    }

    /**
     * @param palabra
     * @return
     */
    public static String CambiarPalabra(String palabra){

        int x;
        char letra;
        String nuevaP;
        //Saber la longitud de la cadena
        x = palabra.length();
        //Inicializar cadena
        nuevaP = "";
        //recorrer la cadena
        for(int i = 0 ; i<x ; i++ ){
            //Posicion
            letra = palabra.toLowerCase().charAt(i);
            
            switch(letra){
                case 'a':
                letra = '@';
                nuevaP = nuevaP + letra;
                break;
                case 'e':
                letra = '#';
                nuevaP = nuevaP + letra;
                break;
                case 'i':
                letra = '$';
                nuevaP = nuevaP + letra;
                break;
                case 'o':
                letra = '%';
                nuevaP = nuevaP + letra;
                break;
                case 'u':
                letra = '*';
                nuevaP = nuevaP + letra;
                break;
                default:
                nuevaP = nuevaP + letra;
                break;

            }
        }
        return nuevaP;

    }



    
}
