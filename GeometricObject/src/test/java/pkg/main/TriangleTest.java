package pkg.main;

import static org.junit.Assert.*;

import org.junit.Test;

import pkg.main.Triangle;
import pkg.main.TriangleException;

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
	
	@Test
	public void Triangle2() {
		Triangle tri1 = new Triangle(2, 4, 6);
		tri1.getPerimeter();
		double dActualInt = tri1.getPerimeter();
		double dExpectInt = 12;
		assertEquals(dActualInt, dExpectInt, .001);
		
		System.out.print(tri1.toString());
		System.out.println();
	}
	
	@Test
	public void Triangle3() {
		Triangle tri3 = new Triangle();
		tri3.getPerimeter();
		double dActualInt = tri3.getPerimeter();
		double dExpectInt = 3;
		assertEquals(dActualInt, dExpectInt, .001);
		
		System.out.print(tri3.toString());
		System.out.println();
	}

	@Test(expected = TriangleException.class)
	public void TriangleException() throws TriangleException {

		Triangle tri2 = new Triangle(2, 4, 6);
		tri2.getArea();
	}
	
	@Test(expected = TriangleException.class)
	public void TriangleException1() throws TriangleException {

		Triangle tri3 = new Triangle(-1, 4, 6);
		tri3.getArea();
	}
}
