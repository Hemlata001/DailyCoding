import java.util.Scanner;
public class Main
{
    public static void printNaturalNumberDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNaturalNumberDecreasing(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		printNaturalNumberDecreasing(n);
	}
}
