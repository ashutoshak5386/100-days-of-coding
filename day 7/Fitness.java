import java.util.Scanner;
public class Fitness {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    x= (x+x)*5;
		    System.out.println(x);
		    
		}
	}
}
