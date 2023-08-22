package ass2package;

public class Class2 extends Class1 {
	String doorno,street,city;
	public void setAddress(String a, String b, String c) {
		this.doorno=a;
		this.street=b;
		this.city=c;
	}
	public String getdoorno() {
		return doorno;
	}
	public String getstreet() {
		return street;
	}
	public String getcity() {
		return city;
	}
	public static void main(String args[]) {
		Class2 obj1=new Class2();
		obj1.print();
		obj1.setAddress("92","Arconag", "NewBridge");
		System.out.println("Doorno "+obj1.getdoorno());
		System.out.println("Street "+obj1.getstreet());
		System.out.println("City "+obj1.getcity());

		
		
		
	}
	}

