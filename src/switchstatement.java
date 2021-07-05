/**
import java.util.Scanner;
public class switchstatement {
    public static void  main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any day from(1-7):");
        int day = sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("The day is Sunday");
            break;
            case 2:
                System.out.println("The day is Monday");
            break;
            case 3:
                System.out.println("The day is Tuesday");
            break;
            case 4:
                System.out.println("The day is Wednesday");
            break;
            default:
                System.out.println("Code Not Set");
        }


    }
}
*/
import java.util.Scanner;
public class switchstatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any day of week:(1-7)");
        int day = sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("The day is Sunday");
                break;
            case 2:
                System.out.println("The day is Monday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is Wednesday");
                break;
            default:
                System.out.println("Program Not Set");
        }
    }
}