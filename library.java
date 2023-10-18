package library;
import java.io.IOException;
import java.util.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class library extends Application{

    public static ArrayList<storage> storages = new ArrayList<storage>();
    public static ArrayList<Staff> Staffs = new ArrayList<Staff>();
    public static ArrayList<Custmor> Custmors = new ArrayList<Custmor>();
    
        @Override
    public void start(Stage primaryStage) throws Exception {

        
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/library/mainview.fxml"));
        
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    public static void createWindow(String name, Object object)throws IOException  {
                Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        
        FXMLLoader loader = new FXMLLoader(object.getClass().getResource("/library/" + name + ".fxml"));
        
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.showAndWait();
    }
   
//
//    public static void main(String[] args) {
//        
//        Scanner scan = new Scanner(System.in);
//        storage sto = new storage();
//        sto.setStorage_id("1");
//        storages.add(sto);
//        
//        while(true)
//        {
//            System.out.println("this is the menu");
//            System.out.println("1] new staff\n"
//                             + "2] old staff\n"
//                             + "3] new Custmor\n"
//                             + "4] old Custmor");
//            String menu = scan.nextLine();
//            switch(menu)
//            {
//                case "1":
//                    System.out.println("Enter name");
//                    String name_staff = scan.nextLine();
//                    Staff s = new Staff(name_staff);
//                    Staffs.add(s);
//                    break;
//                case "2":
//                    Staff sf = null;
//                    for(;sf == null;)
//                    {
//                        System.out.println("Enter id");
//                        String id_staff = scan.nextLine();
//
//                        for (int i = 0; i < Staffs.size(); i++) {
//                            if(Staffs.get(i).getId() == Integer.parseInt(id_staff))
//                            {
//                                sf = Staffs.get(i);
//                                break;
//                            }
//                        }                        
//                    }
//                    System.out.println("1] add book\n"
//                                     + "2] remove book\n"
//                                     + "3] show books");
//                    String staff_menu = scan.nextLine();
//
//                    switch(staff_menu){
//                        case "1":
//                            System.out.println("Enter name");
//                            String book_name = scan.nextLine();
//                            System.out.println("Enter Type");
//                            String book_Type = scan.nextLine();
//                            System.out.println("Enter language");
//                            String book_language = scan.nextLine();
//                            System.out.println("Enter Price");
//                            String book_Price = scan.nextLine();
//                            System.out.println("Enter Amount");
//                            String book_Amount = scan.nextLine();
//                            
//                            Book b = null;
//                            
//                            if(book_Type.equals("Science"))
//                            {
//                                b = new BookScience();
//                            }
//                            else if(book_Type.equals("Horror"))
//                            {
//                                b = new BookHorror();
//                            }
//                            
//                            b.setBookName(book_name);
//                            b.setBookType(book_Type);
//                            b.setBooklanguage(book_language);
//                            b.setBookPrice(Double.parseDouble(book_Price));
//                            b.setBooksamount(Integer.parseInt(book_Amount));
//                            
//                            System.out.println("Enter the id of storage");
//                            String storage_ID = scan.nextLine();
//                            
//                            for (int i = 0; i < storages.size(); i++) {
//                                if(storages.get(i).getStorage_id().equals(storage_ID))
//                                {
//                                    storages.get(i).getBooks().add(b);
//                                    break;
//                                }
//                            }
//                            
//                            break;
//                        case "2":
//                            System.out.println("Enter book name");
//                            String Book_name = scan.nextLine();
//                            System.out.println("Enter the id of storage");
//                            String storage_ID2 = scan.nextLine();
//                            
//                            for (int i = 0; i < storages.size(); i++) {
//                                if(storages.get(i).getStorage_id().equals(storage_ID2))
//                                {
//                                    storages.get(i).removeBook(Book_name);
//                                    System.gc();
//                                    break;
//                                }
//                            }
//                            
//                            
//                            
//                            break;
//                        case "3":
//                            for (int i = 0; i < storages.size(); i++) {
//                                System.out.println(storages.get(i).getStorage_id() + "]");
//                                for (int j = 0; j < storages.get(i).getBooks().size(); j++) {
//                                    Control.showInformation(storages.get(i).getBooks().get(j));
//                                }
//                                System.out.println();
//                            }
//                            break;
//                    }
//
//                    
//                    break;
//                case "3":
//                    System.out.println("Enter name");
//                    String name_Custmor = scan.nextLine();
//                    System.out.println("Enter Email");
//                    String Email_Custmor = scan.nextLine();
//                    System.out.println("Enter Number");
//                    String Number_Custmor = scan.nextLine();
//                    Custmor c = new Custmor();
//                    c.setcustmorName(name_Custmor);
//                    c.setCustmorEmail(name_Custmor);
//                    c.setcustmorNumber(Number_Custmor);
//                    Custmors.add(c);
//                    break;
//                case "4":
//
//                    
//                    Custmor cust = null;
//                    for(;cust == null;)
//                    {
//                    System.out.println("Enter your number");
//                    String cust_number = scan.nextLine();
//
//                        for (int i = 0; i < Custmors.size(); i++) {
//                            if(Custmors.get(i).getcustmorNumber().equals(cust_number))
//                            {
//                                cust = Custmors.get(i);
//                                break;
//                            }
//                        }                        
//                    }
//
//                    System.out.println("1] add book to the cart\n"
//                                     + "2] show books from the cart\n"
//                                     + "3] show books in system\n"
//                                     + "4] buy books in the cart");
//                    String Custmor_menu = scan.nextLine();
//                    switch(Custmor_menu){
//                        case "1":
//                            System.out.println("Enter book name");
//                            String Book_name = scan.nextLine();
//                            boolean flage = true;
//                            for (int i = 0; i < storages.size() && flage; i++) {
//                                for (int j = 0; j < storages.get(i).getBooks().size() && flage; j++) {
//                                    if(storages.get(i).getBooks().get(j).getBookName().equals(Book_name))
//                                        cust.getBooks().add(storages.get(i).getBooks().get(j));
//                                }
//                            }
//                            break;
//                        case "2":
//                            for (int i = 0; i < cust.getBooks().size(); i++) {
//                                 Control.showInformation(cust.getBooks().get(i));
//                       
//                            }
//                            break;
//                        case "3":
//                            for (int i = 0; i < storages.size(); i++) {
//                                System.out.println(storages.get(i).getStorage_id() + "]");
//                                for (int j = 0; j < storages.get(i).getBooks().size(); j++) {
//                                    Control.showInformation(storages.get(i).getBooks().get(j));
//                                }
//                                System.out.println();
//                            }
//                            break;
//                        case "4":
//                            for (int i = 0; i < cust.getBooks().size(); i++) {
//                                Control.buyBook(cust.getBooks().get(i));
//                            }
//                            System.out.println("done");
//                            break;
//                    }
//                    break;
//                default:System.out.println("error");
//            }
//        }
//     }
//   


}