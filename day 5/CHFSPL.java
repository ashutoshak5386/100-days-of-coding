import java.util.Scanner;
public class CHFSPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
             int min = ((a<b) && (a<c)) ? a : ((b<c)?b:c);
             if(min == a){
		        System.out.println(b+c);
		    }else if(min == b){
		        System.out.println(a+c);
		    }else{
		        System.out.println(a+b);
		    }
        }
    }
}
