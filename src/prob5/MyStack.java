package prob5;

public class MyStack {
	private int top;
	public String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) 
	{
		buffer = new String[capacity];
		top = 0;
	}

	public void push(String s) 
	{
		if (top != buffer.length-1)
			buffer[top++] = s; 
		else
		{
			String[] doubleSpaceArr = new String[buffer.length * 2];
			System.arraycopy(buffer, 0, doubleSpaceArr, 0, buffer.length);
			buffer = doubleSpaceArr;		
			push(s);
		}
	}

	public String pop() throws MyStackException 
	{
		if (top != -1)
		{
			if (buffer[top] == null)
			{
				top--;
				return buffer[top--];
			}
			
			else
				return buffer[top--];
		}
		else
			throw new MyStackException("stack is empty");
	}

	public boolean isEmpty() 
	{
		return top == -1;
	}
}