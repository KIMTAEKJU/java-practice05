package prob6;

public class Rectangle extends Shape implements Resizable
{

	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		setWidth(width);
		setHeight(height);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		setWidth(getWidth() * s);
		setHeight(getHeight() * s); 
	}

}
