import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
		int r;
		double area,perimeter;
		//An object of Scanner class

		Scanner read = new Scanner(System.in);
		r = read.nextInt();
		area = 3.14 * r * r;
		perimeter = 2 * 3.14 * r;
		System.out.printf("%.2f
", area);
		System.out.printf("%.2f", perimeter);
	}
}