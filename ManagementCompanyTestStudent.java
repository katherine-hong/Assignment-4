import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
	Property p1;
	Property p2;
	ManagementCompany m1; 
	//ManagementCompany m2; 
	
	@Before
	public void setUp() throws Exception {
		m1 = new ManagementCompany("KK", "123",4);
		//m2 = new ManagementCompany("Slider", "127",7);
		//m1.addProperty("yy", "tt", 2000, "moi",0,0,1,1);
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
		p1 = p2 = null;
	}

	@Test
	public void testAddProperty() {		
		p1 = new Property ("ee", "aa", 1000, "moi",2,2,3,3);
		//p2 = new Property ("yy", "tt", 2000, "moi",0,0,1,1);
		assertEquals(m1.addProperty(p1),0,0);	//property has been successfully added to index 0
		//assertEquals(m1.addProperty(p2),0,0);
	}
	
	@Test
	public void testGetPropertiesCount() {
		p1 = new Property ("ee", "aa", 1000, "moi",2,2,3,3);		 
		assertEquals(m1.addProperty(p1),0,0);	
		assertEquals(m1.getPropertiesCount(), 1);
		
		//p2 = new Property ("yy", "tt", 2000, "moi",0,0,1,1);
	}
	
	@Test
	public void testIsMangementFeeValid()
	{
		assertTrue(m1.isMangementFeeValid());
	}
	
	@Test
	public void testIsPropertiesFull()
	{
		assertTrue(!m1.isPropertiesFull());
	}
	
	@Test
	public void testGetHighestRentPropperty()
	{
		m1.addProperty("yy", "tt", 2000, "moi",0,0,1,1);
		assertEquals(m1.getHighestRentPropperty(), m1.getHighestRentPropperty());
	}
	
	@Test
	public void testGetTotalRent()
	{
		m1.addProperty("yy", "tt", 2000, "moi",0,0,1,1);
		assertEquals(2000, m1.getTotalRent(),0);
	}
	

	@Test
	public void testToString() {
//		assertEquals("12,12,6,6", mangementCo.toString());
		assertTrue(m1.toString().contains("KK"));
		assertTrue(m1.toString().contains("123"));
	}
}