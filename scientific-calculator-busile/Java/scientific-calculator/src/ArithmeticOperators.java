import java.util.Scanner;


public class ArithmeticOperators {

    Scanner scan = new Scanner(System.in); 

    public void showMenu() {
		System.out.println("1.Division");
		System.out.println("2.Multiplication");
		System.out.println("3.Subtraction");
		System.out.println("4.Addition");
		System.out.println("5.Modulus");
		System.out.println("6.Negativequadratic");
		System.out.println("7.Positivequadratic");

	}

    /**
	 * The division function performs a division operation performed between two values, called operands, using the division operator 
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
    public double division(double firstNumber, double secondNumber) {
		double result=firstNumber/secondNumber;
		return result;
	}

    /**
	 * The multiplication function performs multiplication operation of two values the values can be either two constant values, a variable and a constant value, or two variables
	 * @param cassperNumber
	 * @param naakNumber
	 * @return
	 */
	public double multiplication(double cassperNumber, double naakNumber) {
		double res=cassperNumber*naakNumber;
		return res;
	}

    /**
	 * The subtraction function performs the subtraction operation of one value from another. This can be a subtraction of a constant value from another constant value, a constant value from a variable, or a variable from a variable
	 * @param penalty
	 * @param freekick
	 * @return
	 */
	public double subtraction(double penalty, double freekick) {
		double fouls=penalty-freekick;
		return fouls;
	}

    /**
	 * The addition function performs the addition operation of two values. This can be an addition of two constants, a constant and a variable, or a variable and a variable
	 * @param uefa
	 * @param europa
	 * @return
	 */
	public double addition(double uefa, double europa) {
		double champions=uefa+europa;
		return champions;
	}

	/**
	 * The modulus function performs a modulus operation on two numbers and returns the reminder when the two numbers are devided
	 * @param chiefs
	 * @param pirates
	 * @return
	 */
	public double modulus(double chiefs, double pirates) {
		double derby=chiefs%pirates;
		return derby;
	}

	public double negativequadratic(double a, double b, double c) {
		double insidesqrt =(b*b)-4*a*c;
		double numerator = Math.sqrt(insidesqrt);
		double denominator = 2*a;
		double value = numerator/denominator;
		double result = -b- value;
		return result;
    }

	public double positivequadratic(double a, double b, double c) {
		double insidesqrt =(b*b)-4*a*c;
		double numerator = Math.sqrt(insidesqrt);
		double denominator = 2*a;
		double value = numerator/denominator;
		double result = -b+value;
		return result;
    }

	/**
	 * The quadratic formula function performs a quadratic (parabolic) equation for determining the x-intercepts
	 * @param a = 1
	 * @param b = 4
	 * @param c = 4
	 * @return
	 */
	/*public class Quadratic {
	  public static void main (String[] args) { 
		// value a, b, and c
		double a = 1, b = 4, c = 4;
		double root1, root2;

		// calculate the determinant (b^2 - 4ac)
		double determinant = b * b - 4 * a * c;
		System.out.println ("value of determinant is:" +determinant);

		// condition for real and different roots
		if (determinant > 0) {
		    root1 = (-b + Math.sqrt(determinant)) / (2 * a);
		    root2 = (-b - Math.sqrt(determinant)) / (2 * a);

		   System.out.format("root1 = %.2f and root2 = %.2f, root1, root2");
		}
		// Condition for real and equal roots
		else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
		
			System.out.format("root1 = root2 = %.2f;", root1);
	    }
		// if roots are not real
		else { 
			double realPart = -b / (2 *a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart);
		}
	}*/
}
	

