import java.util.Scanner;

public class CSTOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int S = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    
		    double actualPrice = S + (S * C)/100.0;
		    
		    if((actualPrice<A) || (actualPrice>B))
		        System.out.println("No");
		    else
		        System.out.println("Yes");
		    
		    T--;
		}
    }
}
