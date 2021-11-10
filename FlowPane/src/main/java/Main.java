import java.io.FileInputStream;
import java.io.InputStream;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
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
        Text text1 = new Text("Este layout divide la interfaz en secciones, pero estas se adaptan al tamaño del elemento y se ordenan segun el tamaño de la pantalla");
        text1.setFont(new Font("Arial Bold", 20));
        
        InputStream stream1 = new FileInputStream("src\\main\\java\\imagenes\\icono1.png");
        Image img1 = new Image(stream1);
        ImageView imgv1 = new ImageView(img1);
        
        InputStream stream2 = new FileInputStream("src\\main\\java\\imagenes\\icono2.png");
        Image img2 = new Image(stream2);
        ImageView imgv2 = new ImageView(img2);
        
        InputStream stream3 = new FileInputStream("src\\main\\java\\imagenes\\icono3.png");
        Image img3 = new Image(stream3);
        ImageView imgv3 = new ImageView(img3);
        
        //Creacion del layout e inicializacion del stage
        FlowPane fp = new FlowPane(Orientation.HORIZONTAL);
        fp.getChildren().addAll(imgv1, imgv2, text1, imgv3);
                
        Scene scn = new Scene(fp);        
        stg.setTitle("FlowPane");
        stg.setHeight(1000);
        stg.setWidth(1850);
        stg.setScene (scn);
        stg.show();
    }
    
}