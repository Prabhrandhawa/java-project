package prabhrandhawa;

import java.util.Scanner;

public class pattern3 {
	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Print stars");
		for(int i=1;i<=4;i++) 
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
