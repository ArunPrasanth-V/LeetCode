package day_2;

public class _1_Longest_commmon_prifix {
   public static void main(String args[])
   {
	   String s[]={"flower","flow","flowight"};
      System.out.println(doing(s));
   }
   public static String doing(String s[])
   {
	   if(s.length==0)return "";
	    String str=s[0];
	    for(int i=1;i<s.length;i++)
	    {
	    while(s[i].indexOf(str)!=0)
             str=str.substring(0,str.length()-1);
	    }return str;
   }
}
