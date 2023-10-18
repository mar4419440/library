package library;

public abstract class Control{

    public static void buyBook(Book book){
        if(book.getBooksamount() != 0)
        {
            book.setBooksamount(book.getBooksamount()-1);
        }
        else
            System.out.println("no enough books of that type");
    }
    
    public static void addBook(Book book){
            book.setBooksamount(book.getBooksamount()+1);
    }
    
    public static void showInformation(Book book)
    {
        System.out.println("name is " + book.getBookName());
        System.out.println("Book Type is " + book.getBookType());
        System.out.println("Book language is " + book.getBooklanguage());
        System.out.println("Book Price is " + book.getBookPrice());
        System.out.println("Book Amount is " + book.getBooksamount());
    }

    public static void showInformation(Staff staff){
        System.out.println("name is " + staff.getStaffName());
        System.out.println("name is " + staff.getId());
    }
    
    public static void showInformation(Custmor custmor){
        System.out.println("name is " + custmor.getcustmorName());
        System.out.println("Email is " + custmor.getCustmorEmail());
        System.out.println("Number is " + custmor.getcustmorNumber());
    }
    
}
