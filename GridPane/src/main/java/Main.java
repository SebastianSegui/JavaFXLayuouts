import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
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
        Text text1 = new Text("Ocupo 4");
        text1.setFont(new Font("Arial Bold", 20));
        text1.setFill(Color.RED);
        
        Text text2 = new Text("Ocupo 1");
        text2.setFont(new Font("Arial Bold", 20));
        
        Text text3 = new Text("Ocupo 1");
        text3.setFont(new Font("Arial Bold", 20));
        
        Text text4 = new Text("Ocupo 1");
        text4.setFont(new Font("Arial Bold", 20));
        
        Text text5 = new Text("Ocupo 1");
        text5.setFont(new Font("Arial Bold", 20));
        
        Text text6 = new Text("Ocupo 1");
        text6.setFont(new Font("Arial Bold", 20));
        
        Text text7 = new Text("       ");
        text7.setFont(new Font("Arial Bold", 20));
        
        Text text8 = new Text("Este layout divide la interfaz en secciones en las cuales colocan sus elementos");
        text8.setFont(new Font("Arial Bold", 20));
        
        //Creacion del layout e inicializacion del stage
        GridPane gp = new GridPane();
        gp.add(text1, 0, 0, 2, 2);
        gp.add(text2, 2, 0, 1, 1);
        gp.add(text3, 2, 1, 1, 1);
        gp.add(text4, 0, 2, 1, 1);
        gp.add(text5, 1, 2, 1, 1);
        gp.add(text6, 2, 2, 1, 1);
        gp.add(text7, 3, 2, 1, 1);
        gp.add(text8, 4, 2, 1, 1);
                
        Scene scn = new Scene(gp);        
        stg.setTitle("GridPane");
        stg.setHeight(1000);
        stg.setWidth(1850);
        stg.setScene (scn);
        stg.show();
    }
    
}