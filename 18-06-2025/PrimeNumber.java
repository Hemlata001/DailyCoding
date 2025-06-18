import java.util.Scanner;
public class Main
{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n==2){
            return true;
        }
        for(int i = 2; i<= n-1;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static boolean isPrimeOptimized(int n){
        boolean isPrime = true;
        if(n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println( n + " is Prime  : "+ isPrime(n));
		System.out.println( n + " is Prime  : "+ isPrimeOptimized(n));
	}
}
