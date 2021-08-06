package cs520.module5.L1_structures;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class P06_StackCaseStudy {

	public static void main(String[] args) throws Exception {

		System.out.print("Enter postfix expression (e.g. 2 3 * 4 5 * +): ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputs = input.split(" ");
		Stack<Integer> resultStack = new Stack<Integer>();

		for (String nextInput : inputs) {
			if (isNumber(nextInput)) {
				resultStack.push(Integer.parseInt(nextInput));
				System.out.printf("Pushing %s\n", nextInput);
			} else {
				// Pop the top two numbers from the stack
				int number2 = resultStack.pop();
				int number1 = resultStack.pop();
				int result;

				switch (nextInput) {
				case "+":
					result = number1 + number2;
					break;
				case "-":
					result = number1 - number2;
					break;
				case "*":
					result = number1 * number2;
					break;
				case "/":
					result = number1 / number2;
					break;
				default:
					throw new Exception("Unknown operator: " + nextInput);
				}

				// Push the result onto the stack
				resultStack.push(result);
				System.out.printf("OP:%s, Pop %d and %d, Push %d\n", nextInput, 
					number2, number1, result);
			}
			System.out.println("Stack contents: " + resultStack);
		}

		// End of input; result is at the top of the stack
		System.out.printf("%s = %d\n", input, resultStack.pop());

		// Close scanner
		scanner.close();
	}

	private static boolean isNumber(String input) {
		// Use a regular expression to check whether the
		// string contains only numbers
		return Pattern.matches("^\\d+$", input);
	}
}
