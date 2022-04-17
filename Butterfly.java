package Display;

public class Butterfly {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++)

		{
			for (int j = 1; j <= i; j++)

			{
				if (j == 1 || j == i || j == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for (int j = 5; j >= i; j--)

			{
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j--)

			{
				if (j == 1 || j == i || j == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();

		}
		
		
		
		
		
		
		
		
		
		

		for (int i = 1; i <= 5; i++)

		{
			for (int j = 4; j >= i; j--)

			{
				if (j == 4 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for (int j = 0; j <= i; j++)

			{
				System.out.print("  ");
			}

			for (int j = 4; j >= i; j--)

			{
				if (j == 4 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}

	}
}
