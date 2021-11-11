package Day1;

import java.util.HashMap;
import java.util.Map;

public class Roman_TO_Letter {
public static void main(String args[])
{
	String s="dclxiv";//500+100+50+10+5-1
	Map<Character,Integer> m=new HashMap<>();
	m.put('m',1000);
	m.put('d',500);
	m.put('c',100);
	m.put('l',50);
	m.put('x',10);
	m.put('v',5);
	m.put('i',1);
	int result=0;
	for(int i=0;i<s.length();i++)
	{
		if(i>0 &&m.get(s.charAt(i))>m.get(s.charAt(i-1)))
             result+=m.get(s.charAt(i))-2*m.get(s.charAt(i-1));		
		else
	    	result+=m.get(s.charAt(i));
	}
	System.out.println(result);
}
}
