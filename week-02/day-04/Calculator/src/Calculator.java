import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression:");
        Scanner expression = new Scanner(System.in);
        String expressionInput = expression.nextLine();
        System.out.println("Type in the first number");
        int num1 = expression.nextInt();
        System.out.println("Type in the second number");
        int num2 = expression.nextInt();
        calculate(expressionInput, num1, num2);


    }
    public static void calculate(String expression, int a, int b){


        if(expression.charAt(0) == '*'){
            int result = a * b;
            System.out.println(result);
        }
        if(expression.charAt(0) == '+'){
            int result = a + b;
            System.out.println(result);
        }
        if(expression.charAt(0) == '-'){
            int result = a - b;
            System.out.println(result);
        }
        if(expression.charAt(0) == '/'){
            double result =(double) a / b;
            System.out.println(result);
        }


    }
}