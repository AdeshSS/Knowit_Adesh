package Day5;

public class Date
{
	
	private int dd,mm,yy;
	static int count=0;	

	public Date()
	{
		count = ++count;
	}

	public Date(int dd, int mm, int yy){
		count = ++count;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	

	public Date(Date d){
		count = ++count;
		this.dd = d.dd;
		this.mm = d.mm;
		this.yy = d.yy;
	}	

	public void showData(){
		System.out.println(dd + "/" + mm + "/" + yy);
		//System.out.println("Object of Date Created " + count + " times.");
	}


	public void showData(char ch){
		System.out.println(dd +""+ ch +""+ mm +""+ ch +""+ + yy);
		System.out.println("Object of Date Created " + count + " times.");
	}
}