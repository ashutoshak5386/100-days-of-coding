import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter empID");
        int empID = in.nextInt();
       System.out.println("enter department");
        String department = in.next();

        switch(empID){
            case 1:
            System.out.println("kunal kuswaha");
            break;
            
            case 2:
            System.out.println("Rahul rana");
            break;

            case 3:
            System.out.println("emply number 3");
                switch (department){
                    case "IT":
                    System.out.println("Management department");
                    break;
                    case "Management":
                    System.out.println("management department");
                    break;

                    default:
                    System.out.println("no department found");

                }
                in.close();
        }

    }
}
