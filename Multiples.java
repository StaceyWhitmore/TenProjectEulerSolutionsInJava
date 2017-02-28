package tenprojecteulersolutionsinjava;
//List all multiples of 3 and 5 below 1000

public class Multiples 
{

	public static void main(String[] args) 
	{

		int N = 1000;
		int multIndex = 0;
		int sum = 0;
		int multCount = (N / 3)  + (N / 5);
		int[] multiples = new int[multCount];

		for (int i = 0; i < N; i++)
		{
			if (i % 3 == 0 || i % 5 == 0) 
					{
				multiples[multIndex] = i;
				multIndex++;
					} // close if
		} // close for loop 
		
		sum = multiples[0];
		for (int k = 0; k < multiples.length; ++k)
		{
		sum = sum + multiples[k];
		
		}
		System.out.println("The sum of all the mutliples of 3 and 5 below " + N + " is " + sum);
		
	} // close main()

} // close class: Multiples

