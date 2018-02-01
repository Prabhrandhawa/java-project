package prabhrandhawa;

import java.util.Scanner;

public class pattern4 {
	
	public static void main(String[] args) {
		
		Scanner sn= new Scanner(System.in);
		System.out.println("Print Stars");
		for(int i=1;1<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
		for(int k=3;k<=i;k--)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}

		}
	}
}

