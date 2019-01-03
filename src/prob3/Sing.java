package prob3;

public class Sing implements Singable{

	@Override
	public void sing(String name) {
		// TODO Auto-generated method stub
		System.out.println((name.equals("꽥꽥이") ? "오리(꽥꽥이)가 " : "참새(짹짹)가 ") + "소리내어 웁니다.");
	}

}
