import java.util.Scanner;


public class ArithmeticOperators {

    Scanner scan = new Scanner(System.in); 

    public void showMenu() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		System.out.println("6.Modulus Complex");
		System.out.println("7.Quad Posistive");
		System.out.println("8.Quad Negative");
		System.out.println("9.Distance");
		System.out.println("10.Slope");
	}

    //function divides two numbers by each other
    public double division(double firstNumber, double secondNumber) {
		double val = firstNumber / secondNumber;
		return val;
	}

    //function multiplies two numbers by each other
	public double mutliplication(double firstNumber, double secondNumber) {
		double val = firstNumber * secondNumber;
		return val;
	}

    //Function subtracts the first number from the second number
	public double substraction(double firstNumber, double secondNumber) {
		double val = firstNumber - secondNumber;
		return val;
	}

    /**
     * This function performs addition on two numbers and returns the result of the addition operation
     * @param firstNumber
     * @param secondNumber
     * @return
     */
	public double addition(double firstNumber, double secondNumber) {
		double val = firstNumber + secondNumber;
		return val;
	}

	/**
	 * This function performs modulus operation on two numbers
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	public double modulus(double firstNumber, double secondNumber)
	{
		double val = firstNumber % secondNumber;
		return val;
	}


	/**
	 * This function performs modulus operation on three numbers
	 * @param firstNumber
	 * @param secondNumber
	 * @param thirdNumber
	 * @return 
	 */
	public double modulusComplex(double firstNumber, double secondNumber, double thirdNumber)
	{
		double val = (firstNumber % secondNumber) % thirdNumber;
		return val;
	}
	/* this function breaks down the quadratic equation to three basic
	equations by first taking set 1 = ((o squared)- (4 *n*p))
	This is then followed by set 2 = (2*n)
	the square root is found using the Math.sqrt function as set 3
	set1 answer is then square rooted and divided by set two to give set 4.
	The negative value of o (-o) is then added to the answer of set 4.
	the result is then returned  */
	public double quadPositive(double n, double o, double p) {
		double set1 = (o * o) - ( 4 * n * p);
		double set2 = (2 * n);
		double set3 = Math.sqrt(set1);
		double set4 = set3 / set2 ;
		double result = -o + set4;
		return result;
	}
		/* this function breaks down the quadratic equation to three basic
		equations by first taking set 1 = ((r squared)- (4 *q*s))
		This is then followed by set 2 = (2*q)
		the square root is found using the Math.sqrt function as set 3
		set1 answer is then square rooted and divided by set two to give set 4.
		The negative value of r (-r) is then subracted to the answer of set 4.
		the result is then returned  */
	public double quadNegative(double q, double r, double s) {
		double set1 = (r * r) - ( 4 * q * s);
		double set2 = (2 * q);
		double set3 = Math.sqrt(set1);
		double set4 = set3 / set2 ;
		double result = -r - set4;
		return result;	
		}
/* the formula breaks down the distance formula equation into 4 parts.
The first calulation is to find the difference of x1 and x2 the square the answer.
The second calculation is to find the difference between y1 and y2, then square the answer.
 The third part is to add the result of (x1-x2) squared and (yz-y1) squared
 The final is to square root the answer using the Math.sqrt. */
	public double distance(double x1, double x2, double y1, double y2) {

		double equation1 = (x1-x2);
		double equation2 = Math.pow(equation1,2);
		double equation3 = (y1-y2);
		double equation4 = Math.pow(equation3,2);
		double equation5 = Math.sqrt(equation2 + equation4);
		return equation5;
	}
		

    public double subtraction(double c, double d) {
        return 0;
    }
    
	/* Slope formula requires 4 variables a1,a2, b1,b2 to be divided 
	into each other in the formula
	Slope = b2-b1 / a2-a1  */

	public double slope(double a1, double a2, double b1, double b2) {

		double sum1 = (b2 -b1);
		double sum2 = (a2 - a1);
		double sum3 = (sum1 / sum2);
		return sum3;
	}

}
