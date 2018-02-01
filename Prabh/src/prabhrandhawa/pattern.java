package prabhrandhawa;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);								
		System.out.println("enter the elements");
		int x = sn.nextInt();
		int y = sn.nextInt();
		int n = sn.nextInt();
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=x;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			x=x+2;
		}
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=y;j++)
			{
				System.out.print
				("*");
			}
			System.out.println(" ");
			y=y-2;
		}
			}

}
