/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Calendar;
import java.util.Scanner;
public class RetirementCalc {
    public static void main(String[] args) {
        int currentAge;
        int retirementAge;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentAge = sc.nextInt();
        System.out.print("At what age would you like to retire? ");
        retirementAge = sc.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsLeftToRetirement = retirementAge-currentAge;

        if(yearsLeftToRetirement >= 0) {

            int retirementYear = currentYear + yearsLeftToRetirement;
            System.out.println("You have "+yearsLeftToRetirement +" years left until you can retire.");
            System.out.println("It's "+currentYear+", so you can retire in "+retirementYear+".");
        }else {
            System.out.println("You can already retire");
        }

    }

}