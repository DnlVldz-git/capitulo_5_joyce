/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author dani
 */
public class TwelveDays {

    private Integer day;
    private final String VERSO = "On a day Christmas my true love gave to me";
    private final String DIA1 = "A partridge in a pear tree";
    private final String DIA2 = "Two turtle doves ";
    private final String DIA3 = "Three French hens";
    private final String DIA4 = "Four calling birds";
    private final String DIA5 = "Five gold rings";
    private final String DIA6 = "Six geese a laying";
    private final String DIA7 = "Seven swans a swimming";
    private final String DIA8 = "Eight maids a milking";
    private final String DIA9 = "Nine ladies dancing";
    private final String DIA10 = "Ten lords a leaping";
    private final String DIA11 = "Eleven pipers piping";
    private final String DIA12 = "Twelve drummers drumming";

    public TwelveDays() {
        this.day = 1;
    }

    public void diaMas(){
        this.day=this.day+1;
        if(this.day>12){
            this.day=1;
        }
    }
    public void setDia(Integer day){
        this.day=day;
    }
    
    public void getCancion(){
        System.out.println(VERSO);
        System.out.println(this.getVerso(this.day));
    }
    
    private String getVerso(Integer n){
        if(n==1){
            return this.DIA1;
        }else{
            return getVerso(n-1)+"\n"+getParrafo(n);
        }
    }
    
    private String getParrafo(Integer n){
        switch(n){
            case 12: 
                return DIA12;
            case 11:
                return DIA11;
            case 10:
                return DIA10;
            case 9: 
                return DIA9;
            case 8:
                return DIA8;
            case 7:
                return DIA7;
            case 6:
                return DIA6;
            case 5: 
                return DIA5;
            case 4:
                return DIA4;
            case 3: 
                return DIA3;
            case 2: 
                return DIA2;
            default:
                return "No hay más";               
            
            
                
        }
                
    }
}