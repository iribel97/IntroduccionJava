/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio14 {
    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
    El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String moneda;
        double euro;
        
        System.out.print("Ingrese la cantidad en euros: ");
        euro = leer.nextDouble();
        
        System.out.println("A que moneda desea convertir? (dolares, yenes, libras)");
        moneda = leer.next();
        
        ConvertirMoneda(euro, moneda);
    }
    
    public static void ConvertirMoneda(double e, String m){
        switch(m.toLowerCase()){
            case "dolares", "dolar":
                System.out.println("En dolares seria $: " + String.format("%.2f",(e*1.28611)) );
                break;
            case "yenes", "yen":
                System.out.println("En yenes seria ¥: " +String.format("%.2f",(e*129.852)) );
                break;
            case "libras", "libra":
                System.out.println("En libras sera £:" + String.format("%.2f",(e*0.86)));
                break;
            default:
                System.out.println("Moneda no encontrada");
        }
    }
    
}
