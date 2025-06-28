import java.util.*;
public class PowerAlternativeApproach
{
    public static int powAl(int p, int q){
        if(q==0){
            return 1;
        }
        int smallAns = powAl(p,q/2);
        if(q%2==0){
            return smallAns * smallAns;
        }
        return p * smallAns * smallAns;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter p : ");
		int p = sc.nextInt();
		System.out.print("Enter q : ");
		int q = sc.nextInt();
		System.out.print("The value of p^q is : "  + powAl(p,q));
		
	}
}
