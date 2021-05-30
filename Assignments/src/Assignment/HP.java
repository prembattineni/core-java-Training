package Assignment;

public class HP extends Laptop implements Keyboard {
	
  String ChargerypTe;
  String ScreenSize;
public HP(String brandName, String model, String ram, String storage, String chargerypTe, String screenSize) {
	super(brandName, model, ram, storage);
	ChargerypTe = chargerypTe;
	ScreenSize = screenSize;
}
@Override

public void noofkeys() {
	System.out.println("Number of keys in HP are : 32");
}
@Override
public String toString() {
	return "HP [ChargerypTe=" + ChargerypTe + ", ScreenSize=" + ScreenSize + ", brandName=" + brandName + ", model="
			+ model + ", ram=" + ram + ", Storage=" + Storage + "]";
}
  
  
}
