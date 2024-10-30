package homeworkweek8;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Character :");
        char ch = scanner.next().charAt(0);
        checkInputValueIsAlphabetNumberOrSymbol(ch);

    }
    public static void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch +" is Alphabet");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is Digit.");
            
        }else {
            System.out.println(ch+" is Symbol.");
        }
    }
}
