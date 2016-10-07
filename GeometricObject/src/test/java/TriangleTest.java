import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void Triangle(){
	Triangle tri1 = new Triangle(1,2,3);
	tri1.getPerimeter();
	double dActualInt = tri1.getPerimeter();
	double dExpectInt = 6;
	assertEquals(dActualInt, dExpectInt, .001);
	
	}
	
	
}
