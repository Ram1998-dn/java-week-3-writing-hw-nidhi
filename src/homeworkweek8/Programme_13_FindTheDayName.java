package homeworkweek8;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7  : ");
        int day = scanner.nextInt();
        findTheDaysName(day);

    }
    public static void findTheDaysName(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wedneday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Saturday");
                break;
            case 6 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contain 1 to 7 days");


        }
    }
}
