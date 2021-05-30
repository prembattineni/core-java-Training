package Assignment;



class A{
	int a=0;
}
public class Sample {

	static void m(A z) {
		z.a=10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A s=new A();
		m(s);
		System.out.println(s.a);
	}
	
}
