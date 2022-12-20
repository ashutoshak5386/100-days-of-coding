import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class MXEVNSUB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		while(T-- > 0){
		    int N =sc.nextInt();
		    if(( (N-1) / 2) % 2 == 0 ){
		       System.out.println(N - 1);
		    }
		    else
		    System.out.println(N);
		}
	}
}