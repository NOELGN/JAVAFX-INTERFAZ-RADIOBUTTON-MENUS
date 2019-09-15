package edu.tesji.radiobutton.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import edu.tesji.radiobutton.modelo.FabricaModel;
import javafx.scene.control.ComboBox;

public class FabricaController implements Initializable{
        ObservableList<String> opClave=FXCollections.observableArrayList(
            "Clave 1",
            "Clave 2",
            "Clave 3",
            "Clave 4",
            "Clave 5",
            "Clave 6");

    @FXML
    private TextField txtMateria;

    @FXML
    private TextArea AreaResultado;
    
    @FXML
    private ComboBox<String> cmbClave;    

    @FXML
    void btnCalcular(ActionEvent event) {
        FabricaModel arg=new FabricaModel();
        arg.setNclave(cmbClave.getValue());
        arg.setMateriaPrima(Double.parseDouble(txtMateria.getText()));
        AreaResultado.setText(arg.Precio());
    }

    @FXML
    void btnNuevo(ActionEvent event) {
        cmbClave.setItems(opClave);
        txtMateria.setText(null);   
        AreaResultado.setText(null);        
    }

    @FXML
    void btnSalir(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cmbClave.setItems(opClave);
    }

}
