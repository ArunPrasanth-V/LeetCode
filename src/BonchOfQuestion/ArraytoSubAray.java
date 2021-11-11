package BonchOfQuestion;

public class ArraytoSubAray {

}
class Solution {
    int startind;
    int endind;
    int temp[]=new int[2];
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            whichOne(nums,i,i,target);
            whichOne(nums,i,i+1,target);
        }
        if(startind+endind==target)
        { 
            temp[0]=startind;
            temp[1]=endind;
            return temp;
        }
        return null;
    }
    
    private void whichOne(int []arr,int start,int end,int t)
    {
    	 while(arr[start]+arr[end]!=t && arr[start]>=0 && arr[end]<arr.length)
         { 
        { 
            start--;
            end++;
        }
        start++;end--;
        if(arr[start]+arr[end]==0)
        {
            startind=start;
            endind=end;
        }
    }
}