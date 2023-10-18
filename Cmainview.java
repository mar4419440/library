package library;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.fxml.FXML;


public class Cmainview {
    @FXML
    Button newStaff;
    @FXML
    Button oldstaff;
    @FXML
    Button newCustomer;
    @FXML
    Button oldCustomer;
    @FXML
    Button oldcust;
    
    public void newStaff()  {
        try {
           library.createWindow("newstaff", this);
        }catch(IOException ex) {
            System.out.println(ex);
        }
    }
    public void oldStaff() {
        try {
            library.createWindow("oldsatff", this);
        }catch(IOException ex) {
            System.out.println(ex);
        }
    }
    public void newCustomer() {
        try {
           library.createWindow("newcustmer", this);
        }catch(IOException ex) {
            System.out.println(ex);
        }
    }
    public void oldCustomer() {
        try {
            library.createWindow("newcustomerpassing", this);
        }catch(IOException ex) {
            System.out.println(ex);
        }

    }
    
}
