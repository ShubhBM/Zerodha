package Display;

public class Age 
  {
	static int age=20;
	
	public static void Ramesh()
	{	
		if(age<18)
		{
			System.out.println("Ramesh is not eligible for voting");
		}
		
		else if(age>=18)
		{
			System.out.println("Ramesh is eligible for voting");
		}	
	}
	  
	public void Suresh()
	{
		if(age<18)
		{
			System.out.println("Suresh is not eligible for marriage");
		}		
	    
		else if(age>=18)
		{
			System.out.println("Suresh is eligible for marriage");
		}	
		
	} 
	
	public static void main(String[] args) 
	{
		System.out.println("If value taken for consideration is "+age+" then");
		Ramesh();
	 Age xyz= new Age();
	 xyz.Suresh();
	}
}