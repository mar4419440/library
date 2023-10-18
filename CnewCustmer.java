package library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CnewCustmer {
    @FXML
    TextField name;
    @FXML
    TextField email;
    @FXML
    TextField number;
    
    @FXML
    Button enter;
    
    public void enter() {
        System.out.println("Enter name");
        String name_Custmor = name.getText();
        System.out.println("Enter Email");
        String Email_Custmor = email.getText();
        System.out.println("Enter Number");
        String Number_Custmor = number.getText();
        Custmor c = new Custmor();
        c.setcustmorName(name_Custmor);
        c.setCustmorEmail(name_Custmor);
        c.setcustmorNumber(Number_Custmor);
        library.Custmors.add(c);
    }
}
