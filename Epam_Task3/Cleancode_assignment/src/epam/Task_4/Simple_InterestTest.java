package epam.Task_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Simple_InterestTest {

	@Test
	void test() {
		Simple_Interest s=new Simple_Interest();
		assertEquals(Double.valueOf(400.0),s.calculate_simple_interest(2000.0,5.0,4.0));
	}

}
