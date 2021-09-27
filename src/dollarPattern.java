import java.util.Scanner;

public class dollarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		
		// This program will print the dollar symbol in a right angled triangle format
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
	}

}
