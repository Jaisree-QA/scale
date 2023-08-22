package skylane;

public class Place extends Designation {
	String place;
	void setplace(String p)
	{
		this.place=p;
	}
	void print()
	{
		display();
		System.out.println("Place "+place);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Place obj=new Place();
			obj.setname("Jaisree");
			obj.setid(3188);
			obj.setdesignation("System Analyst");
			obj.setplace("Dublin");
			obj.print();
	}

}
