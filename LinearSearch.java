/*Java program to find the element in an array using linear search technique
 Day 5 of 30daysOfCode 
 */
public class LinearSearch 
{  
	public static int linearSearch(int[] arr, int key){    
	for(int i=0;i<arr.length;i++){    
		  if(arr[i] == key){    
		                return i;    
		            }    
		        }    
		        return -1;    
		    }    
		    public static void main(String a[]){    
		        int[] a1= {10,20,30,50,70,90};    // Array Inilization
		        int key = 50;    
		        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
		    }    
}    
