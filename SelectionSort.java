
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
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
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
