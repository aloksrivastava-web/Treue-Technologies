import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainApp 
{
	   Scanner sc=new Scanner( System.in);
	    User loggedUser=null;
	    List<Book_Main> books=Book_Main.getBookList();


	
		   public static void main(String[] args) throws IOException {
		        new MainApp().start();
		    }

		    public void start() throws IOException{
		        File file=new File("db.txt");
		        if(!file.exists()){
		            file.createNewFile();
		        }
		        drawResource();

		    }

		    private void drawResource(){
		        System.out.println("\n\n\n\t\t-----------------Welcome Online to Book Store--------------");
		        System.out.println("\n\t1.Login");
		        System.out.println("\n\t2.New User? Sign Up ");
		        System.out.println("\n\t3.Exit");
		        System.out.print("\n\tEnter your choice here : ");
		        int ch=sc.nextInt();
		        switch(ch){
		            case 1:login();break;
		            case 2:register();break;
		            case 3:System.exit(0);break;
		            default:System.out.println("\n\tInvalid choice !");drawResource();
		        }
		    }

		    private void login(){
		        System.out.println("\n\n\tLogin");
		        System.out.print("\n\tEnter Your Email : ");
		        String email=sc.next();
		        System.out.print("\n\tEnter Your Password : ");
		        String password=sc.next();
		        Demo demo=new Demo();
		        User user=demo.isUserAvailable(email,password);
		        if(user==null){
		            System.out.println("\n\tInvalid email or Password");
		            System.out.println("\n\t1.Login again \t\t2.Main Menu");
		            int ch=sc.nextInt();
		            switch(ch){
		                case 1:login();break;
		                case 2:drawResource();break;
		                default :drawResource();
		            }
		        }else{
		            System.out.println("\n\tSuccessfully Logged in !");
		            loggedUser=user;
		            showDashboard(user);
		        }
		    }
		    private void register(){
		        System.out.println("\n\n\t Create New Account");
		        System.out.print("\n\tEnter Your First Name : ");
		        String firstName = sc.next();
		        System.out.print("\n\tEnter Your Last Name : ");
		        String lastName = sc.next();
		        System.out.print("\n\tEnter Your Email Address : ");
		        String email = sc.next();
		        System.out.print("\n\tEnter Your Mobile No : ");
		        long number = sc.nextLong();
		        System.out.print("\n\tEnter Your Password : ");
		        String password=sc.next();
		       
		        User user = new User(firstName, lastName, number, email,password);
		        Demo demo=new Demo();
		        if(demo.append(user)){
		            System.out.println("\n\tRegistration Successfully... !");
		            System.out.println("\n\t1.Login \t\t2.Main Menu");
		            int ch=sc.nextInt();
		            switch (ch){
		                case 1:login();break;
		                case 2:drawResource();break;
		                default :drawResource();
		            }
		            drawResource();
		        }else{
		            System.out.println("\n\tSomething Went Error !");

		        }

		    }

		    public void myAccount(){
		        System.out.println("\n\n\t\t My Account");
		        System.out.println("\n\tFirst Name : "+loggedUser.getFirstName());
		        System.out.println("\n\tLast Name : "+loggedUser.getLastName());
		        System.out.println("\n\tEmail : "+loggedUser.getEmail());
		        System.out.println("\n\tMobile No : "+loggedUser.getMobileNumber());
		        System.out.print("\n\n\tEnter Any Key to go Back : ");
		        sc.next();
		        showDashboard(loggedUser);
		    }

		    private void viewAllBooks(){
		        int id;
		        for(Book_Main book:books) {
		           String isAvailable=book.isAvailable() ? "Yes" : "No";
		           String owner=book.getOwnedBy()!=null ? "yes":"No";
		           System.out.println(
		            "\n\n\t\tBook Id : "+book.getId()+"\n\t\tBook Name : "+book.getName()+"\n\t\tBook Author : "
		            +book.getAuthor()+"\n\t\tBook Category"+book.getCategory()+"\n\t\tIs Available : "
		            +isAvailable+"\n\t\tOwner :" +owner+"\n\t\tBook Price : "+book.getPrice()
		           );
		        }
		        System.out.print("\n\n\t\tDo You Want to Purchase Book ? (press 1) (press 0 for exit) : ");
		        int ch=sc.nextInt();
		        if(ch==1){
		           addToCart();
		        }else{
		            showDashboard(loggedUser);
		        }

		    }
		    private void searchBooks(){

		        System.out.print("\n\n\t\tEnter book name to search : ");
		        String name=sc.next();
		        int results=0;
		        for (Book_Main book : books) {
		            if(book.getName().toLowerCase().contains(name.toLowerCase())){
		                System.out.println("\n\n\tBook Name : "
		                +book.getName()+"\t\n"+book.getAuthor()+
		                "\n\t"+book.getPrice());
		                results++;
		            }
		        }
		        System.out.println("\n\t"+results+" Found (press 1 for purchase or press any key to go back) : ");
		        int ch=sc.nextInt();
		        if(ch==1){
		            addToCart();
		        }
		        else{
		            showDashboard(loggedUser);
		        }
		    }
		    private void myCart(){
		        double price=0;
		        System.out.println("\n\n\t\tBooks in your cart :");
		        for (Book_Main book : books) {
		            if(book.getOwnedBy()==loggedUser.getEmail()){
		                price=price+book.getPrice();
		                System.out.println("\n\t"+book.getName());
		            }
		        }
		        System.out.println(
		            "\n\tFinal Price : "+price
		        );
		        System.out.print("\n\tEnter key to go back... ");
		        sc.next();
		        showDashboard(loggedUser);
		    }
		   
		        private void addToCart(){
		            System.out.print("\n\n\t\tPlease enter the book id : ");
		            Book_Main id=books.get(sc.nextInt());
		            if(id.isAvailable()){
		            id.setOwnedBy(loggedUser.getEmail());
		            id.setAvailable(false);
		            System.out.println("\n\n\t\tBook Successfully Added in cart !");
		            showDashboard(loggedUser);
		            }else{
		                System.out.println("\n\n\t\tSorry ! this book is not available right now");
		                showDashboard(loggedUser);
		            }


		        }

		        private void showDashboard(User user){
		            System.out.println("\n\n\t\tWelcome, "+user.getFirstName());
		            System.out.println("\n\t1.View All books");
		            System.out.println("\n\t2.Search books");
		            System.out.println("\n\t3.My Cart");
		            System.out.println("\n\t4.My Account");
		            System.out.println("\n\t5.Log out");
		            System.out.print("Enter your Choice here : ");
		            int ch=sc.nextInt();
		            switch(ch){
		                case 1:{
		                   viewAllBooks();
		                    break;
		                }
		                case 2:{
		                  searchBooks();
		                    break;
		                }
		                case 3:{
		                   myCart();
		                    break;
		                }
		                case 4:{
		                    myAccount();
		                    break;
		                }
		                case 5:{
		                    loggedUser=null;
		                    drawResource();
		                    break;
		                }
		                default:{
		                    System.out.println("\n\tInvalid Option !");
		                }
		            }
		

	}

}