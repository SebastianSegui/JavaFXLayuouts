import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main (String[] args){
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stg) throws Exception {
        
        //Creacion de las formas
        ToggleButton btn1 = new ToggleButton("Boton1");
        btn1.setPrefSize(80, 40);
        ToggleButton btn2 = new ToggleButton("Boton2");
        btn2.setPrefSize(80, 40);
        ToggleButton btn3 = new ToggleButton("Boton3");
        btn3.setPrefSize(80, 40);

        ToggleGroup grp = new ToggleGroup();
        btn1.setToggleGroup(grp);
        btn2.setToggleGroup(grp);
        btn3.setToggleGroup(grp);

        //Creacion del layout e inicializacion del stage
        ButtonBar btnBar = new ButtonBar();
        btnBar.getButtons().addAll(btn1, btn2, btn3);
        
        HBox hb = new HBox();
        hb.getChildren().addAll(btnBar);
        
        Scene scn = new Scene(hb);
        stg.setTitle("HBox/ButtonBar");
        stg.setHeight(1000);
        stg.setWidth(1850);
        stg.setScene (scn);
        stg.show();
    }
}