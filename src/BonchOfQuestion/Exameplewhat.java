package BonchOfQuestion;
public class Exameplewhat
{
	public static void main (String args[])
	{
		check cc=new check();
	    String str="aba";
		System.out.println(cc.checkPalin(str));
	}
}
class check
{
	static int totallength;
	static int start;
	public String checkPalin(String str)
	{
		if(str.length()<2)return str;
		for(int i=0;i<str.length()-1;i++)
		{
			palin(str,i,i);
			palin(str,i,i+1);
		}
		return str.substring(start,start+totallength);
	}
	public static void palin(String ss,int begin,int end)
	{
	       while(begin>=0&&end<ss.length()
	    	&&ss.charAt(begin)==ss.charAt(end))
		   {
			   begin--;
			   end++;
		   }		
         begin++;end--;
         if(totallength<end-(begin-1))
		 {
			 start=begin;
			 totallength=end-(begin-1);
		 }
	}
}