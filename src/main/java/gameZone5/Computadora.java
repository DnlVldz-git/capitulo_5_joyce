/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone5;

import static java.lang.Math.random;


/**
 *
 * @author dani
 */
public class Computadora {
    
    private Mano tiro;
    private int n;
    
    public Computadora(){
        setTiro();
    }
    
    public void setTiro(){
        this.n = ((int) (Math.random() * 100) % 3 + 1);
        switch (this.n) {
            case 1:
                this.tiro = Mano.PIEDRA;
                break;
            case 2:
                this.tiro = Mano.PAPEL;
                break;
            case 3:
                this.tiro = Mano.TIJERA;
        }
    }
    
    public void juego(int n_j){
        if (this.n==n_j) {
            System.out.println("Empate");
        }else if (((this.n==1)&&(n_j==3))||((this.n==3)&&(n_j==2))||((this.n==2)&&(n_j==1))) {
            System.out.println("Ganó la computadora");
        }else if (((n_j==1)&&(this.n==3))||((n_j==3)&&(this.n==2))||((n_j==2)&&(this.n==1))) {
            System.out.println("Gano el jugador");
        }
    }
    
    public Mano getTiro(){
        return this.tiro;
    }

    @Override
    public String toString() {
        return "Computadora{" + "tiro=" + tiro + '}';
    }  
    
}
