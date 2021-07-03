import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        int base=sc.nextInt();
        System.out.println("Enter the height of triangle: ");
        int height=sc.nextInt();
        int area=(base*height)/2;
        System.out.println("Area if triangle is "+ area + "cm square");
    }
}