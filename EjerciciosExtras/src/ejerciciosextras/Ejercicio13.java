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
public class Ejercicio13 {

    /*
    Crear un programa que dibuje una escalera de números, donde cada línea de números
    comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
    usuario al comenzar. Ejemplo: si se ingresa el número 3: 
    */
    public static void main(String[] args) {
       
        Scanner scaner = new Scanner(System.in);
        
        //Variable que guarde la altura
        int H;
        
        //Variable contador
        int cont = 0;
        
        //Variable que sume
        int sum = 0;
        
        //Pedir al usuario la altura
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese la altura: ");
        H = scaner.nextInt();
        System.out.println("--------------------------------------------------");
        while(cont != H){
            cont++;
            sum = sum*10 + cont;
            System.out.println(sum);
        }
        System.out.println("--------------------------------------------------");
    }
    
}
