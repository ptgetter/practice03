package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			Operation operation = Operation.getOperation(tokens);
			if(operation != null) {
				int result = operation.calculate();
				System.out.println(result);
			}
			else {
				System.out.println("Invalid Input. Please retry.");
			}
		}
		
		scanner.close();

	}

}
