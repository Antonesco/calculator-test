package test.java.ru.lessons.lesson;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

import main.java.ru.lessons.lesson.Calculator;

/**
 * Test Calculator Class
 * This class include 4 Methods
 * and we need test every method 
 * @author Elektron
 *
 */
public class TestCalculator{
	
	@Test
	//test method for add
	public void testAdd(){
		Calculator calc = new Calculator();
		calc.add(2, 4);
		Assert.assertThat(calc.getResult(),is(6d));
	}
	
	@Test
	public void testSubstract(){
		Calculator calc = new Calculator();
		calc.subtract(4, 2);
		Assert.assertThat(calc.getResult(),is(2d));
	}
	
	@Test
	public void testMultiply(){
		Calculator calc = new Calculator();
		calc.multiply(3,2);
		Assert.assertThat(calc.getResult(),is(6d));
	}
	
	@Test
	public void testDivide(){
		Calculator calc = new Calculator();
		calc.div(9,3);
		Assert.assertThat(calc.getResult(),is(3d));
	}
}