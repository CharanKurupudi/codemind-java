import java.util.Scanner;
public class Example {
    public static void main(String[] args){
        int n,s;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        s = (n*(n+1))/2;
        System.out.print(s);
    }
}