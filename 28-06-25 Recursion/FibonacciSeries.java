import java.util.Scanner;
public class Main
{
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int prevTerm  = fibonacci(n-1);
        int prevPrevTerm  = fibonacci(n-2);
        return prevTerm + prevPrevTerm;
        
    }
	public static void main(String[] args) {
	    Scanner sc = new  Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		System.out.println("Fibonacci number at position " + n + " is : " + fibonacci(n));
		System.out.print("Fibonacci Series: ");
		for(int i = 0;i<n;i++){
		    System.out.print(fibonacci(i)+" ");
		}
		
	}
}
