package tenprojecteulersolutionsinjava;


/*
 * https://projecteuler.net/problem=4
 * Problem 4
 * Largest Palindrom Product 
 * 
 * 
 * Largest palindrome product
Problem 4

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 * */
public class LargestPalindromeProduct
{
	public static boolean isPalindrome(int n)
	{
		  int remainder;
		  int sum=0;
		  int temp;    

		  temp = n;    
		  while(n > 0)
		  {    
		   remainder = n % 10;  
		   sum=(sum * 10) + remainder;    
		   n=n/10;    
		  }    
		  if(temp == sum) return true;  
		  else return false;	  
	}//close isPalindrome()
	
public static void main(String[] args) 
{
	int[] twoDigitNumbers = new int[1000];
	java.util.List<Integer> palProductsList = 
			new java.util.ArrayList<Integer>();
for (int i = 0; i < 1000; i++)
{
	twoDigitNumbers[i] = i;
} // close for

for (int j = 0; j < 1000; j++)
{
	for (int x = 0; x < 1000; x++)
	{
	int temp = twoDigitNumbers[j] * x;

	if(isPalindrome(temp)) // originally  String.valueOf(temp)
	{
		//System.out.println(temp + " is a palindrome");
		palProductsList.add(temp);
		//if(temp == 9009) System.out.println("temp is " + temp)
	} 
	} // close inner for x
	
} // close outer for j 

//Find and print out min and max values
int min = palProductsList.get(0);
int max = palProductsList.get(0);

for(Integer y: palProductsList) 
{
    if(y < min) min = y;
    if(y > max) max = y;
}
System.out.println("min = " + min);
System.out.println("max = " + max);

} // close main() 
} // close class
