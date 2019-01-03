package prob3;

public class Sparrow extends Bird
{
	public Sparrow() {
		// TODO Auto-generated constructor stub
		fly = new Flying();
		sing = new Sing();
	}

	@Override
	public String toString() {
		return "참새의 이름은 짹짹 입니다.";
	}
	
	
}
