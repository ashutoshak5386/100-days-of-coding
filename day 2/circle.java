import java.util.Scanner;
public class circle 
{
    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius of circle:");
        r = scan.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
    }            
}