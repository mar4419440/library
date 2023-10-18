package library;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Cnewcustomerpassing {
    @FXML
    TextField textField;
    @FXML
    Button button;
    
    private Custmor cust;

    public void button() throws IOException {
        
            
            System.out.println("Enter your number");
            String cust_number = textField.getText();

                for (int i = 0; i < library.Custmors.size(); i++) {
                    if(library.Custmors.get(i).getcustmorNumber().equals(cust_number))
                    {
                        cust = library.Custmors.get(i);
                        break;
                    }
                }                        
            if(cust != null) {
                Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        String name = "oldCustomer";
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/library/" + name + ".fxml"));
        HoldCust.cust = cust;
        
        primaryStage.setScene(new Scene(loader.load()));
        
        primaryStage.showAndWait();
            }
            
    }
    public static class HoldCust {
        public static Custmor cust;
    }
}
