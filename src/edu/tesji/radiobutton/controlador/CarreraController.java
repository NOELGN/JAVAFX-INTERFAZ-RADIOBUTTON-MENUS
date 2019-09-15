package edu.tesji.radiobutton.controlador;

import edu.tesji.radiobutton.modelo.carreraModel;
import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class CarreraController {
    private carreraModel carrera = new carreraModel();
    @FXML
    private RadioButton rbIndustrial;

    @FXML
    private ToggleGroup grupoCarreras;

    @FXML
    private RadioButton rbInformatica;

    @FXML
    private RadioButton rbSistemas;

    @FXML
    private TextArea AreaTexto;
    
    @FXML
    private RadioButton rbMecatronica;

    @FXML
    private RadioButton rbCivil;

    @FXML
    private RadioButton rbAdministracion;

    @FXML
    private RadioButton rbQuimica;

    @FXML
    void itmCarreras(ActionEvent event) throws IOException {
        FXMLLoader Fxml =new FXMLLoader(getClass().getResource("/edu/tesji/radiobutton/vista/FXMLdiseñoRadioButton.fxml"));
        Parent root1;
        root1=(Parent)Fxml.load();
        Stage stage =new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    @FXML
    void itmCometa(ActionEvent event) throws IOException {
        FXMLLoader Fxml =new FXMLLoader(getClass().getResource("/edu/tesji/radiobutton/vista/FXMLdiseñoFabrica.fxml"));
        Parent root1;
        root1=(Parent)Fxml.load();
        Stage stage =new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }    

    @FXML
    void btnNuevo(ActionEvent event) {
        AreaTexto.setText(null);
        rbSistemas.setSelected(true);
    }

    @FXML
    void btnSalir(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnVer(ActionEvent event) {
        validarRadios();
    }
    
    @FXML
    void rbIndustrial(ActionEvent event) {
        validarRadios();
    }

    @FXML
    void rbInformatica(ActionEvent event) {
        validarRadios();
    }

    @FXML
    void rbSistemas(ActionEvent event) {
        validarRadios();
    }
    
    @FXML
    void itmVentana1(ActionEvent event) throws IOException {
        FXMLLoader Fxml =new FXMLLoader(getClass().getResource("/edu/tesji/radiobutton/vista/FXMLdiseñoVentana1.fxml"));
        Parent root1;
        root1=(Parent)Fxml.load();
        Stage stage =new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    private void validarRadios(){
        if(rbIndustrial.isSelected()){
            carrera.setCarrera("Industrial");
        }else if(rbInformatica.isSelected()){
            carrera.setCarrera("Informatica");
        }else if(rbSistemas.isSelected()){
            carrera.setCarrera("Sistemas");
        }else if(rbMecatronica.isSelected()){
            carrera.setCarrera("Mecatronica");
        }else if(rbCivil.isSelected()){
            carrera.setCarrera("Civil");
        }else if(rbAdministracion.isSelected()){
            carrera.setCarrera("Administracion");
        }else if(rbQuimica.isSelected()){
            carrera.setCarrera("Quimica");
        }
        AreaTexto.setText(carrera.VarInfo());
    }
}
