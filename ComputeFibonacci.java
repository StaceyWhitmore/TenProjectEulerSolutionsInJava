package tenprojecteulersolutionsinjava;


import java.util.Scanner; 

public class ComputeFibonacci {
  /** Main method */
  public static void main(String args[])
  {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an index for the Fibonacci number: ");
    int index = input.nextInt();
System.out.println(fib(index));
    
  } // close main()

  /** The method for finding the Fibonacci number */
  public static long fib(int index)
{
	  //public static int counter = 2;
	  //long[] fibArray = new long[index];
	  long fib;
    // fibArray[0] = 0;
      //fibArray[1] =  1;


    if (index == 0) // Base case
    	return 0;
    	//return fibArray[0];
   else if (index == 1) // Base case
	   return 1;
	  // return fibArray[1];
    else  
    {   
    	//fibArray[counter] = fib(fibArray[index - 1]) + fib(fibArray[index - 2]); 
    	fib = fib(index - 1) + fib(index - 2);
   return fib;
      
   	  } // close else 
   
    	 
  } // close fib()
  
  /*
  public static long fibSum(long[] fibArray)
  {
	  	 long sum = 0;
	   	  for(int i = 0; i <= fibArray.length; i++ )
	   	  {
	   		  sum = sum + fibArray[i];
	   	  }
	   	  return sum;
  } 
  */
  

  
} // CLOSE class ComputeFibonacci


//fib(7) = fib(6) + fib(4) = 13
//fib(6) = fib(5) + fib(4) = 8 
//fib(5) = fib(4) + fib(3) = 5
//fib (4) = fib(3) + fib(2) = 3
//fib(3) = fib(2) + fib(1)= 2 
//fib(2) = fib(1) + fib(0) = 1 + 0 = 1
//fib(1) = 1
//fib(0) = 0