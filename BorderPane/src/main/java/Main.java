import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main (String[] args){
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stg) throws Exception {
        
        //Creacion de las formas                
        Text text1 = new Text("Este layout divide la interfaz en secciones, esta es la seccion superior");
        text1.setFont(new Font("Arial Bold", 20));
        
        Text text2 = new Text("Seccion izquierda");
        text2.setFont(new Font("Arial Bold", 20));
        
        Text text3 = new Text("Seccion derecha");
        text3.setFont(new Font("Arial Bold", 20));
        
        Text text4 = new Text("Seccion inferior");
        text4.setFont(new Font("Arial Bold", 20));
        
        Text text5 = new Text("Seccion central");
        text5.setFont(new Font("Arial Bold", 20));

        //Creacion del layout e inicializacion del stage
        BorderPane bp = new BorderPane();
        
        bp.setTop(text1);
        BorderPane.setAlignment(text1, Pos.CENTER);
        BorderPane.setMargin(text1, new Insets(50,0,0,0));
        
        bp.setLeft(text2);
        BorderPane.setAlignment(text2, Pos.CENTER);
        BorderPane.setMargin(text2, new Insets(0,0,0,50));
        
        bp.setRight(text3);
        BorderPane.setAlignment(text3, Pos.CENTER);
        BorderPane.setMargin(text3, new Insets(0,50,0,0));
        
        bp.setBottom(text4);
        BorderPane.setAlignment(text4, Pos.CENTER);
        BorderPane.setMargin(text4, new Insets(0,0,50,0));
        
        bp.setCenter(text5);
        
        Scene scn = new Scene(bp);
        stg.setTitle("BorderPane");
        stg.setHeight(1000);
        stg.setWidth(1850);
        stg.setScene (scn);
        stg.show();
    }
    
}