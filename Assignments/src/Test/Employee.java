package Test;

public class Employee {

	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void Validation() throws LengthException
	{
		if(firstName==null && lastName==null )
		{
			throw new  NullPointerException("Entry Missing");
		}
		
		if(firstName.length()<3 && lastName.length()<3  )
		{
			throw new LengthException("name should be minimum 3 character");
		}
	}
}
