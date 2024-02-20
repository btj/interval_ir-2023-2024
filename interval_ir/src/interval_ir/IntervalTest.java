package interval_ir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	@Test
	void test() {
		Interval interval = new Interval(3, 4);
		int lengte = interval.getLengte();
		assertEquals(4, lengte);
	}

}
