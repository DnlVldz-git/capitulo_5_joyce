/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone5;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        
        Computadora comp = new Computadora();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca su jugada: (1) ROCA, (2) PAPEL, (3)TIJERAS");
        int n_j = leer.nextInt();
        
        System.out.println(comp);
        
        comp.juego(n_j);
        
        
        
        
        
    }
}
