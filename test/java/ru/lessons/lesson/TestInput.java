package test.java.ru.lessons.lesson;

import main.java.ru.lessons.lesson.Input;

/**
 * Test Class Input
 * We need testing 2 implemented methods
 * In order to check answers and also close methods
 * @author Eleñtron
 *
 */
public class TestInput implements Input{
	
	private String[] answers;
	
	private int index = 0;
	
	public TestInput(String[] answers){
		this.answers = answers;
	}
	
	/*
	 * (non-Javadoc)
	 * @see main.java.ru.lessons.lesson.Input#next()
	 * @param index
	 */
	@Override
	public String next() {
		return answers[index++];
	}
	
	/*
	 * (non-Javadoc)
	 * @see main.java.ru.lessons.lesson.Input#close()
	 */
	@Override
	public void close(){
	}

	
}