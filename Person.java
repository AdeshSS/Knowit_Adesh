package Day5;

public class Person{
	private String name;
	private Date bdate;
	
	public Person(){
		name = new String("Rushabh");
		bdate = new Date(14,1,2001);
	}

	public Person(String name, int d, int m, int y){
		this.name = new String(name);
		this.bdate = new Date(d,m,y);
	}
	
	public void Display()
	{
		System.out.println("Name: " + name);
		if(bdate != null)
		{
			bdate.showData();
		}
	}
}