package javaday2;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++)
		{
			int num;
			if(i%2==0)
			{
				num=0;
				System.out.print(num);
			}
			else
			{
				num=1;
				System.out.print(num);
			}
			for(int k=1;k<4;k++)
			{
				if(num==1)
				{
					num=0;
				}
				else
				{
					num=1;
				}
				System.out.print(num);
			}
			System.out.println();
		}
         
		}
		
	}
	


