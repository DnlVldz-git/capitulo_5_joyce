/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el numero: ");
        int num = leer.nextInt();
        
        if(num%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es inpar");
        }
    }
}
