import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	while(i<=n)
	{
		int j=1;
		while(j<=n-i+1)
		{
			int p=n-i+1;
			System.out.print(p);
			j++;

		}
		System.out.println();
		i++;
	}

		
	}

}
