package sphere;

import java.util.Scanner;

public class TestVolArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		VolandArea av1=new VolandArea(radius);
		System.out.println("Volume : " + String.format("%.2f",av1.vol()));
		System.out.println("Area   : " + String.format("%.2f",av1.area()));
		sc.close();
	}

}
