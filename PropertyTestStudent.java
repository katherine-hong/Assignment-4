
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PropertyTestStudent {
	Property p1;
	Property p2;
	Property p3;

	@BeforeEach
	void setUp() throws Exception {
		p1 = new Property("KK", "Germantown", 5000.00, "BB");
		p2 = new Property("SS", "Silver Spring", 100, "knot");
		p3 = new Property("TOK", "Rockville", 4500, "pli");
	}

	@AfterEach
	void tearDown() throws Exception {
		p1 = p2 = p3 = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("KK", p1.getPropertyName());
		assertEquals("SS", p2.getPropertyName());
		assertEquals("TOK", p3.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(5000.00, p1.getRentAmount());
		assertEquals(100.00, p2.getRentAmount());
		assertEquals(4500.00, p3.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, p1.getPlot().getX());
		assertEquals(0, p1.getPlot().getY());
		assertEquals(1, p1.getPlot().getWidth());
		assertEquals(1, p1.getPlot().getDepth());
		assertEquals(0, p2.getPlot().getX());
		assertEquals(0, p2.getPlot().getY());
		assertEquals(1, p2.getPlot().getWidth());
		assertEquals(1, p2.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("KK,Germantown,BB,5000.0",p1.toString());	
		assertEquals("SS,Silver Spring,knot,100.0",p2.toString());
		assertEquals("TOK,Rockville,pli,4500.0",p3.toString());
	}

}
