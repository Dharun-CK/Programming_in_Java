import java.util.*;
public class stack_suf
{
    public static void main(String[] args) 
    {
    	Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        System.out.println("Postfix expression: " + str);
    Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) //
            {
                st.push(c-'0');
            } 
            else 
            {
                int a = st.pop();
                int b = st.pop();
                switch (c) {
                    case '+':
                        st.push(a + b);
                        break;
                    case '-':
                        st.push(b - a);
                        break;
                    case '*':
                        st.push(a * b);
                        break;
                    case '/':
                        st.push(b / a);
                        break;
                }
            }
        }

        System.out.println("Result: " + st.pop());
    }
}

