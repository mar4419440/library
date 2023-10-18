package library;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Coldstaff {
    @FXML
    Button enter;
    @FXML
    TextField nameInput;
    @FXML
    Circle circle;
    
    public void enter() {
        Staff sf = null;
        try {
            String id_staff = nameInput.getText();

            for (int i = 0; i < library.Staffs.size(); i++) {
                if(library.Staffs.get(i).getId() == Integer.parseInt(id_staff))
                {
                    sf = library.Staffs.get(i);
                    break;
                }
            }
            if(sf == null) {
                circle.setFill(Color.RED);
            }
            else
            {
                circle.setFill(Color.GREEN);
                try {
                    library.createWindow("oldstaffpass", this);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
            
            
        } catch(Exception ex) {
                circle.setFill(Color.RED);
        }
    }

}
