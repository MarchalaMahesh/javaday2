package javaday2;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		// print number of bw(excluding m & n) m&n (taken by user) which are multiple 3
		// using while loop
		
	Scanner scan = new Scanner(System.in);
	
	int m = scan.nextInt();
	
	int n = scan.nextInt();
	
	while(m<n-1)
	{
		m++;
		if(m%3==0)
		{
			System.out.println(m);
		}
	}
		
		
	}

}
