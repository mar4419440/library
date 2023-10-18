package library;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ColdCustomer implements Initializable{
    @FXML
    Button showInCart;
    @FXML
    Button showInStore;
    @FXML
    Button add;
    @FXML
    Button buy;
    
    @FXML
    TextField addInput;
    
    @FXML
    TextArea showCartArea;
    @FXML
    TextArea showStoreArea;
    
    private Custmor cust;
    
    
    
    public void showInCart() {
        String text = "";
        for (int i = 0; i < cust.getBooks().size(); i++) {
            Book book = cust.getBooks().get(i);
            
            text += "name is " + book.getBookName();
            text += "Book Type is " + book.getBookType();
            text += "Book language is " + book.getBooklanguage();
            text += "Book Price is " + book.getBookPrice();
            text += "Book Amount is " + book.getBooksamount();
            text += "\n";

       }
        showCartArea.setText(text);
    }
    public void showInStore() {
        String text = "";
        System.out.println(cust.getBooks().size());
        
        
        
        for (int i = 0; i < library.storages.size(); i++) {
            for (int j = 0; j < library.storages.get(i).getBooks().size(); j++) {
                     Book book = library.storages.get(i).getBooks().get(j);
                     text += "name is " + book.getBookName();
                    text += "Book Type is " + book.getBookType();
                    text += "Book language is " + book.getBooklanguage();
                    text += "Book Price is " + book.getBookPrice();
                    text += "Book Amount is " + book.getBooksamount();
                    text += "\n";
            }
            text += "\n";
        }
        
        
        for (int i = 0; i < cust.getBooks().size(); i++) {
            Book book = cust.getBooks().get(i);
            
            text += "name is " + book.getBookName();
            text += "Book Type is " + book.getBookType();
            text += "Book language is " + book.getBooklanguage();
            text += "Book Price is " + book.getBookPrice();
            text += "Book Amount is " + book.getBooksamount();
            text += "\n";

       }
        
        showStoreArea.setText(text);
        
    }
    public void add() {
        String Book_name = addInput.getText();
        boolean flage = true;
        for (int i = 0; i < library.storages.size() && flage; i++) {
            for (int j = 0; j < library.storages.get(i).getBooks().size() && flage; j++) {
                if(library.storages.get(i).getBooks().get(j).getBookName().equals(Book_name))
                    cust.getBooks().add(library.storages.get(i).getBooks().get(j));
            }
        }
    }
    public void buy() {
        for (int i = 0; i < cust.getBooks().size(); i++) {
            Control.buyBook(cust.getBooks().get(i));
        }
    }

    
    public void setCust(Custmor cust) {
        this.cust = cust;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setCust(Cnewcustomerpassing.HoldCust.cust);
    }

    
    
}
