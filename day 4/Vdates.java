import java.util.Scanner;
public class Vdates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0;i<t ;i++ ){
		    int d = sc.nextInt();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    if(l>d){
		        System.out.println("Too Early");
		    }else if(r<d){
		        System.out.println("Too Late");
		    }else{
		        System.out.println("Take second dose now");
		    }
		}
        sc.close();
    }
    
}
