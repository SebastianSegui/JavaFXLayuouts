import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    
    public static void main (String[] args){
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stg) throws Exception {
        
        //Creacion de las formas
        Rectangle rec = new Rectangle(100, 150);
        rec.setFill(Color.RED);
                
        Text text1 = new Text("Este layout centra por defecto, pero este texto tiene aplicado el alineamiento arriba al centro... Y CRECE");
        text1.setFont(new Font("Arial Bold", 20));
        
        Text text2 = new Text("Esto es un texto delante de una forma con el alineamiento por defecto... MIRA QUE COLORES");
        text2.setFont(new Font("Arial Bold", 20));
        text2.setFill(Color.BLUE);
        
        Text text3 = new Text("Y esto es un texto aburrido con el alineamiento abajo a la derecha...");
        text3.setFont(new Font("Arial Bold", 20));
        
        //Creacion de las animaciones
        FillTransition fill1 = new FillTransition(Duration.millis(500));
        fill1.setToValue(Color.YELLOW);
        FillTransition fill2 = new FillTransition(Duration.millis(500));
        fill2.setToValue(Color.PINK);
        
        RotateTransition rotate = new RotateTransition(Duration.millis(500));
        rotate.setToAngle(720);
        
        ScaleTransition scale = new ScaleTransition (Duration.millis(2000));
        scale.setToX(1.5);
        scale.setToY(1.5);
        
        ParallelTransition transition1 = new ParallelTransition(rec, fill1, rotate);
        transition1.setCycleCount(Timeline.INDEFINITE);
        transition1.setAutoReverse(true);
        transition1.play();
        
        ParallelTransition transition2 = new ParallelTransition(text1, scale);
        transition2.setCycleCount(Timeline.INDEFINITE);
        transition2.setAutoReverse(true);
        transition2.play();
        
        ParallelTransition transition3 = new ParallelTransition(text2, fill2);
        transition3.setCycleCount(Timeline.INDEFINITE);
        transition3.setAutoReverse(true);
        transition3.play();

        //Creacion del layout e inicializacion del stage
        StackPane sp = new StackPane();
        sp.getChildren().addAll(rec, text1, text2, text3);
        
        sp.setAlignment(text1, Pos.TOP_CENTER);
        
        sp.setAlignment(text3, Pos.BOTTOM_RIGHT);
                
        Scene scn = new Scene(sp);
        stg.setTitle("StackPane");
        stg.setHeight(1000);
        stg.setWidth(1850);
        stg.setScene (scn);
        stg.show();
    }
    
}