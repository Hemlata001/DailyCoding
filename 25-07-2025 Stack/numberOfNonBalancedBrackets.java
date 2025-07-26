import java.util.*;
public class Main
{
    public static boolean isbalanced(String str){
        Stack<Character>st = new Stack<>();
        int n = str.length();
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{ // ch == ')'
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
            
        }
        if(st.size()>0)return false;
        else return true;
    }
    public static int numberOfNonBalancedBrackets(String str){
        int ans = 0;
        Stack<Character> st = new Stack<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '(') st.push(ch);
            else if (ch == ')'){
                if (!st.isEmpty() && st.peek() == '(') st.pop();
                else ans++;
            }
        }
        ans += st.size();
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isbalanced(str));
		System.out.println(numberOfNonBalancedBrackets(str));
	}
}
