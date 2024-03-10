package org.example.projectone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnCopy;

    @FXML
    private Label btnDisplay;

    @FXML
    private ButtonBar lblDisplay;

    @FXML
    private Label lblLogin;

    @FXML
    private TextArea txtArea;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onCopy(ActionEvent event) {
        lblDisplay.setText(txtArea.getText());
        txtArea.setText("");
    }

    @FXML
    void onLogin(ActionEvent event) {
        // COMPARE TYPED USERNAME AND PASSWORD TO ACTUAL USERNAME AND PASSWORD
        // admin, 1234
        if (txtUsername.getText().equals("admin") && txtPassword.getText().equals("1234")) {
            lblLogin.setTextFill(Color.GREEN);
            lblLogin.setText("Valid login details");
        } else {
            lblLogin.setTextFill(Color.RED);
            lblLogin.setText("Invalid login details");
        }

        txtUsername.setText("");
        txtPassword.setText("");
    }

    @FXML
    void onMouseEntered(MouseEvent event) {
    }

}
