import java.util.Scanner;
public class Main
{
    static int iGCD(int x, int y){
        while(x%y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		System.out.println("GCD is : " + iGCD(x,y));
	}
}
