import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class Calculator1Test {
	private static Calculator1 calculator = new Calculator1();

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
	}

	@Test
	public void testSub() {
		calculator.add(10);
		calculator.sub(4);
		assertEquals(8,calculator.getResult());
	}
	
	@Ignore("mul() Not yet implemented")
	@Test
	public void testMul() {
		
	}

	@Test
	public void testDiv() {
		calculator.add(8);
		calculator.div(4);
		assertEquals(4,calculator.getResult());
	}

}
