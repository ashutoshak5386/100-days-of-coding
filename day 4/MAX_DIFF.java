import java.util.Scanner;
public  class MAX_DIFF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
	    while(T-->0){
	        int n = sc.nextInt();
	        int s = sc.nextInt();
	        if(s<=n){
	            System.out.println(s);
	        }
	        else{
	            int d = Math.abs(n-s);
	            System.out.println(n-d);
	        }
	    }
        sc.close();
    }
}