import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter a year: ");
            int year = input.nextInt();


//divisible by 4 but not by 100, unless it is also divisible by 400.

            if((year % 4 == 0) &&  (year%100 != 0) || (year%400 == 0 )){
                System.out.printf(" %d is a leap year",year);
            }else {
                System.out.printf(" %d are NOT a leap year",year);
            }


    } //end of main class
}