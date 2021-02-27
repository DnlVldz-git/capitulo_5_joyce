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
public class Student {
    private double grade_av;
    private int extra;
    private int service;

    public Student(double grade_av, int extra, int service) {
        this.grade_av = grade_av;
        this.extra = extra;
        this.service = service;
    }

    
    
    public double getGrade_av() {
        return grade_av;
    }

    public void setGrade_av(double grade_av) {
        this.grade_av = grade_av;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }
    
    
    
}
