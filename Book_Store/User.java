public class User 
{
	 private String firstName;
	    private String lastName;
	    private long mobileNumber;
	    private String email;
	    private String password;


	    public User() {
	    }
	    
	    public User(String firstName, String lastName, long mobileNumber, String email,String password) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.mobileNumber = mobileNumber;
	        this.email = email;
	        this.password=password;
	    }

	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public long getMobileNumber() {
	        return mobileNumber;
	    }
	    public void setMobileNumber(long mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }

	    @Override
	    public String toString() {
	        return getFirstName()+",,,"+getLastName()+",,,"+
	        getMobileNumber()+",,,"+getEmail()+",,,"+getPassword()+"\n";

	    }

	   
}