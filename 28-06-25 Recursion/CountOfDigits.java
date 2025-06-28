import java.util.Scanner;
public class CountOfDigits
{
    public static int countOfDigits(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        int count  = countOfDigits(n/10);
        return count + 1;
    }
	public static void main(String[] args) {
	    Scanner sc = new  Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		System.out.println("Count of " + n + " is : " + countOfDigits(n));
	}
}
