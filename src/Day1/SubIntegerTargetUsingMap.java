package Day1;

import java.util.HashMap;
import java.util.Map;

public class SubIntegerTargetUsingMap {
  public static void main(String args[])
  {SubIntegerTargetUsingMap call=new SubIntegerTargetUsingMap();
	  int []arr= {1,2,3,4,5,6};
	  int target=7;
	  int [] result=call.get(arr,target);
	  System.out.println(result[0]+" "+result[1]);
  }
  public int[] get(int[] arr,int target)
  {
	  Map<Integer,Integer> isCotain=new HashMap<>();
	  for(int i=0;i<arr.length;i++)
	  {
		  int delta=target-arr[i];
		  if(isCotain.containsKey(delta))
		  {
			  return new int[] {i,isCotain.get(delta)};
		  }
		  isCotain.put(arr[i],i);
	  }
	  return new int[] {-1,-1};
  }
}
