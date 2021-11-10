import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main (String[] args){
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stg) throws Exception {
        
        //Creacion de las formas                
        Label lbl1 = new Label("Este layout divide la pantalla en zonas independientes, esta es la zona izquierda");
        
        Label lbl2 = new Label("Esta es la zona entral");
        
        Label lbl3 = new Label("Ademas hay un divisor que se puede desplazar, esta es la zona derecha");

        //Creacion del layout e inicializacion del stage
        SplitPane sp = new SplitPane();

        VBox izquierda  = new VBox(lbl1);
        VBox centro = new VBox(lbl2);
        VBox derecha   = new VBox(lbl3);

        sp.getItems().addAll(izquierda, centro, derecha);
        
        Scene scn = new Scene(sp);
        stg.setTitle("SplitPane");
        stg.setHeight(1000);
        stg.setWidth(1850);
        stg.setScene (scn);
        stg.show();
    }
    
}