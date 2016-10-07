// Thomas Pennington
// Quiz 3 Question 1
public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

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

	public double getPerimeter() {
		double perimeter = (side1 + side2 + side3);

		return perimeter;
	}

	@Override
	public String toString() {
		
		String strMessage = null;
		
		try
		{
			strMessage =  ("The triangle has sides of length" + " " + getSide1() + ", " + getSide2() + ", " + side3
					+ " " + "and has a perimeter of" + " " + getPerimeter() + " " + "with an area of" 
					+ " " + getArea() + " " + "and was created on " + " " + getDateCreated());
		}
		catch (TriangleException e)
		{
			strMessage = "Invalid Triangle " + e.getTri().side1 + ", " + e.getTri().side2 + ", " 
						+ e.getTri().side3;
		}
		return strMessage;
	}

}
