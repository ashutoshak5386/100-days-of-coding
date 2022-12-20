import java.util.Scanner;
public class Manysum {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- > 0) {
		    int L=sc.nextInt(), R=sc.nextInt();
		    System.out.println(2*R - 2*L + 1);
		}
	}
}
