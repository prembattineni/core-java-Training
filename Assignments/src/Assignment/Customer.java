package Assignment;

public class Customer {


		   private int id;
		   private String name;
		   private String contactno;
		   Address address;
		public Customer(int id, String name, String contactno, Address address) {
			super();
			this.id = id;
			this.name = name;
			this.contactno = contactno;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", contactno=" + contactno + ", address=" + address + "]";
		}
		
		 

//		public static void main(String[] args) {
//				// TODO Auto-generated method stub
//				
//			   Employee e= new Employee(123,"prem","cse");
//			   e.show();
//			}
	//  
	   
		}



