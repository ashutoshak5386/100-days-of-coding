import java.util.*;

public class NFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	         int u=sc.nextInt();
	         int v=sc.nextInt();
	         int a=sc.nextInt();
	         int s=sc.nextInt();
	         double vel = Math.sqrt(u*u - 2*a*s);
		    
		    if(vel > v){
		        System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");
		    }
    }
    
}
