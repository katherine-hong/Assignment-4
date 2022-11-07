
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PlotTestStudent {
	private Plot plot1, plot2, plot3, plot4, plot5;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(0, 0, 1, 1);
		plot2 = new Plot(0, 0, 1, 5);
		plot3 = new Plot(3, 4, 2, 2);
		plot4 = new Plot(2, 4, 5, 5);
		plot5 = new Plot(0, 0, 10, 10);
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot2 = plot3 = plot4  = plot5 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot2));
		assertTrue(!plot1.overlaps(plot4)); 
		assertTrue(plot3.overlaps(plot4)); 
		
	}
	
	@Test
	public void testEncompasses() {
		assertTrue(plot5.encompasses(plot1));
		assertTrue(plot5.encompasses(plot2));
		assertTrue(plot5.encompasses(plot3));
		
	}

	
	@Test
	public void testToString() {
		assertEquals("0,0,10,10",plot5.toString());	
	}
	
	

}
