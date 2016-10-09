package pkg.main;

// Thomas Pennington
// Quiz 3 Question 1

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	
	// Default constructor for the triangle 
	
	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	// Constructor for a triangle given three side lengths. 
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	// These are the getters for the three sides of the triangle.
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// This gets the area from the triangle given the three sides depending on
	// which constructor is called. If the triangle area when calculated is
	// given a negative side or is equal to a negative area a TriangleException is
	// thrown. Also, if the area when calculated is equal to zero will also throw 
	// the TriangleException. If the area is not equal to zero it performs the calculation 
	// and returns the area.

	public double getArea() throws TriangleException {

		double srt = (0.5) * (side1 + side2 + side3);
		double area = 0;
		double calc = srt * (srt - side1) * (srt - side2) * (srt - side3);

		if ((calc < 0) || (Math.sqrt(calc) == 0)) {
			throw new TriangleException(this);

		} else {
			area = Math.sqrt(calc);
		}

		return area;
	}

	// This method gets the perimeter of the triangle given three sides of a triangle.
	
	public double getPerimeter() {
		double perimeter = (side1 + side2 + side3);

		return perimeter;
	}

	// This is the toString method for the triangle class. It will return either the 
	// string with the description of the triangle if it is valid or an error message
	// if the triangle that has been created is not valid based on the sides that it has.
	
	@Override
	public String toString() {

		String strMessage = null;

		try {
			strMessage = ("The triangle has sides of length" + " " + getSide1() + ", " + getSide2() + ", " + getSide3()
					+ " " + "and has a perimeter of" + " " + getPerimeter() + " " + "with an area of" + " " + getArea()
					+ " " + "and was created on " + " " + getDateCreated());
		} catch (TriangleException e) {
			strMessage = "Invalid Triangle " + e.getTri().side1 + ", " + e.getTri().side2 + ", " + e.getTri().side3;
		}
		return strMessage;
	}

}
