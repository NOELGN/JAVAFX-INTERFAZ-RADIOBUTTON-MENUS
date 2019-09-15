
package edu.tesji.radiobutton.inicio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Inicio extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/edu/tesji/radiobutton/vista/FXMLdiseñoPrincipal.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("TESJI");
        primaryStage.getIcons().add(new Image("edu/tesji/radiobutton/recursos/AsesorUsuario.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
