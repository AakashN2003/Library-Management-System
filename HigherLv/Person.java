package con.lms.dto;
import java.io.Serializable;
public class Person implements Serializable{
 	private int id;
	private String name;
	private String mobileNo;
	private String email;
	private boolean status;

	public Person(){

	}

	public Person(int id,String name,String mobileNo,String email){
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;

	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getMobileNo(){
		return mobileNo;
	}
	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}

	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}







	public  String toString(){
		String output = "";
		output += "Person Id : " + getId() + "\n";
		output += "Person Name : " + getName() + "\n";
		output += "Person Mobile No : " + getMobileNo() + "\n";
		output += "Person Email : " + getEmail() + "\n";		

		return output;
	}
 }










 