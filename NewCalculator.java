import java.util.Scanner;
import java.util.InputMismatchException;

public class NewCalculator {
private static double firstNumber = 0;
private static double secondNumber = 0;
private static double answer =0;
private static String operator = "-1";

static Scanner scan = new Scanner(System.in);

private static void add (double d1, double d2){
  //Insert your Code
}

private static void sub (double d1, double d2){
  //Insert your code
}

private static void mult (double d1, double d2){
  //Insert yor code
}

private static void div (double d1, double d2){
  //Insert your code
}

private static double enterDouble(){
  //Insert your code
  double input = 0;
  boolean error = true;
  System.out.print("Enter number: ");
  while (error){
    try{
      input = scan.nextDouble();
      error = false;
    }
    catch(InputMismatchException e){
      System.out.println("You have not entered a number: ");
      scan.next();//clear scanner
    }
  }
return input;
}
private static void enterOperator(){
  while (!(operator.equals("+") || operator.equals("-") ||
            operator.equals("*") || operator.equals("/"))){
            System.out.println("Enter an Operator: ");
            operator = scan.next();
            }
}

private static void printResult(){
  //
}

private static void printInstructions(){
  System.out.println("Step 1: Enter a number:");
  System.out.println("Step 2: Enter a operator: ");
  System.out.println("Step 3: Enter a number: ");
  System.out.println("Repeat step 2 and 3");
  System.out.println("Terminate softwear by entering anything else at step 2 or step3");
}

public static void main(String[] args){
  printInstructions();


  firstNumber = enterDouble();
  System.out.print("Enter an operartor:");
  operator = scan.next();
  secondNumber = enterDouble();


 }
}
