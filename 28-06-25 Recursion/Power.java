import java.util.*;
public class Power
{
    public static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        int smallAns = pow(p,q-1);
        return smallAns*p;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter p : ");
		int p = sc.nextInt();
		System.out.print("Enter q : ");
		int q = sc.nextInt();
		System.out.print("The value of p^q is : "  + pow(p,q));
		
	}
}
