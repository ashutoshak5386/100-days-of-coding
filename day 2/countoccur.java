/*  to find the number of occurences of a
 single number from a bunch of numbers*/
public class countoccur {
    public static void main(String[] args) {
        int n = 55345;

        int count = 0;
        while (n> 0) {
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n = n / 10; //n /= 10
        }
        System.out.println(count);
        
        
    }
}
