import java.util.Scanner;


public class ArithmeticOperators {

    Scanner scan = new Scanner(System.in); 

    public void showMenu() {
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		System.out.println("6.Modulus Complex");

	}

    //Add comments
    public double division(double firstNumber, double secondNumber) {
		//Add your code
		return 0.0;
	}

    //Add comments
	public double mutliplication(double firstNumber, double secondNumber) {
		//Add your code
		return 0.0;
	}

    //Add comments
	public double substraction(double firstNumber, double secondNumber) {
		//Add your code
		return 0.0;
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
    
}
