package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		// 
		
		System.out.println();
		System.out.println("After Sort");
		
		for (int x = 0; x < array.length ; x++)
			for (int y = x + 1; y < array.length; y++)
				if (array[x] < array[y])
				{
					temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
				
			
		for (int i : array)
			System.out.print(i + " ");
	}
}