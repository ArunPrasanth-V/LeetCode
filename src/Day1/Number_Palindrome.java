package Day1;

public class Number_Palindrome {
   public static void main(String []args)
   {
	   solution2 call=new solution2();
	   int num=1234321;
	   System.out.println(call.check(num));
   }
}
class solution2
{
	public  String check(int num)
	{
		int temp1=num;
		if(num<0)
			return "not Palin";
		int temp=0;
		while(num>0)
		{
			int s=num%10;
			num=num/10;
			temp=(temp*10)+s;
		}
		num=temp1;
		if(num==temp||num==temp%10)
			return "Palin";
		return "not Palin";
	}
}
