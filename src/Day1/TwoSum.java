package Day1;

import java.util.HashMap;
import java.util.Map;

/*
 * so the algorithm here is we want to collect 
 * the number in map
 * we have array, target element..
 * now target -current element na oru value kedei ku antha value
 * antha map la irrka nu pakka nu apadi irrthuna
 * so,the value is found
 * 
 * 
 */
public class TwoSum {
 public static void main(String args[])
 {
	 int []arr= {2,3,7,4,8};
	 int target=7;
	 int temp[]=doCalc(arr,target);
	 for(int i:temp)
	 {
		System.out.println(i); 
	 }
 }
public static int[] doCalc(int[] arr,int target)
{
	Map<Integer,Integer> collect=new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
		int delta=target-arr[i];
		if(collect.containsKey(delta))
		{
			return new int[] {collect.get(delta),i};
		}
		collect.put(arr[i],i);
	}
	return new int[] {-1,-1};
}
}

