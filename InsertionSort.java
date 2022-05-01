/*Java program to sort the array using "Insertion sort" technique
 * Insertion sort: Take an element from an unsorted array and place it in its corresponding position in 
   the sorted part, and shift the elements accordingly.
 * Time ComplexityL O(N^2).
  Day 2 of 30 days of code
  */
public class InsertionSort
{
	static void Printarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[]= {8,1,10,5,4,9};
		System.out.print("Values before sorting the array :");
		Printarray(arr);
		//Applying Insertion sort Technique
		for(int i=0;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
			
		}
		System.out.print("Values After sorting the array : ");
		Printarray(arr);
	}
}
