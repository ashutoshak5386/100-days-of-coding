import java.util.Scanner;
public class PRACTICEPERF{
    public static void main(String[] args) {
        	int c = 0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for(int  i =0; i<4; i++)
		{
		     arr[i] = sc.nextInt();
		    if(arr[i] >= 10)
		    {
		        c++;
		    }
		}
		System.out.println(c);
		sc.close();
    }
}