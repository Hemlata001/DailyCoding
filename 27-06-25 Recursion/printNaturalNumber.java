import java.util.Scanner;
public class Main
{
    public static void printNaturalNumber(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printNaturalNumber(n-1);
        System.out.println(n);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		printNaturalNumber(n);
	}
}
