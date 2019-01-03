package prob2;

public class SmartPhone extends MusicPhone 
{
	@Override
	protected void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("다운로드해서 음악재생");
	}
	
	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if (function.equals("앱"))
			appExecute();
		else
			super.execute(function);
	}
	
	public void appExecute()
	{
		System.out.println("앱실행");
	}
}
