import java.util.*;
public class Main
{
    public static void kMultiples(int n , int k){
        if(k==0){
            return;
        }
        kMultiples(n,k-1);
        System.out.print(n*k+" ");
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		System.out.print("Enter k : ");
		int k = sc.nextInt();
		kMultiples(n,k);
	}
}
