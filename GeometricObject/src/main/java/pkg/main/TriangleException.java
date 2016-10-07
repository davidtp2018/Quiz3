package pkg.main;
public class TriangleException extends Exception{
	
	private Triangle tri;
	
	public TriangleException(Triangle tri){
		this.tri = tri;
		
	}

	public Triangle getTri() {
		return tri;
	}
	
}
