import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius=sc.nextInt();
        double pi=3.14;
        double area=pi*(radius*radius);
        System.out.println("The area of cicle is "+ area + "cm square");

    }
}
