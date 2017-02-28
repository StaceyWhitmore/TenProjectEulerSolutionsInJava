package tenprojecteulersolutionsinjava;

import java.util.Scanner;
/*
 * Largest prime factor
 Problem 3
 Search Results
Prime Factor:
A factor that is a prime number: one of the prime numbers that, 
when multiplied, give the original number. 
Example: The prime factors of 15 are 3
 and 5 (3×5=15, and 3 and 5 are prime numbers).
 
 Prime Number: 
 A Prime Number can be divided evenly only by 1, OR itself.
AND it must be a whole number GREATER than 1.

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 * 
 * */

public class LargestPrimeFactor
{

	
	public static void main(String[] args)
	{
		

        final int NUMS_PER_LINE    = 12; // Display 12 Numbers before indenting to next line
        int count                  = 0;  // Count the number of prime numbers
        int number                 = 0;  // A number to be tested for primeness
        int squareRoot             = 1;  // To check whether number less than or equal to  squareRoot
        
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find it's largest prime factor");
		int n = input.nextInt();
		java.util.List<Integer> factorList = 
				new java.util.ArrayList<Integer>(); 
		
		for (int factor = 1; factor < n; factor++)
		{
			
			if (n % factor == 0) 
			{
				factorList.add(factor);
				//currentIndex++;
			}
		}
		
	
		
		// A list to hold prime numbers
	    java.util.List<Integer> primeFactorList =
	      new java.util.ArrayList<Integer>();
	    
	    System.out.println("The prime numbers are: \n");
	   
	    // Repeatedly find prime numbers
	    while (number <= factorList.size())
	   {
	      // Assume the number is prime
	      boolean isPrime = true; // Is the current number prime?

	      if (squareRoot * squareRoot < factorList.get(number)) squareRoot++;

	      // ClosestPair if number is prime
	      for (int i = 0; i < primeFactorList.size()
	                        && primeFactorList.get(i) <= squareRoot; i++)
	      {
	        if (factorList.get(number) % primeFactorList.get(i) == 0)
	        { // If true, not prime
	          isPrime = false; // Set isPrime to false         
	          break; // Exit the for loop
	        }
	      } // close for

	      // Print the prime number and increase the count
	      if (isPrime) // if isPrime == true
	      {
	        count++; // Increase the count
	        primeFactorList.add(factorList.get(number)); // Add a new prime to the list
	        if (count % NUMS_PER_LINE == 0)
	        {
	          // Print the number and advance to the new line
	          System.out.println(factorList.get(number));
	        }
	        else
	          System.out.print(factorList.get(number) + " ");
	      } // close outer if(isPrime) then prin number and up count 

	      // Check if the next number in factorList is prime 
	      number++;
	    } // close while
	   
	    
		System.out.println("The contents of the primeFactor list are are ");
		for (int i = 0; i < primeFactorList.size(); i++)
		{
			System.out.println("primeList.get(" + i + ") = " +  primeFactorList.get(i));
			
		}
		
	} // close main() 
} // close class: LargestPrimeFactor 
