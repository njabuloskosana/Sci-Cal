import java.util.Locale;
import java.util.Scanner;

 /**
  * Very very simple Java Scientific Calculator for beginners
 */

public class Calculator {
	Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		ArithmeticOperators calc = new ArithmeticOperators();
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		int x;
		double score;
		calc.showMenu();
		x = scan.nextInt();

		switch (x) {
		case 1:
            double a, b;
            System.out.println("Enter first value");
	    	a = scan.nextDouble();
	    	System.out.println("Enter first value");
		    b = scan.nextDouble();
			score = calc.addition(a,b);
			System.out.println("Your result is : "+ score);
            scan.close();
			break;
		case 2:
			// Add your code
            scan.close();
			break;
		case 3:
			// Add your code
            scan.close();
			break;
		case 4:
			// Add your code
            scan.close();
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}

	}

}