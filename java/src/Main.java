import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		String ly=input.next();
		char ch=ly.charAt(0);
		for(int b=0;b<a/2;b++)
		{	
			for(int c=0;c<a;c++)
			{
				System.out.print(ch);
			}
			System.out.println();
			System.out.println();
		}
	}
}