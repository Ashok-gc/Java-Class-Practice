import java.util.Scanner;

public class posorneg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num>0){
            System.out.println(" The given number is postitive");
        }
        else {
            System.out.println(" The given number is negative");
        }
    }
}