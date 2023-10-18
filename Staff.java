package library;

public class Staff extends storage{
    
    
    private String StaffName;
    private static int id_c = 0;
    private int id;
    
    public Staff(String name)
    {
        this.id = id_c;
        id_c++;
        this.StaffName = name;
    }
    
   public int getId()
   {
       return id;
   }

    public String getStaffName() {
        return StaffName;
    }
   
}   
