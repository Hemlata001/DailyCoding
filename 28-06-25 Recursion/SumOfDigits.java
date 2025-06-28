import java.util.Scanner;
public class SumOfDigits
{
    public static int sumOfDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallAns  = sumOfDigits(n/10);
        return smallAns + n%10;
    }
	public static void main(String[] args) {
	    Scanner sc = new  Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		System.out.println("Sum of " + n + " is : " + sumOfDigits(n));
	}
}
