/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author dani
 */
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el promedio");
        double av = leer.nextDouble();
        System.out.println("Introduzca el numero de actividades extra curriculares");
        int extra = leer.nextInt();
        System.out.println("Introduzca el numero de actividades de servicio");
        int serv = leer.nextInt();
        
        Student s1 = new Student(av, extra, serv);
        
        if((s1.getGrade_av()>=3.8)&&(s1.getExtra()>=1)&&(s1.getService()>=1)){
            System.out.println("Scholarship candidate");
        }else if(((s1.getGrade_av()>=3.4)&&(s1.getGrade_av()<=3.8))&&(s1.getExtra()+s1.getService()>=3)){
            System.out.println("Scholarship candidate");
        }else if (( (s1.getGrade_av()>=3.0) && (s1.getGrade_av()<=3.4) ) && (s1.getExtra()>=2) && (s1.getService()>=3)) {
            System.out.println("Scholarship candidate");
        }else{
            System.out.println("Not a candidate");
        }
        
        
        
    }
}
