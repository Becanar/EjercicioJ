package com.example.ejercicioj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class app extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(app.class.getResource("/com/example/ejercicioj/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
       // scene.getStylesheets().add(getClass().getResource("/org/example/ejercicioi/style/style.css").toExternalForm());
        stage.setResizable(false);
        stage.setWidth(679);
        stage.setHeight(593);
        try {
            Image img = new Image(getClass().getResource("/com/example/ejercicioj/images/Cooper.png").toString());
            stage.getIcons().add(img);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }

        stage.setTitle("MINI COOPER");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Método main que lanza la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}