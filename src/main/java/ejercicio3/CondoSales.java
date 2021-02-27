/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author dani
 */


public class CondoSales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int resp = leer.nextInt();
        double price;
        switch (resp) {
            case 1:
                System.out.println("Park view\n$150,000");
                price = 150000;
                break;
            case 2:
                System.out.println("Golf course\n$170,000");
                price = 170000;
                break;
            case 3:
                System.out.println("Lake view\n$210,000");
                price = 210000;
                break;
            default:
                System.out.println("Invalid");
                price = 0;
                break;
        }
        
        
    }
    
}
