package third;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array=new int[10];
		fillArray(array,1,50);
		printArray(array);
		System.out.println("Greatest even number: "+greatestEven(array));
		System.out.println("Square numbers: "+cntSquares(array));
		System.out.println("Geometric average: "+geometricAvg(array));
		
		System.out.println();
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		int index=Arrays.binarySearch(array, 10);
		System.out.println("Index of 10 in array"+index);
		if(index>=0 )
		{
			System.out.println("10 is in the array");
		}
		else
		{
			System.out.println("10 is not in the array");
		}
		
		int[] randomArray={1,4};
		System.out.println("array == randomArray: "+Arrays.equals(array, randomArray));
		System.out.println("array equal to itself: "+Arrays.equals(array, array));
		
		int[]  array2=new int[10];
		for (int i = 0; i < array2.length; i++) {
			array2[i]=array[i];
		}
		System.out.println("array equal to itself: "+ (array==array2)+ " equals: "+ Arrays.equals(array, array2));
		
		
	}
	
	public static void fillArray(int[] array, int min, int max)
	{
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*(max-min+1))+min;
			
		}
	}
	
	public static void printArray(int[] array)
	{
		for (int elem : array) {
			System.out.println(elem+" ");
		}
		System.out.println();
	}
	
	public static int greatestEven(int[] array)
	{
		int max=Integer.MIN_VALUE;
		for(int elem:array)
		{
			if(elem%2==0 && elem>max)
			{
				max=elem;
			}
		}
		
		return max;
	}
	
	public static int cntSquares(int[] array)
	{
		int cnt=0;
		for(int elem:array)
		{
			double squareRoot=Math.sqrt(elem);
			if(squareRoot==(int)squareRoot)
			{
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static double geometricAvg(int[] array)
	{
		double avg=1;
		
		for (int elem : array) {
			avg*=elem;
		}
		
		return Math.pow(avg, 1.0/(double)array.length);
	}
	
	

}
