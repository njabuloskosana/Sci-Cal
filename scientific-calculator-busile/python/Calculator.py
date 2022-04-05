import ArithmeticOperators
calculator=ArithmeticOperators.ArithmeticOperators()
calculator.showMenu()
x = int(input("Enter a number from the menu: "))
match x:
    case 1:
        first = float(input("Enter a number: "))
        second = float(input("Enter a number: "))
        result=calculator.addition(first,second)
        print("Your result is : "+str(result))
    case 2:
        #Add code
        print("")
    case 3:
        #Add code
        print("")
 