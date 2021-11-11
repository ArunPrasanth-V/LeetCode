package Day1;

public class NumberTORoman {
public static void main(String args[])
{
	int i=564;
	String thousands[]= {"","m","mm","mmm"};
	String hundreds[]= {"","c","cc","ccc","cd","d","dc","dcc","dccc","cdm"};
	String tens[]= {"","x","xx","xxx","Xl","l","lx","lx","lxx","lxxx"};
    String units[]= {"","i","ii","iii","iv","v","vi","vii","viii","xi"};
   System.out.println(
		   thousands[i/1000]+
		   hundreds[(i%1000)/100]+
		   tens[(i%100)/10]+
		   units[i%10]
		   );
}
}
