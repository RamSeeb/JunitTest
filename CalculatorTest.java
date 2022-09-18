package Programming;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void myjunit() {
		Calculator junit = new Calculator();
		int result = junit.add(100, 200);
		assertEquals(300,result);
		
	}

}
