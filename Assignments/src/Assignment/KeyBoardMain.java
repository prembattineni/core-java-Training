package Assignment;

public class KeyBoardMain {
public static void main(String[] args) {
	HP hp=new HP("HP","Pavilion","8GB","1TB","5v","60cm");
	Dell dell=new Dell("Dell","Mega","16GB","1TB","2GB");
	System.out.println(hp);
	hp.noofkeys();
	System.out.println(dell);
	dell.noofkeys();
}
}
