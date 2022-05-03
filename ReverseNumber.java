/*Java program to Reverse a number
Day 4 of 30DaysOfCode
 */
public class ReverseNumber 
{
	public static void main(String[] args)   
	{  
		int number = 987654, reverse = 0;  
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  // Logic
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  


