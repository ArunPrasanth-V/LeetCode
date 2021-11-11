package day_2;

import java.util.Set;

public class ReverseAStringWithoutAffectingSpace_specialChar {

	public static void main(String[] args) {
		 String s="how are you?";
	     int i=0,j=s.length()-1;
	     String new_String1="";
	     String new_String2="";
	     while(i<s.length()/2)
	     {
	    	 if((s.charAt(i)>=48 &&s.charAt(i)<=57||
	    		s.charAt(i)>=65 &&s.charAt(i)<=90||
	    		s.charAt(i)>=97 &&s.charAt(i)<=122)) 
	    	 {
	    		 new_String1+=s.charAt(i);
	    		 i++;
	    	 }
	    	
	    	 
//	    	 else
//	    	 {
//	    		new_String2=s.charAt(i)+new_String2;
//	    		i++; 
//	    	 }
	    	 if((s.charAt(j)>=48 &&s.charAt(j)<=57)||
	 	    	(s.charAt(j)>=65 &&s.charAt(j)<=90)||
	    		(s.charAt(j)>=97 &&s.charAt(j)<=122))
	    	 {
	    		 new_String2=s.charAt(j)+new_String2;
	    		 j--;
	    	 }
//	    	 else
//	    	 {
//	    		 new_String1+=s.charAt(j);
//	    		 j--;
//	    	 }
	     }
    	 System.out.println(new_String1+new_String2);

	}
	
//special char -33 - 47,58 -64,91-94,123-126
//48-57   0-9
//65 -90  A-Z
//97 -122 a-z
}
