public class p166Q10 {

	public static void main(String[] args) {
		int intArray[][] = { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0} };
		
		int x = (int)(Math.random()*4);
		int y = (int)(Math.random()*4);
		
		
		for(int i = 0; i<intArray.length; i++) {
			for(int j = 0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}
	}
}
