import java.util.Scanner;
public class Main
{
    public static int factorial(int n){
        int f =1;
        for(int i = 1;i<= n;i++){
            f = f * i;
        }
        return f;
    }
    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);
        
        int binomialCoefficent = fact_n / (fact_r * fact_nr);
        return binomialCoefficent;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + " is : "+ factorial(n));
		System.out.print("Enter the value of r : ");
		int r = sc.nextInt();
		System.out.println("Binomial Coeffiecent  is : "+ binomial(n,r));
	}
}
