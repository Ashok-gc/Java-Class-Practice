import java.util.Scanner;
public class simple_calculator {
    public static void  main(String[] args){
        char operator;
        Double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, *, /, or -");
        operator = input.next().charAt(0);

        System.out.println("Enter the first number: ");
        number1= input.nextDouble();

        System.out.println("Enter the second number: ");
        number2= input.nextDouble();

        switch (operator)
        {
            case '+':
                result = number1 + number2;
                System.out.println("The + of both number is" + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("The - of both number is" + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("The / of both number is" + result);
                break;
            case '*':
                result = number1*number2;
                System.out.println("The * of the number is" + result);
                break;
            default:
                System.out.println("Not set");



        }


    }
}
