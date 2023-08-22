package asspackage;

public class Class3 extends Class2{
			
		
		public static void main(String args[]) {
			Class1 obj1=new Class1();
			obj1.setEmployee("john", 25000, 3000);//name,pay,bonus
			obj1.setdeduction(250);
			
			System.out.println("Basic pay "+obj1.getpay());
			//System.out.println();
			System.out.println("Deduction = "+obj1.getdeduction());
			
			Class2 obj2=new Class2();
			obj2.displaymethod();
			System.out.println("Bonus "+obj1.getbonus());
			
			//System.out.println("Calculated PF "+obj2.getpf()*obj1.getpay() );
			//System.out.println("Calculated Percentage "+obj2.getpercentage()*obj1.getpay());
			
System.out.println("Total Salary ="+  ((obj1.getpay() + obj2.getpercentage()) -
										(obj2.getpf() - obj1.getdeduction()) +
										obj1.getbonus()));
			
			

									//(basicpay+hra-pf-deduction+bonus)
			
			
		}
}
