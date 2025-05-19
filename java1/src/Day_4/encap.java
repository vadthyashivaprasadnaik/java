package Day_4;

public class encap {
	private String firstName;
	private String lastName;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setlastName(String ln) {
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}


	public static void main(String[] args) {
		encap e=new encap();
		e.setFirstName("vikram");
		e.setlastName("rathod");
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());

	}

}
