import java.util.ArrayList;
import java.util.List;

public class Book_Main 
{
	private int bid;
    private String bname;
    private String bauthor;
    private String category;
    private boolean isAvailable;
    private String ownedBy;
    public String getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}


	private double bprice;

    public double getPrice() {
        return bprice;
    }
    public void setPrice(double price) {
        this.bprice = price;
    }

   
    
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
   
    
    public boolean isAvailable() {
        return isAvailable;
    }

    public Book_Main() {
    }
    
    public Book_Main(int id, String name, String author, String category, boolean isAvailable,String ownedBy, double price) {
        this.bid = id;
        this.bname = name;
        this.bauthor = author;
        this.category = category;
        
        this.isAvailable = isAvailable;
        this.ownedBy=ownedBy;
        this.bprice=price;
    }
    public String getAuthor() {
        return bauthor;
    }
    public void setAuthor(String author) {
        this.bauthor = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getId() {
        return bid;
    }
    public void setId(int id) {
        this.bid = id;
    }
    public String getName() {
        return bname;
    }
    public void setName(String name) {
        this.bname = name;
    }


    public static List<Book_Main> getBookList(){

        List<Book_Main> books=new ArrayList<>();
        books.add(new Book_Main(0, "The India Story", "Dhinedra Jha", "Social", true,null ,896));
        books.add(new Book_Main(1, "Panch Tantra", "Vishnu Sharma", "Comic", true,null, 600));
        books.add(new Book_Main(2, "Cobol", "Rajaraman", "Computer Science", true,null, 489));
        books.add(new Book_Main(3, "Operating System", "Dhamdhere", "Computer Science", true,null, 569));
        books.add(new Book_Main(4, "Advance Java", "Ghosh", "Computer Science", true,null, 954));
        books.add(new Book_Main(5, "Computer Graphics", "Bhattachary", "Computer Science", true,null, 965));
        books.add(new Book_Main(6,"Intruduction to IoT","Misra","Computer Science",true,null,845));
        return books;
    }
    
}