package homeworkweek8;


import java.util.Scanner;

/**
 *  * 1. Write a java program that tells us that Input number is odd or even?
 *  * HINT: use ternary operator (? :)
 *  */

public class Programme_1_OddEvenTernaryOperator {
    //Scanner declaration for reading input form console
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the number : ");
          int number  = scanner.nextInt();
          isItOddOrEvenNumber(number);
          // closing the scanner object
          scanner.close();
      }
      public static void isItOddOrEvenNumber(int number){
          //ternary operator is used
          String evenOrOdd = (number % 2 == 0 )? "Even" : "Odd";
          System.out.println("The " +number+ " is " +evenOrOdd+ " number ");

      }
}
