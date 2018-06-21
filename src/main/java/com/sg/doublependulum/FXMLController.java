package com.sg.doublependulum;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    private void stopAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
//    @FXML
//    private void pauseAction() {
//        System.out.println("STOP");
//    }
//    
//    @FXML
//    private void resumeAction() {
//        System.out.println("STOP");
//    }
}
