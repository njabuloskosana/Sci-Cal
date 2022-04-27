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
            double firstNumber;
			double secondNumber;
            System.out.println("Enter first value");
	    	firstNumber = scan.nextDouble();
	    	System.out.println("Enter first value");
		    secondNumber = scan.nextDouble();
			double result = calc.division(firstNumber, secondNumber);
			System.out.println("Your result is : "+ result);
            scan.close();
			break;

		case 2:
		    double cassperNumber;
		    double naakNumber;
		    System.out.println("Enter first value");
		    cassperNumber = scan.nextDouble();
		    System.out.println("Enter first value");
		    naakNumber = scan.nextDouble();
		    double res = calc.multiplication(cassperNumber, naakNumber);
		    System.out.println("Your result is : "+ res);
		    scan.close();
		    break;

		case 3:
		    double penalty;
		    double freekick;
		    System.out.println("Enter first value");
		    penalty = scan.nextDouble();
		    System.out.println("Enter first value");
		    freekick = scan.nextDouble();
		    double fouls = calc.subtraction(penalty, freekick);
		    System.out.println("Your result is : "+ fouls);
		    scan.close();
		    break;

		case 4:
		    double uefa;
		    double europa;
		    System.out.println("Enter first value");
		    uefa = scan.nextDouble();
		    System.out.println("Enter first value");
		    europa = scan.nextDouble();
		    double champions = calc.addition(uefa, europa);
		    System.out.println("Your result is : "+ champions);
		    scan.close();
		    break;

		case 5:
		    double chiefs;
		    double pirates;
		    System.out.println("Enter first value");
		    chiefs = scan.nextDouble();
		    System.out.println("Enter first value");
		    pirates = scan.nextDouble();
		    double derby = calc.modulus(chiefs, pirates);
		    System.out.println("Your result is : "+ derby);
		    scan.close();
		    break;

		case 6:
			double a;
			double b;
			double c;
			System.out.println("Enter first value");
			a = scan.nextDouble();
			System.out.println("Enter second value");
			b = scan.nextDouble();
			System.out.println("Enter third value");
			c = scan.nextDouble();
			double answer = calc.negativequadratic(a, b, c);
			System.out.println("Your result is : "+ answer);
			scan.close();
			break;
		    
		case 7:
			double d;
			double y;
			double z;
			System.out.println("Enter first value");
			d = scan.nextDouble();
			System.out.println("Enter second value");
			y = scan.nextDouble();
			System.out.println("Enter third value");
			z = scan.nextDouble();
			double output = calc.positivequadratic(d, y, z);
			System.out.println("Your result is : "+ output);
			scan.close();
			break;


		default:
			System.out.println("Wrong choice");
			break;
		}
	}

}
