package library;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Coldstaffpass {
    @FXML
    Button show;
    @FXML
    Button remove;
    @FXML
    Button add;
    
    @FXML
    TextField removeName;
    @FXML
    TextField removeId;
    @FXML
    TextField name;
    @FXML
    TextField price;
    @FXML
    TextField language;
    @FXML
    TextField type;
    @FXML
    TextField amount;
    @FXML
    TextField storagID;
    
    
    @FXML
    TextArea showArea;
    
    public void show() {
        String text = "";
       for (int i = 0; i < library.storages.size(); i++) {
            text += library.storages.get(i).getStorage_id() + "]";
            for (int j = 0; j < library.storages.get(i).getBooks().size(); j++) {
                Book book = library.storages.get(i).getBooks().get(j);
                text += "\tname is " + book.getBookName();
                text += "\tBook Type is " + book.getBookType();
                text += "\tBook language is " + book.getBooklanguage();
                text += "\tBook Amount is " + book.getBooksamount();
                text += "\n";
            }
            text += "\n";
        }
       System.out.println(text);
       showArea.setText(text);
    }
    public void remove() {
        String Book_name = removeName.getText();
        System.out.println("Enter the id of storage");
        String storage_ID2 = removeId.getText();

        for (int i = 0; i < library.storages.size(); i++) {
            if(library.storages.get(i).getStorage_id().equals(storage_ID2))
            {
                library.storages.get(i).removeBook(Book_name);
                System.gc();
                break;
            }
        }
    }
    public void add() {
        String book_name = name.getText();
        String book_Type = type.getText();
        String book_language = language.getText();
        String book_Price = price.getText();
        String book_Amount = amount.getText();

        Book b = null;

        if(book_Type.equals("Science"))
        {
            b = new BookScience();
        }
        else if(book_Type.equals("Horror"))
        {
            b = new BookHorror();
        }

        b.setBookName(book_name);
        b.setBookType(book_Type);
        b.setBooklanguage(book_language);
        b.setBookPrice(Double.parseDouble(book_Price));
        b.setBooksamount(Integer.parseInt(book_Amount));

        String storage_ID = storagID.getText();

        Boolean f = false;
        for (int i = 0; i < library.storages.size(); i++) {
            if(library.storages.get(i).getStorage_id().equals(storage_ID))
            {
                library.storages.get(i).getBooks().add(b);
                f = true;
                break;
            }
        }
        if(!f){
            storage s = new storage();
            s.setStorage_id(storagID.getText());
            library.storages.add(s);
            s.getBooks().add(b);
        }
    }
    
}
