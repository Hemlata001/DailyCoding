import java.util.Scanner;
public class Main
{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int smallAns = factorial(n-1);
        return n*smallAns;
        
    }
	public static void main(String[] args) {
	    Scanner sc = new  Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		
	}
}
