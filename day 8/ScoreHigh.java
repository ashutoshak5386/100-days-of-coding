import java.util.Scanner;
public class ScoreHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int N = sc.nextInt();
		    int arr[] = new int[4];
		    for(int i=0;i<4;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.println(arr[3]);
		}
    }
    
}
