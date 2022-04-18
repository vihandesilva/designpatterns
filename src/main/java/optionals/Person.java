package optionals;

import java.time.LocalDate;
import java.util.Date;

/**
 *  @author Vihan
 *  
 *  Sample POJO Person class
 *  
 */
public class Person {
	
	private String name;
	private String id;
	private LocalDate dob;
	private String email;
	
	
	public Person(String name, String id, LocalDate dob, String email) {
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
