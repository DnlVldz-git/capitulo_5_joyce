/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class Temperatures {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la temperatura alta");
        int high = leer.nextInt();
        System.out.println("Introduzca la temperatura baja");
        int low = leer.nextInt();
        
        if (high >= 90) {
            System.out.println("Heat Warning");            
        }else if(low <= 32){
            System.out.println("Freeze Warning");
        }
        
        if ((high-low)>40) {
            System.out.println("Large temperature swing");
        }
    }
}
