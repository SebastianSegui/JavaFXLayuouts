import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Sphere;
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
        Text text1 = new Text("Este layout ancla sus elementos mediante anclas, y este texto esta anclado arriba a la derecha");
        text1.setFont(new Font("Arial Bold", 20));
        
        Text text2 = new Text("Esto es un texto anclado abajo a la izquierda... CUDADO CON LA BOLA");
        text2.setFont(new Font("Arial Bold", 20));
        
        Sphere sphere = new Sphere(100); 
        
        //Creacion de las animaciones        
        TranslateTransition translate = new TranslateTransition(Duration.millis(2000));
        translate.setToX(1600);
        
        ParallelTransition transition1 = new ParallelTransition(sphere, translate);
        transition1.setCycleCount(Timeline.INDEFINITE);
        transition1.setAutoReverse(true);
        transition1.play();
        
        //Creacion del layout e inicializacion del stage
        AnchorPane ap = new AnchorPane();
        ap.getChildren().addAll(text1, text2, sphere);
        
        AnchorPane.setRightAnchor(text1, 50.0);
        AnchorPane.setTopAnchor(text1, 10.0);
        
        AnchorPane.setLeftAnchor(text2, 50.0);
        AnchorPane.setBottomAnchor(text2, 10.0);
        
        AnchorPane.setLeftAnchor(sphere, 10.0);
        AnchorPane.setBottomAnchor(sphere, 10.0);
                
        Scene scn = new Scene(ap);        
        stg.setTitle("AnchorPane");
        stg.setHeight(1000);
        stg.setWidth(1850);
        stg.setScene (scn);
        stg.show();
    }
    
}