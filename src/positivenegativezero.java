/** program to find whether the given program is positive, neagtive, or zero
 * */

import java.util.Scanner;

public class positivenegativezero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given number: ");
        int num = sc.nextInt();
        if (num>0)
        {
            System.out.println(num + "The given number is positive");
        }
        else if (num<0)
        {
            System.out.println(num + " The given number is negative");
        }
        else if (num == 0)
        {
            System.out.println(num + " The given number is zero");
        }
    }
}
