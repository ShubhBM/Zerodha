package Eclipse;

public class Calculator {
	
	public boolean M1(int a, float b)
	{
		float c= a+b;
		
		System.out.println(c);
		
		return true;
	}	
	
	public static void main(String[] args) 
	
	{
		Calculator abc=new Calculator();
		     
	boolean X=abc.M1(10, 20.55f);
		
		
		System.out.println("Above value is greater than 30 : "+X);
		
		
	}
}
	
	

	