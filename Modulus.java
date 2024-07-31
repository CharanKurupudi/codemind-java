import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
		int a,b,c;
		//An object of Scanner class

		Scanner read = new Scanner(System.in);
		a = read.nextInt();
		b = read.nextInt();
		c = a % b;
		System.out.println(c);
	}
}