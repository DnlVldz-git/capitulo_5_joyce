/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class EventDemo {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Event[] eventos = new Event[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("N."+(i+1)+" Nombre del evento: ");
            String name = leer.nextLine();
            
            System.out.print("Numero de invitados: ");
            int inv = leer.nextInt();
            leer.nextLine();
            System.out.println("");
            
            Event e1 = new Event(name, inv);
            eventos[i] = e1;
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(eventos[i].eCosto());
            Event.CarlysMotto();
        }
        
        Event p = Event.largerEvent(eventos[0], eventos[1]);
        System.out.println(p.eCosto());
        
        Event q = Event.largerEvent(eventos[1], eventos[2]);
        System.out.println(q.eCosto());
        
        Event r = Event.largerEvent(eventos[0], eventos[2]);
        System.out.println(r.eCosto());
        
    }
    
}
