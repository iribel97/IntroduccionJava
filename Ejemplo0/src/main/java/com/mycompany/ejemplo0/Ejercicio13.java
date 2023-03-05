package com.mycompany.ejemplo0;

import java.util.Scanner;

public class Ejercicio13 {
    /*
     * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
     * y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int cant, cont;


            System.out.print("Cuantas personas hay en el equipo: ");
            cant = leer.nextInt();
            leer.nextLine();

            String[] nombres = new String[cant];

            for(int i = 0; i < cant; i++){
                System.out.println("Ingrese el nombre del integrante #" );
                nombres[i] = leer.nextLine();
                
            }

            System.out.println("---------------------------------------------");
            cont = 1;
            System.out.println("Los nombres de los integrantes del grupo son:");
            for(int i=0; i<cant; i++){
                System.out.println(cont + ".- " + nombres[i]);
                cont++;
            }
        }
    }
}
