package BinarySearch;

public class Binary_1 {
	public static void main(String args[])
	{
		 int arr[]= {2,3,5,9,14,16,18};
		 int taget=15;
		 System.out.println(binary(arr,0,arr.length,taget));
	}
	public static int binary(int arr[],int start,int end,int tar)
	{
	
      int mid= (start+(end-start))/2;
     System.out.println(mid);
      if(arr[mid]==tar)
    	  return tar;
      if(arr[mid]>tar) {
    	 // if(arr[mid+1]<tar)
    		//  return arr[mid+1];
    	  binary(arr,start,mid-1,tar);}
      else if(arr[mid]<tar){
    	  //if(arr[mid-1]>tar)
    		  //return arr[mid-1];
    	  binary(arr,mid+1,end,tar);}
		
       return 0;
	}
 
}
