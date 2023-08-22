package asspackage;

public class Class2 extends Class1 {
	float percentage,pf;
	int calculate;
	public void sethra(float a, float b) {
		percentage=a;
		pf=b;
	}
	public float getpercentage() {
		return percentage;
	}
	public float getpf() {
		return pf;
	}
	public void  displaymethod()
	{
		Class2 obj2=new Class2();
		obj2.sethra(0.05f, 0.2f);
		System.out.println("Calculated Percentage "+obj2.getpercentage()* 25000 );
		System.out.println("Calculated PF "+obj2.getpf()* 25000);
		
	}
}
