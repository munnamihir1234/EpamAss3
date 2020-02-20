package epam.Task_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Compund_InterestTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Compund_Interest c=new Compund_Interest();
		assertEquals(Double.valueOf(216.65290240000013),c.calculate_compound_interest(1000.0,5.0,4.0));
	}

}
