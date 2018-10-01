package animacion;


import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    private GraphicsContext gc;//vista
    private Carro carro;//modelo
    public LoopJuego(GraphicsContext gc){
    this.gc = gc;
    this.carro = new Carro(0,200);
    }
    @Override
    public void handle(long l) {
        gc.fillRect(this.carro.getX(),this.carro.getY(), 20, 20);
        
    }


}
