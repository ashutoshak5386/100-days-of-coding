import java.util.Scanner;
public class SMOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k==0||n<k)
		    System.out.println(n);
		    else
		    System.out.println(n%k);
		    
		}
    }
}
