package library;
import java.util.ArrayList;

public class Custmor {
   private String custmorName;
   private String custmorNumber;
   private String CustmorEmail;
   private ArrayList<Book> books = new ArrayList<Book>();
   
   public void setcustmorName(String CustmorName)
   {
       this.custmorName=CustmorName;
   }
   public void setcustmorNumber(String custmorNumber)
   {
       this.custmorNumber=custmorNumber;
   }
   public void setCustmorEmail(String custmorEmail)
   {
      this.CustmorEmail= custmorEmail;
   }
   public String getcustmorName()
   {
   return custmorName;
   }
   public String getcustmorNumber()
   {
   return custmorNumber;
   }
   public String getCustmorEmail()
   {
   return CustmorEmail;
   }

    public ArrayList<Book> getBooks() {
        return books;
    }
   
}
