/**
import java.util.Scanner;

public class nested_if{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the weight: ");
        int weight = sc.nextInt();
        if (age>18){
            if(weight>50){
                System.out.println("You are elligible");
            }else{
                System.out.println("You aren't elligible");
        }

        } if (age<18){
            System.out.println("Age must be over 18");
        }
        else if (weight<50){
            System.out.println("Weight must be above 50");
        }
    }
}
*/

/**
import java.util.Scanner;
public class nested_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the weight: ");
        int weight = sc.nextInt();
        if (age>18){
            if (weight>50){
                System.out.println("You are elligible to give blood");
            }
            else{
                System.out.println("you are under weight");
            }
        }
        else{
            System.out.println(" You are under aged");
        }
    }
}
 */

import java.util.Scanner;
public class nested_if{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        System.out.println("Enter the Weight: ");
        int weight = sc.nextInt();
        if (age>18){
            if (weight>50){
                System.out.println("You can donate blood");
            }
            else{
                System.out.println("You are under weight");
            }
        }
        else{
            System.out.println("You are under aged");
        }
    }
}