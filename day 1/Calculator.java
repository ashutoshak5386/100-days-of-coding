
class Calculator
{
 public static void main(String args[])
        {

        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        switch (args[1])
        {
        case "+":

        System.out.println("Sum is "+ (a+b));
        break;
        case "-":

        System.out.println("Difference "+(a-b));
        break;
        case "*":

        System.out.println("Product is "+ (a*b));
        break;
        case "/":
        System.out.println("the division is"+ (a/b));
        break;
        case "%":
        System.out.println("the parsentage is "+ ((a*b)/100));
        break;}}}