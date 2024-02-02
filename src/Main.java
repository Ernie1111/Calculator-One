import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        double  numOne, numTwo, answer;
        String userInput;

        System.out.println("Please State what you would like to do. (Ex: Add, Sub, Multiply, or Divide)");
        userInput = user.next();

        //This If statement holds the addition part of the code
        if(userInput.equals("Add")){
            System.out.println("Enter first number: ");
            numOne = user.nextDouble();
            System.out.println("Enter Second Number: ");
            numTwo = user.nextDouble();
            answer = numOne + numTwo;
            System.out.println("Addition Number Answer: " + answer);

        }
        //This If statement holds the subtraction part of the code
        else if(userInput.equals("Sub")){
            System.out.println("Enter first number: ");
            numOne = user.nextDouble();
            System.out.println("Enter Second Number: ");
            numTwo = user.nextDouble();
            answer = numOne - numTwo;
            System.out.println("Subtraction Number Answer: " + answer);
        }
        //This if statement holds the multiplication part of the code
        else if(userInput.equals("Multiply")){
            System.out.println("Enter first number: ");
            numOne = user.nextDouble();
            System.out.println("Enter Second Number: ");
            numTwo = user.nextDouble();
            answer = numOne * numTwo;
            System.out.println("Multiplication Number Answer: " + answer);
        }
        //This if statement hold the Division part of the code
        else if(userInput.equals("Divide")){
            System.out.println("Enter first number: ");
            numOne = user.nextDouble();
            System.out.println("Enter Second Number: ");
            numTwo = user.nextDouble();
            answer = numOne / numTwo;
            System.out.println("Subtraction Number Answer: " + answer);
        }
    }
}