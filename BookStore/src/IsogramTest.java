import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsogramTest {

	@Test
	void test() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("lumberjacks"));
	}
	
	@Test
	void test2() {
		Isogram isogram = new Isogram();
		assertTrue(isogram.check("ABD-rtg-lio"));
	}
	
	
}
