package com.mycompany.ejemplo0;

import java.util.Scanner;

public class Ejemplo {
    
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int num;
            char simbolo = '*';

            for(int i = 0; i < 4; i++){
                System.out.println("Ingrese un numero");
                num = leer.nextInt();
                
                for(int j = 0; j<num; j++){
                    System.out.print(simbolo);
                }
                System.out.println();
            }
        }
    }
}
