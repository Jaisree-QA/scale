package ass2package;

public class Class1 {
		String name,rollno;
	public void setstudent(String a, String b) {
	name=a;
	rollno=b;			
		}
	public String getname() {
		return name;
		}
	public String getrollno(){
		return rollno;
	}
	public void print() {
		Class1 obj=new Class1();
		obj.setstudent("Basil", "56");
		System.out.println("Student name = "+obj.getname());
		System.out.println("Roll No = "+obj.getrollno());
		
	}
}
