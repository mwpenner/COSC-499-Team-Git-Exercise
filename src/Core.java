import java.util.Scanner;

public class Core {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Open Scanner
		
		//Ask user for operation to complete
		System.out.print("Please enter your desired operation (+ for addition, - for subtraction, and * for multiplication): ");
		String operation = input.nextLine();
		
		//Ask user for first number
	    System.out.print("Please enter the first number you wish to use: ");
	    int firstNumber = Integer.valueOf(input.nextLine());
	    //Ask user for second number
	    System.out.print("Please enter the second number you wish to use: ");
	    int secondNumber = Integer.valueOf(input.nextLine());
	    
	    input.close(); //Close Scanner
	    int finalNumber = 0; //prep variable for use
	  //Switch case for future use. Each case will create an object to complete the operation, complete said operation, and put results into finalNumber variable
	    switch (operation){ 
	    	case "+":
	    		break;
	    	case "-":
	    		break;
			case "*":
				Multiplication myObject = new Multiplication();
				finalNumber = myObject.multiplication(firstNumber, secondNumber);
				System.out.print(equation(operation, firstNumber, secondNumber, finalNumber));
	    		break;
    		default:
    			System.out.print("Looks like we can not find the operation you entered. Please try again.");
    			break;
	    }
	}

	//Method for returning results to user
	public static String equation(String operation, int firstNumber, int secondNumber, int finalNumber) {
		return "Here is your equation: " + firstNumber + " " + operation + " " + secondNumber + " = " + finalNumber;
	}
}
