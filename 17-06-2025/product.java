import java.util.*;
public class Main
{
    public static int product(int a, int b){
        int result = a*b;
        return result;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.println("After Product of a and b : " + product(a,b));
		
	}
}
