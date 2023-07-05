package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		for(a = 1; a<=10;a++)
		{
			System.out.print( a);
			
		}
		System.out.print("    ");
		
		int b= 1;
		while(b<=10)
		{
			System.out.print( b);
			b++;
		}
		System.out.print("    ");
		
		int c= 10;
		do
		{
			System.out.print(c);
			c--;
		}
		while(c>=0);
		System.out.print("    ");
		
		for(int i = 0 ;i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
			System.out.print(i);
		}
		System.out.print("    ");
		for(int j= 1;j<=20;j++)
		{
			if(j==8)
			{
			 continue;
			}
			System.out.print(j);
			
		}

	}

}
