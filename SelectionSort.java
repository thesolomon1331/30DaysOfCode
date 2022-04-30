/*Java Program to sort the elements using Insertion sort technique.
Insertion Sort: In this method the array will be divided into two parts i.e unsorted array and sorted array, and place it in its corresponding position in 
the sorted part, and shift the elements accordingly.
 * Time ComplexityL O(N^2).
*/
public class SelectionSort
{
	/*public */static void Printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
	public static void main(String args[])
	{
		int arr[]= {2,9,5,1,31};
		System.out.print("Before Sorting the elements");
		Printarray(arr);
		// Selection Sort technique
		for(int i=0;i<arr.length-1;i++)// Outer for loop
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)// Inner for loop
			{
				if(arr[j]<arr[smallest])
				{
					smallest=j;
				}	
			}
			//Swap
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		System.out.println("\n Values after Sorting the array");
		Printarray(arr);
	}
}
