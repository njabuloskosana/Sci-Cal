import ArithmeticOperators
calculator=ArithmeticOperators.ArithmeticOperators()
calculator.showMenu()
x = int(input("Enter a number from the menu: "))
match x:
    case 1:
        uefa = float(input("Enter a number: "))
        europa = float(input("Enter a number: "))
        champions=calculator.addition(uefa,europa)
        print("Your result is : "+str(champions))
    case 2:
        penalty = float(input("Enter a number: "))
        freekick = float(input("Enter a number: "))
        fouls=calculator.subtraction(penalty,freekick)
        print("Your result is : "+str(fouls))
    case 3:
        cassperNumber = float(input("Enter a number: "))
        naakNumber = float(input("Enter a number: "))
        res=calculator.multiplication(cassperNumber,naakNumber)
        print("Your result is : "+str(res))
    case 4:
        firstNumber = float(input("Enter a number: "))
        secondNumber = float(input("Enter a number: "))
        result=calculator.division(firstNumber,secondNumber)
        print("Your result is : "+str(result))