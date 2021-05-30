package Assignment;

public class Dell extends Laptop implements Keyboard {
 String GraphicCardSize;

public Dell(String brandName, String model, String ram, String storage, String graphicCardSize) {
	super(brandName, model, ram, storage);
	GraphicCardSize = graphicCardSize;
}
@Override
public String toString() {
	return "Dell [GraphicCardSize=" + GraphicCardSize + ", brandName=" + brandName + ", model=" + model + ", ram=" + ram
			+ ", Storage=" + Storage + "]";
}
public void noofkeys() {
	System.out.println("Number of keys in HP are : 29");
}
 
}
