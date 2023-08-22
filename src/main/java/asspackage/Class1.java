package asspackage;

public class Class1 {
	String name;
	int pay, deduction;
	int bonus;
	public void setEmployee(String a,int b,int c) {
		 name=a;
		 pay=b;
		 bonus=c;
	}
	public String getname() {
		return name;	
	}
	public int getpay() {
		return pay;
	}
	public int getbonus() {
		return bonus;
	}
	public void setdeduction(int deduction) {
		this.deduction=deduction;
	}
	public int getdeduction() {
		return deduction;
	}
}
