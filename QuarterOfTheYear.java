import java.util.Scanner;

/*
    Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

    For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.

    Constraint:

        1 <= month <= 12
 */
public class QuarterOfTheYear {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Input month: ");
        int month = scan.nextInt();

        scan.close();
        System.out.println(quarterOf(month));
    }

    public static int quarterOf(int month) {
        return month > 9 ? 4 : month > 6 ? 3 : month > 3 ? 2 : 1;
      }
      
}
