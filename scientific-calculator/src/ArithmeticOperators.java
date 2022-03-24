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
		System.out.println("11.Midpoint");
		System.out.println("12.Triangle Area");
		System.out.println("13.Pythag");
		System.out.println("14.Circle Area");
		System.out.println("15.Sine");
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

		double sum1 = (b2 - a1);
		double sum2 = (a2 - b1);
		double sum3 = (sum2 / sum1);
		return sum3;
	}
	/* There are 4 parts to the midpoint formula.
	using the values c1,c2, d1 and d2. 
	The first is (c1+c2) as sum1 as part 2 will the be divided by 2 as sum 2
	sum two will be the result of the first point
	Part 3 will tabe (d1+d2)as sum 3 next will divide by 2 as sum 4 and then
	Sum4 will be the result of the second point
	*/
	/*public double midpoint1(double c1, double c2, double d1, double d2) {

		double sum1 = (c1 + c2);
		double sum2 = sum1 / 2;
		return sum2; 
		double sum3 = (d1 + d2);
		double sum4 = sum3 / 2;
		return sum4;
		double sum5 = (sum2 + "," + sum4)*/

	/* Triangle area is found using 1/2 base multiplied by the height
	where the base = t1
	height =t2*/

	public double trianglearea(double t1, double t2) {

			double sum1 = (t1 * t2);
			double sum2 = 0.5 * sum1;
			return sum2;
	}
	/* The Pythagorus Theorem is calculated by breaking the sum up into 
	3 segments
	where a = i, b = j and c = k.
	the square of both i and j need to be found as the first two segments
	the squareroot k of the sum of i and j squared answers. */
	public double pythag(double i, double j) {

		double sum1 = i * i;
		double sum2 = j * j;
		double sum3 = sum1 + sum2;
		double sum4 = Math.sqrt(sum3);
		return sum;

	}
	/* The circle formula  is Pie * r squared 
	this is brocken up into two segments 
	the aquaring of r first and then multiplying it by by, represented by 
	Math.PI*/
	public double cirlcearea(double v) {
		double sum1 = (v*v);
		double sum2 = Math.PI * sum1;
		return sum2;
	}
	public double sine(double w1, double w2){
		double sum1 = w1/w2;
		double sum2 = Math.sin(sum1);
		return sum2;
	}
		



}

