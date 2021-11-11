package BonchOfQuestion;

public class LongestPalindromeSubstring {
	public static void main(String args[])
	{
		Solution call=new Solution();
		String s=call.checkPalin("carrace");
		System.out.println(s);
	}
}

class Solution
{
	int resultstart;
	int resultLength;
	public String checkPalin(String s)
	{
		int slen=s.length();
		if(slen<2) return s;
		for(int i=0;i<slen-1;i++)
		{
			longeRange(s,i,i);
			longeRange(s,i,i+1);
		}
		return s.substring(resultstart, resultstart+resultLength);
	}
	private void longeRange(String s,int begin,int end)
	{
		while(begin>=0&&end<s.length() &&
				s.charAt(begin)==s.charAt(end))
		{
			begin--;
			end++;
		}
		begin++;end--;
		if(resultLength<end-(begin-1))
		{
			resultstart=begin;
			resultLength=end-(begin-1);
		}
	}
}
