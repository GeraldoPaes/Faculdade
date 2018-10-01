public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String toString() {
		return "AUTHOR'S INFORMATION:\nName: " + this.name + "\nGender: " + this.gender + "\nEmail: " + this.email;
	}
}
