package matrix;

public class Matrix {

	public static void main(String[] args) {
		int matrix[][]={{1,2,3},{4,5,6},{69,70,71}};
		printMatrix(matrix);

	}
	
	public static void printMatrix(int[][] matrix)
	{
		for(int row=0;row<matrix.length;row++)
		{
			System.out.print("[ ");
			for(int column=0;column<matrix[row].length;column++)
			{
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println("]");
		}
	}
	
	public static boolean isInMatrix(int[][] matrix, int key)
	{
		for(int[] row:matrix)
		{
			
		}
	}

}
