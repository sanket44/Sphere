import java.util.Arrays;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		int arr[];
		int x;
		
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		arr=new int[x];
			for( int i = 0;i<x;i++)
			{
				System.out.println("Enter the value for arr"+i);
				arr[i]=sc.nextInt();
				
			}
			sc.close();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
}}
