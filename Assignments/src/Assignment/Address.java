package Assignment;

public class Address {

	String dno;
	String street;
	String landmark;
	String line;
	String pincode;
	public Address(String dno, String street, String landmark, String line, String pincode) {
		super();
		this.dno = dno;
		this.street = street;
		this.landmark = landmark;
		this.line = line;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", landmark=" + landmark + ", line=" + line + ", pincode="
				+ pincode + "]";
	}
}
