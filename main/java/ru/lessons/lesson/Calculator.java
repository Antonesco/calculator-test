package main.java.ru.lessons.lesson;

/**
 * This class for calculate numbers
 * and we have 5 operations
 * @author Elektron
 */

public class Calculator {
	
	private double result;
	private boolean save;
	
	/*public void calculate(int first, int second, String operation) {
		this.result = this.operation.get(operation).arithmetical(first, second);
	}*/
	
	/*
	 * Method for summarize numbers
	 * @param num1. 
	 * @param num2
	 */
	public void add(double num1, double num2){
		this.result = num1 + num2;
	}
	
	/*
	 * Method for subtract numbers
	 * @param num1
	 * @param num2
	 */
	public void subtract(double num1, double num2){
		this.result = num1 - num2;
	}
	
	/*
	 * Method for multiply numbers
	 * @param num1
	 * @param num2
	 */
	public void multiply(double num1, double num2){
		this.result = num1 * num2;
	}
	
	/*
	 * Method for divide numbers
	 * @param num1
	 * @param num2
	 */
	public void div(double num1, double num2){
		this.result = num1 / num2;
	}
	
	/*
	 * Method for pow numbers
	 * @param num1
	 * @param num2
	 */
	public void pow(double num1, double num2){
		this.result =  Math.pow(num1, num2);
	}
	
	/*
	 * method will clear result
	 * @this result
	 */
	public void clearResult(){
		this.result = 0;
	}
	
	/*
	 * method for result
	 * @return result
	 */
	public double getResult(){
		return this.result;
	}
	
	/*
	 * method for save result
	 * @return save
	 */
	public boolean save(){
		return save;
	}
	
}