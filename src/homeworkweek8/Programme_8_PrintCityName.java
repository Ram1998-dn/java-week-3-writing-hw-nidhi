package homeworkweek8;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The enter alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        Programme_8_PrintCityName programme8PrintCityName = new Programme_8_PrintCityName();
        programme8PrintCityName.printCityName(city);

    }
    public void printCityName(char city){
        if(city == 'A' || city == 'a'){
            System.out.println("Ajmer");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bihar");

        } else if (city == 'C' || city == 'c') {
            System.out.println("Channaia");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Daman");
        } else if (city == 'E' || city == 'e') {
            System.out.println("East");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Fan");
        }else{
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
