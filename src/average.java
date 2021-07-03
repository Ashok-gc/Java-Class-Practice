import java.util.Scanner;

class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first_number = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second_number = sc.nextInt();
        System.out.println("Enter the third number: ");
        int third_number = sc.nextInt();
        System.out.println("Enter the fourth number: ");
        int fourth_number = sc.nextInt();
        int average = (first_number+second_number+third_number+fourth_number)/2;
        System.out.println("The sum of average is :" + average);

    }
}
