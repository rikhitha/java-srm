package day11.comparator.java.com;

import java.util.Stack;

public class InfixToPostfix {
    
    public static boolean isOperator(char op)
    {
        if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%')
        return true;
        return false;
    }
 
    
    public static int precedence(char op)
    {
        switch (op)
        {
            case '+' :
            case '-' :
                return 1;
            case '/' :
            case '*' :
                return 2;
            case '%' :
                return 3;
            default :
                return 4;
        }
    }
 
    
    public static boolean isLowerPrecedence(char op1, char op2)
    {
        if(precedence (op1) < precedence(op2))
         return true;
        return false;
    }
    public static String convertInixToPostfix(String infix)
    {
        Stack<Character> stack = new Stack();
        
        StringBuilder sb = new StringBuilder();
 
        for(int i=0; i<infix.length(); i++)
        {
            char currentCharacter = infix.charAt(i);
            
            if(!isOperator(currentCharacter))
            {
                sb.append(currentCharacter);
            }
            else{
                if(stack.empty()) stack.push(currentCharacter);
                else
                {
                    while(!stack.empty() && isLowerPrecedence(currentCharacter, stack.peek()))
                    {
                        sb.append(stack.pop());
                    }
                    stack.push(currentCharacter);
                }
            }
        }
        while(!stack.empty()) sb.append(stack.pop());
 
        return sb.toString();
    }

	public static void main(String[] args) 
	{
		System.out.println("Infix:::"+"b*c+f/j");
		
		System.out.println("PostFix:::"+convertInixToPostfix("b*c+f/j"));
    }
}


	


