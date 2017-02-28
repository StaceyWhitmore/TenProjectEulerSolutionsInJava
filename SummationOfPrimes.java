package tenprojecteulersolutionsinjava;


//Problem 10: Summation of Primes 
import java.util.Scanner;

public class SummationOfPrimes

{
public static void main(String[] args)
{
  
     final int NUMS_PER_LINE    = 12; // Display 12 Numbers before indenting to next line
     int count                  = 0;  // Count the number of prime numbers
     int number                 = 2;  // A number to be tested for primeness
     int squareRoot             = 1;  // To check whether number less than or equal to  squareRoot
     int sum					   = 0;
    
 Scanner inputN = new Scanner(System.in);
 System.out.print("Find all prime numbers <= n, enter n: ");
 int n = inputN.nextInt();

 // A list to hold prime numbers
 java.util.List<Integer> list =
   new java.util.ArrayList<Integer>();
 
 System.out.println("The prime numbers are: \n");
 inputN.close();

 // Repeatedly find prime numbers
 while (number <= n)
{
   // Assume the number is prime
   boolean isPrime = true; // Is the current number prime?

   if (squareRoot * squareRoot < number) squareRoot++;

   // ClosestPair if number is prime
   for (int i = 0; i < list.size()
                     && list.get(i) <= squareRoot; i++)
   {
     if (number % list.get(i) == 0)
     { // If true, not prime
       isPrime = false; // Set isPrime to false         
       break; // Exit the for loop
     }
   } // close for

   // Print the prime number and increase the count
   if (isPrime)
   {
     count++; // Increase the count
     list.add(number); // Add a new prime to the list
     if (count % NUMS_PER_LINE == 0)
     {
       // Print the number and advance to the new line
       System.out.println(number);
     }
     else
       System.out.print(number + " ");
   } // close outer if

   // Check if the next number is prime
   number++;
 } // close while

 System.out.println("\n" + count +
   " prime(s) less than or equal to " + n);

 
 
 //int[] listArray = list.toArray();
 
 
 //int[] listArray = new int[list.size()];
 for (int i = 0; i < list.size(); i++)
 {
 	//listArray[i] = list.get(i);
 	sum = sum + list.get(i);
 	
 }
 System.out.println("The sum of all primes below " + n + " is " + sum + " \n");
 



} // close main()
} // close class
	

	
	

