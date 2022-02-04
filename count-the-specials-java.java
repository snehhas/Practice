import java.io.*;
import java.util.*;
import java.lang.*;

class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        int count=0;
	    HashMap<Integer,Integer> frequency = findRepeating(a, n);
	    for (Map.Entry<Integer,Integer> entry : frequency.entrySet())
    		if (entry.getValue() == f)
    			count+=1;
    	System.out.println(count);
	    
    }
   
    static HashMap<Integer, Integer> findRepeating(int []arr, int size){
    	HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
    	for(int i = 0; i < size; i++)
    	{
    		if(frequency.containsKey(arr[i]))
    		{
    			frequency.put(arr[i], frequency.get(arr[i]) + 1);
    		}
    		else
    		{
    			frequency.put(arr[i], 1);
    		}
    	}
    	return frequency;
}
}

// Driver class
class GFG {
	public static void main (String[] args) {
	    
	    // Taking input through Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking size of array
		    int sizeof_array = sc.nextInt();
		    
		    //taking value of k
		    int k = sc.nextInt();
		    
		    //creating an array
		    int a[] = new int[sizeof_array];
		    
		    //inserting elements to the array
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    //creating an object of class Geeks
		    Geeks obj = new Geeks();
		    
		    //calling countSpecials method of 
		    obj.countSpecials(a, sizeof_array, k);
		}
		
	}
}
