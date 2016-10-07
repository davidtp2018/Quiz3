// Thomas Pennington
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

	public double getArea() throws TriangleException{
		
		double srt = (0.5) * (side1 + side2 + side3);
		double area = Math.sqrt(srt * (srt - side1) * (srt - side2) * (srt - side3));
		
		if (area != 0){
			return area;
		}else {
			
			double tris = getSide1();
			double tris2 = getSide2();
			double tris3 = getSide3();
			
			throw new TriangleException(tris, tris2, tris3);
	}
		}

	public double getPerimeter() {
		double perimeter = (side1 + side2 + side3);

		return perimeter;
	}

	 public String toString() throws TriangleException{
		 return ("The triangle has sides of length" + " " + side1 + ", " + side2 + ", " + side3 + " " 
				 + "and has a perimeter of" + " " + getPerimeter() + " " + "with an area of" 
				 + " " + getArea()); 
		 }
	 
	
}
