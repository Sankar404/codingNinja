
public class Solution { 

    public static int binarySearch(int[] arr, int num) {
    	//Your code goes here
        int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
    int mid=(start+end)/2;
    if(num==arr[mid])
    {
        return mid;
    }
    else if(num>arr[mid])
    {
        start=mid+1;
     
    }
    else 
    {
     
     end=mid-1;
    
	}
    }
    return -1;
    }

}
