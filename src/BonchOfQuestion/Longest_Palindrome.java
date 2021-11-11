package BonchOfQuestion;

//import java.util.HashMap;
//import java.util.Map;

public class Longest_Palindrome {
public static void main(String args[])
  {
	solutions call=new solutions();
     int [] arr= {2,3,4,5,6};
     int temp[]=new int[arr.length];
     for(int i=0;i<arr.length;i++)
	 {
    	 temp[i]=call.check(arr,i);
	 }
     for(int i:temp)
    	 System.out.println(i);
  }
}
class solutions
{
	public int check(int []arr,int position)
	{
		int value=arr[position],count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=position)
			{
				if(arr[i]%value==0||value%arr[i]==0)
					count++;
			}
		}
		return count;
	}
}
