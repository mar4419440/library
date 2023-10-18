package library;

public class Book extends storage  {
    private  String BookName;
    private String BookType;
    private String booklanguage;
    private double BookPrice;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getBookType() {
        return BookType;
    }

    public void setBookType(String BookType) {
        this.BookType = BookType;
    }

    public String getBooklanguage() {
        return booklanguage;
    }

    public void setBooklanguage(String booklanguage) {
        this.booklanguage = booklanguage;
    }

    public double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(double BookPrice) {
        this.BookPrice = BookPrice;
    }
}
