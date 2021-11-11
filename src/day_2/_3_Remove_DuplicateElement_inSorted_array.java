package day_2;

public class _3_Remove_DuplicateElement_inSorted_array {

	public static void main(String[] args) {
     int arr[]= {1,2,3,4,4,5};
      int n= remove(arr);
      System.out.println(n);
	}
	public static int remove(int arr[])
	{
		if(arr.length==0)return 0;
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{//{1,1,2,3,3,4,5}
			//
			if(arr[i+1]!=arr[i])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		for(int s:arr)
			System.out.print(s+" ");
		return j+1;
	}
}
