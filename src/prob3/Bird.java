package prob3;

public abstract class Bird
{
	private String name;
	protected Flyable fly;
	protected Singable sing;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fly()
	{
		fly.fly(getName());
	}
	
	public void sing()
	{
		sing.sing(getName());
	}
	
	
}
