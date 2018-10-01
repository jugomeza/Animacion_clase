/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int x;
    private int y;
    private Llanta[] llantas;
    private Chasis chasis;
    
    public Carro(int x,int y){
    this.llantas = new Llanta[2];
    this.llantas[0] = new Llanta(x,y);
    this.llantas[1] = new Llanta(x,y);
    this.chasis = new Chasis(x,y);

    }
 public void mover(){
    this.x=x++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getyM() {
        return y;
    }

    public void setyM(int yM) {
        this.y = y;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    
}
