import java.util.Scanner;
class Productsumcalc {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int sum = 0;
      int n;
      int product = 1;
      n = scan.nextInt();
      while (n > 0) {
        sum += n % 10;
        product *= n % 10;
        n /= 10;
      } 
      System.out.println(product - sum);

      scan.close();
    
  }
}
