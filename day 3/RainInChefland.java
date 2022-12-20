import java.util.Scanner;
public class RainInChefland {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int a=sc.nextInt();
		    if(a<3)System.out.println("LIGHT");
		    else if(a>=3 && a<7)
		    System.out.println("MODERATE");
		    else {
		        System.out.println("HEAVY");
		    }
		    
		}
	
	sc.close();
    }
}
