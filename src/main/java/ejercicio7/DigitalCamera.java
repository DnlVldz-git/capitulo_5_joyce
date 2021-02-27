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
public class DigitalCamera {
    private String brand;
    private int n_pix;
    private double price;
    
    public DigitalCamera(String brand, int n_pix){
        this.brand = brand;
        if(n_pix >10){
            this.n_pix = 10;
        }else{
            this.n_pix = n_pix;
        }
        if(n_pix<=6){
            this.price = 99;
        }else{
            this.price = 129;
        }
    }

    @Override
    public String toString() {
        return "DigitalCamera{" + "brand=" + brand + ", n_pix=" + n_pix + ", price=" + price + '}';
    }
    
    
    
}
