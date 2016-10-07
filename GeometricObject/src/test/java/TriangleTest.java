import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		assertTrue(1 == 1);
	}

	@Test
	public void Triangle() {
		Triangle tri1 = new Triangle(4, 5, 6);
		tri1.getPerimeter();
		double dActualInt = tri1.getPerimeter();
		double dExpectInt = 15;
		assertEquals(dActualInt, dExpectInt, .001);
		
		System.out.print(tri1.toString());
	}

	@Test(expected = TriangleException.class)
	public void TriangleException() throws TriangleException {

		Triangle tri2 = new Triangle(2, 4, 6);
		tri2.getArea();
	}

}
