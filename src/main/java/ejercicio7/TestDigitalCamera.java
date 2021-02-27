/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author dani
 */
import java.util.Scanner;

public class TestDigitalCamera {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la marca de la cámara:");
        String marca = leer.nextLine();
        System.out.println("Introduzca los megapixeles de la cámara");
        int pix = leer.nextInt();
        
        DigitalCamera camara1 = new DigitalCamera(marca, pix);
        
        
        System.out.println(camara1);
    }
}
