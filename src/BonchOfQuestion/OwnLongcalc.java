package BonchOfQuestion;

public class OwnLongcalc {
	public static void main(String args[])
	{
	  solution1 call=new solution1();
	   String s=call.getall("malayalam");
	   System.out.print(s);
    } 
}
class solution1
{
	int resultStart;
	int resultLength;
	public String getall(String s)
	{
		int len=s.length();
		if(len<2)
		 return s;
		for(int i=0;i<s.length()-1;i++)
		{
			checkPal(s,i,i);//hello
			checkPal(s,i,i+1);//current..current+1=
		}
		System.out.println();
		return s.substring(resultStart,resultStart+resultLength);
	}
	private void checkPal(String s,int begin,int end)
	{
		while(begin>=0&&end<s.length() &&
			s.charAt(begin)==s.charAt(end))
		{
			begin--;
			end++;
		}
		//begin to end 
		begin++;end--;
		if(resultLength<end-begin)
		{
			resultStart=begin;
			resultLength=1+end-begin;
		}
	}
}
