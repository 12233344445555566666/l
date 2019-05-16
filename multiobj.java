package abc;

class mult1i{
	public int x;
	public void disp()
		{
			x=5;
			String y="ab";
			System.out.println(x+y);
			
}
}
public class multiobj extends multi{
	
	public static void main(String[] args)
	{	
		int y=5;
		mult1i m[]=new mult1i[5];
		
		
		for(int i=0;i<y;i++)
		{
			m[i]=new mult1i();
			m[i].disp();
		}
	}

}
