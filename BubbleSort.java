/*Java Program to sort the give array of elements using Bubble sort technique
 * Bubble Sort: It is the simplest sorting algorithm, where current element is compared with its next
 * element if value is greater then Swapped.
 * Time complexity of this algorithm is O(N^2)
 * */
public class BubbleSort
{
	public static void Printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	public static void main(String args[])
	{
		int arr[]= {10,2,1,9,8};
		System.out.println("Values before Swapping: ");
		Printarray(arr);
		// Applying Bubble Sort technique....
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("\nValues after Sorting");
		Printarray(arr);
		
		
		
	}

}
