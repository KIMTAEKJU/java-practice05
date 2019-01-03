package prob3;

public class Duck extends Bird 
{

	public Duck() {
		// TODO Auto-generated constructor stub
		fly = new NoFly();
		sing = new Sing();
	}

	@Override
	public String toString() {
		return "오리의 이름은 꽥꽥이 입니다.";
	}

}
