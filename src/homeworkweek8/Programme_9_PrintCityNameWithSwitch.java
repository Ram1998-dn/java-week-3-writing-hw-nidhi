package homeworkweek8;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Alphabet between A to F :");
        String city = scanner.next().toUpperCase();
        Programme_9_PrintCityNameWithSwitch programme9PrintCityNameWithSwitch = new Programme_9_PrintCityNameWithSwitch();
        programme9PrintCityNameWithSwitch.printCityName(city);

        scanner.close();
    }

    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Ahmedbad");
                break;
            case "B":
                System.out.println("Bihar");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}

