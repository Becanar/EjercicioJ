package com.example.ejercicioj;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class miniController {

    @FXML
    private VBox rootPane;
    @FXML
    private HBox panelNorte;
    @FXML
    private ImageView imgLogo;
    @FXML
    private Label lblConf;
    @FXML
    private ImageView imgLuces;
    @FXML
    private StackPane panelCentro;
    @FXML
    private ImageView imgCoche;
    @FXML
    private ImageView imgLuz;
    @FXML
    private HBox panelLbl;
    @FXML
    private Label lblSelecciona;
    @FXML
    private HBox panelColores;

    @FXML
    private ToggleButton btRojo, btAzulC, btAzulO, btNegro, btGris, btBeis, btGrisO, btnVolcaninOrange;

    @FXML
    public void initialize() {
        btRojo.setSelected(true);
        cambiarColor();
    }
    @FXML
    private void toggleLuces() {
        imgLuz.setVisible(!imgLuz.isVisible());
        if (imgLuz.isVisible()) {
            imgLuces.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/lucesOn.png")));
        } else {
            imgLuces.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/lucesOff.png")));
        }
    }
    @FXML
    private void cambiarColor() {
        if (btRojo.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniBlazingRed.png")));
        } else if (btAzulC.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniElectricBlue.png")));
        } else if (btAzulO.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniLapisluxuryBlue.png")));
        } else if (btNegro.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniMidnightBlack.png")));
        } else if (btGris.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniMoonwalkGrey.png")));
        } else if (btBeis.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniPepperWhite.png")));
        } else if (btGrisO.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniThunderGray.png")));
        } else if (btnVolcaninOrange.isSelected()) {
            imgCoche.setImage(new Image(getClass().getResourceAsStream("/com/example/ejercicioj/images/coches/miniVolcaninOrange.png")));
        }
    }

}
