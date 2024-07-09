package con.lms.dto;
public class Staff extends Person{
	private int noOfIssued;
	private int noOfReceived;
	private int remuneration;

	public Staff(){

	}

	public Staff(int id,String name,String email,String mobileNo){
		super(id,name,email,mobileNo);
	}

	public Staff(int noOfIssued,int noOfReceived,int remuneration){
		this.noOfIssued = noOfIssued;
		this.noOfReceived = noOfReceived;
		this.remuneration = remuneration;
	}

	public int getNoOfIssued(){
		return noOfIssued;
	}
	public void setNoOfIssued(int noOfIssued){
		this.noOfIssued = noOfIssued;
	}

	public int getNoOfReceived(){
		return noOfReceived;
	}
	public void setNoOfReceived(int noOfReceived){
		this.noOfReceived = noOfReceived;
	}

	public int getRemuneration(){
		return remuneration;
	}
	public void setRemuneration(int remuneration){
		this.remuneration = remuneration;
	}

	public  String toString(){
		String output = "";
		output += "Staff Id : " + getId() + "\n";
		output += "Staff Name : " + getName() + "\n";
		output += "Staff Mobile No : " + getMobileNo() + "\n";
		output += "Staff Email : " + getEmail() + "\n";
		output += "Staff's No Of Issued : " + getNoOfIssued() + "\n";
		output += "Staff's No Of Received : " + getNoOfReceived() + "\n";
		output += "Staff Remuneration : " + getRemuneration() + "\n";
						

		return output;
	}
}





