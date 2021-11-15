package com.mycompany.elipse;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = SystemInfo.javaVersion();
        String javafxVersion = SystemInfo.javafxVersion();
        
        Ellipse elipse = new Ellipse(200, 100);
        elipse.setFill(Color.BLACK);
        
        Text texto1 = new Text("Esto es una elipse, haz click");
        texto1.setFont(new Font("Arial Bold", 20));
        texto1.setFill(Color.WHITE);
        
        Text texto2 = new Text("La Elipse esta parada");
        texto2.setFont(new Font("Arial Bold", 20));
        texto2.setFill(Color.BLACK);
        
        StackPane sp = new StackPane();
        sp.getChildren().addAll(elipse, texto1);
        
        VBox vb = new VBox();
        vb.getChildren().addAll(sp, texto2);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(200);
        
        RotateTransition rotacion = new RotateTransition(Duration.millis(10000), sp);
        rotacion.setFromAngle(0);
        rotacion.setToAngle(360);
        sp.setOnMouseClicked(mouseEvent -> {
            if (rotacion.getStatus().equals(Animation.Status.RUNNING)) {
                rotacion.pause();
            } else {
                rotacion.play();
            }
        });
        
        rotacion.statusProperty().addListener(
                (observableValue, oldValue, newValue) -> {
                    texto2.setText("La Elipse antes estaba: " + oldValue + " y ahora esta: " + newValue);
        });
        
        texto2.rotateProperty().bind(sp.rotateProperty());
        
        Scene scene = new Scene(vb, 1850, 1000);
        stage.setTitle("Elipse");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}