package prob3;

public class NoFly implements Flyable{

	@Override
	public void fly(String name) {
		// TODO Auto-generated method stub
		System.out.println("오리(" + name + ")는 날지 않습니다");
	}

}
