



package animacion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 *
 * @author Estudiante
 */
public class Tablero extends Application{
   

    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
        Canvas canvas= new Canvas(300,300);
        panel.getChildren().add(canvas);
        Scene scene = new Scene (panel,300,300);
        //referencia del lapiz para dibujar sobre
        //el canvas
        GraphicsContext gc = 
                canvas.getGraphicsContext2D();
        
       
        stage.setTitle("Ejemplo Canvas");
        stage.setScene(scene);
        stage.show();
        
       /* gc.fillRect(10,10,20,20);
        gc.setFill(Color.BLUE);
        gc.fillOval(30, 30, 50, 50);
        gc.strokeLine(15, 15, 40, 40);
        */
        /*double  xpoints[] = {10,20,20,10};
        double ypoints[] = {30,30,15,30};
        gc.strokePolygon(xpoints, ypoints, xpoints.length);
        gc.strokeRect(30, 30, 15, 15);*/
        LoopJuego loop = new LoopJuego(gc);
        loop.start();
    }

    public static void main(String[] args){
    Application.launch();
}
}
