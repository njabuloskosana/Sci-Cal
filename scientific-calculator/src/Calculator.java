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
			double c, d;
			System.out.println("Enter first value");
			c = scan.nextDouble();
			System.out.println("Enter second value");
			d = scan.nextDouble();
			score = calc.subtraction(c,d);
			System.out.println("Your result is : "+ score);
			scan.close();
			break;

		case 3:
			double e, f;
			System.out.println("Enter first value");
			e = scan.nextDouble();
			System.out.println("Enter second value");
			f = scan.nextDouble();
			score = calc.mutliplication(e,f);
			System.out.println("Your result is : "+ score);
			scan.close();
			break;

		case 4:
			double g, h;
			System.out.println("Enter first value");
			g = scan.nextDouble();
			System.out.println("Enter second value");
			h = scan.nextDouble();
			score = calc.division(g,h);
			System.out.println("Your result is : "+ score);
			scan.close();
			break;

		case 5:
			double first;
			double second;
			System.out.println("Please enter first value");
			first= scan.nextDouble();
			System.out.println("Please enter second value");
			second = scan.nextDouble();
			double result = calc.modulus(first, second);
			System.out.println("Your result is : " + result);
            scan.close();
			break;
		case 6:
			double firstNumber;
			double secondNumber;
			double thirdNumber;
			System.out.println("Please enter first value");
			firstNumber= scan.nextDouble();
			System.out.println("Please enter second value");
			secondNumber = scan.nextDouble();
			System.out.println("Please enter third value");
			thirdNumber = scan.nextDouble();
			double modulusComplexResult = calc.modulusComplex(firstNumber, secondNumber ,thirdNumber);
			System.out.println("Your result is : " + modulusComplexResult);
            scan.close();
			break;
		default:
			System.out.println("Wrong choice");
			break;

		case 7:
			double n, o, p;
			System.out.println("Enter first value");
			n = scan.nextDouble();
			System.out.println("Enter second value");
			o = scan.nextDouble();
			System.out.println("Enter third value");
			p = scan.nextDouble();
			score = calc.quadPositive(n,o,p);
			System.out.println("Your result is : "+ score);
			scan.close();
        	break;
			
		case 8:
			double q, r, s;
			System.out.println("Enter first value");
			q = scan.nextDouble();
			System.out.println("Enter second value");
			r = scan.nextDouble();
			System.out.println("Enter third value");
			s = scan.nextDouble();
			score = calc.quadNegative(q,r,s);
			System.out.println("Your result is : "+ score);
			scan.close();
        	break;	

		case 9:
			double x1, x2, y1, y2;
			System.out.println("Enter first value");
			x1 = scan.nextDouble();
			System.out.println("Enter second value");
			x2 = scan.nextDouble();
			System.out.println("Enter third value");
			y1 = scan.nextDouble();
			System.out.println("Enter third value");
			y2 = scan.nextDouble();
			score = calc.distance(x1,x2,y1,y2);
			System.out.println("Your result is : "+ score);
			scan.close();
        	break;

		}

	}

}