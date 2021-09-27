import java.util.Scanner;

public class boxPattern {

	public static void main(String[] args) {
		
		int n = 6;
		
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++)
		{
			int x = 1;
			for(int j=1; j<=n; j++)
			{
				if((j==1 || j==n) || (i==1 || i==n))
				{
					System.out.print(x + " ");
				}
				else
				{
					System.out.print("  ");
				}
				x++;
			}
			System.out.println();
		}

	}

}