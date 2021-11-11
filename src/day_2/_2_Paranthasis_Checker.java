package day_2;

import java.util.Stack;

public class _2_Paranthasis_Checker {

	public static void main(String[] args) {
		_2_Paranthasis_Checker call=new _2_Paranthasis_Checker();
		
		String s="{(()[])}";
        System.out.println(call.IsValid(s));
	}
	public boolean IsValid(String s)
	{
		if(s.length()%2!=0)return false;
		Stack<Character> stack=new Stack<>();
		for(char c:s.toCharArray())
		{
			if(c=='('||c=='{'||c=='[')
				stack.push(c);
			else if(c==')'&&!stack.empty()&&stack.peek()=='(')
				stack.pop();
			else if(c=='}'&&!stack.empty()&&stack.peek()=='{')
				stack.pop();
			else if(c==']'&&!stack.empty()&&stack.peek()=='[')
				stack.pop();
			else
				stack.push(c);
		}
		return stack.empty();
	}

}
