package Assignment;

public class Mobile1 {

	String brandName;
	String model;
	String ram;
	String Storage;
	public Mobile1(String brandName, String model, String ram, String storage) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.ram = ram;
		Storage = storage;
	}
	@Override
	public String toString() {
		return "Mobile1 [brandName=" + brandName + ", model=" + model + ", ram=" + ram + ", Storage=" + Storage + "]";
	}
	void MakeCall()
	{
		System.out.println("Calling...");
	}
	void SendMessage()
	{
		System.out.println("Sending Message...");
	}
}
