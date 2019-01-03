package prob6;

public abstract class Shape 
{
	public double width;
	public double height;
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
