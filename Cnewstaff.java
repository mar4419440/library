package library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cnewstaff {
    @FXML
    Button enter;
    @FXML
    TextField nameInput;
    @FXML
    Circle circle;
    
    public void enter() {
        library.Staffs.add(new Staff(nameInput.getText()));
        circle.setFill(Color.GREEN);
    }
    
}
