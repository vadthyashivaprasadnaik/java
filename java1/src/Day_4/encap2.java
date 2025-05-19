package Day_4;

public class encap2 {

	private String firstName;
	private String lastName;
	private String email;
	private String phonenum;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmail(String em) {
		email=em;
	}
	public void setPhonenum(String ph) {
		phonenum=ph;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhonenum() {
		return phonenum;
	}
	
	public static void main(String[] args) {
		encap2 e2=new encap2();
		e2.setFirstName("vikram");
		e2.setLastName("rathod");
		e2.setEmail("vikramrathod@gmail.com");
		e2.setPhonenum("900xxxx388");
		System.out.println(e2.getFirstName());
		System.out.println(e2.getLastName());
		System.out.println(e2.getEmail());
		System.out.println(e2.getPhonenum());

	}

}
