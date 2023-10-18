package library;

import java.util.ArrayList;

 class storage implements booksamount {
     protected  String storage_id;
     private int booksamount;
     protected ArrayList<Book> books = new ArrayList<Book>();

    @Override
    public int getBooksamount() {
        return booksamount;
    }

    public void setBooksamount(int booksamount) {
        this.booksamount = booksamount;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(String storage_id) {
        this.storage_id = storage_id;
    }
    public void removeBook(String name)
    {
        
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getBookName().equals(name))
            {
                books.remove(i);
                break;
            }
        }
    }
}
