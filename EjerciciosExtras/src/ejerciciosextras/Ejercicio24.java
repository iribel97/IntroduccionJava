/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio24 {
    /*
    Realizar un programa que complete un vector con los N primeros números de la sucesión
    de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
    números:
    1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        int N;
        
        System.out.print("Cuantos numeros de la serie Fibonacci desea ver? ");
        N = scaner.nextInt();
        
        int[] serieF = new int[N];
        
        //Llenar y mostrar matriz
        for (int i = 0; i < N; i++) {
            if (i <= 1) {
                serieF[i] = 1;
            }else{
                serieF[i] = serieF[i-1] + serieF[i-2];
            }
            System.out.print("[" + serieF[i] + "]");
        }
        System.out.println("");
    }
    
}
