package main.java.ru.lessons.lesson;

import java.util.Scanner;

/**
 * Interact. Calculator
 * General describe about class (....)
 * @author Electron
 *
 */

public class InteractRunner{
	
	/**
	 * User Input Interface
	 */
	private final Input scan;
	private final Calculator calculator;
	
	/*
	 * method Interact Runner
	 * 
	 */
	public InteractRunner(Calculator calculator, Input scan){
		this.scan = scan;
		this.calculator = calculator;
	}
	
	/*
	 * method calculation
	 */
	public void calculation(){
		
		do{
			System.out.println("Input first argument: ");
			String first = scan.next();
			System.out.println("Input second ardument: ");
			String second = scan.next();
			System.out.println("Input operation: / * - + ");
			String operation = scan.next();
			
			switch(operation){
			case "+":
				calculator.add(Double.valueOf(first), Double.valueOf(second));
				break;
			case "-":
				this.calculator.subtract(Double.valueOf(first), Double.valueOf(second));
				break;
			case "/":
				this.calculator.multiply(Double.valueOf(first), Double.valueOf(second));
				break;
			case "*":
				this.calculator.div(Double.valueOf(first), Double.valueOf(second));
				break;
			}
			System.out.println(calculator.getResult());
			
			/*
			if(operation.equals(scan.equals("+"))){
				calculator.add(Double.valueOf(first), Double.valueOf(second));
			}else if (operation.equals(scan.equals("-"))){
				calculator.subtract(Double.valueOf(first), Double.valueOf(second));
			}
			*/
			
		}while("no".equals(scan.equals("Exit: yes/no ")));
	}
	
	public static void main(String[] args) {
		InteractRunner run = new InteractRunner(new Calculator(), new ConsoleInput(new Scanner(System.in)));
		run.calculation();
	}
	
}