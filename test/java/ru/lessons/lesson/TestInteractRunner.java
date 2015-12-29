package test.java.ru.lessons.lesson;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

import main.java.ru.lessons.lesson.InteractRunner;
import main.java.ru.lessons.lesson.Calculator;

/**
 * Class for testing Interact Runner
 * @author Eleñtron
 *
 */

public class TestInteractRunner {
	
	/*
	 * test add
	 */
	@Test
	public void testAdd(){
		Calculator calc = new Calculator();
		TestInput ts = new TestInput(new String[]{"1","+","1"});
		InteractRunner ir = new InteractRunner(calc, ts);
		ir.calculation();
		Assert.assertThat(calc.getResult(), is(2d));
	}
	
	/*
	 * test substract
	 */
	@Test
	public void testSub(){
		Calculator calc = new Calculator();
		TestInput ts = new TestInput(new String[]{"3","-","2"});
		InteractRunner ir = new InteractRunner(calc, ts);
		Assert.assertThat(calc.getResult(), is(1d));
	}
	
	/*
	 * test multiplication
	 */
	@Test
	public void testMulti(){
		Calculator calc = new Calculator();
		TestInput ts = new TestInput(new String[]{"3","*","4"});
		InteractRunner ir = new InteractRunner(calc, ts);
		Assert.assertThat(calc.getResult(), is(12d));
	}
	
	/*
	 * test division
	 */
	@Test
	public void testDiv(){
		Calculator calc = new Calculator();
		TestInput ts = new TestInput(new String[]{"8","/","4"});
		InteractRunner ir = new InteractRunner(calc, ts);
		Assert.assertThat(calc.getResult(), is(2d));
	}
	
	
	
}