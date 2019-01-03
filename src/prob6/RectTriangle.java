package prob6;

public class RectTriangle extends Shape
{

	public RectTriangle(double width, double height) {
		// TODO Auto-generated constructor stub
		setWidth(width);
		setHeight(height);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height * 0.5;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + Math.sqrt (Math.pow (width, 2) + Math.pow (height, 2));
	}

}
