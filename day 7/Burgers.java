import java.util.Scanner;
public class Burgers {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    if(A==B)
		    System.out.println(A);
		    else if(A<B)
		      System.out.println(A);
		    else
		     System.out.println(B);
		}
	}
}
