package test;

import java.util.Scanner;

//import org.apache.xpath.axes.ReverseAxesWalker;

public class reversingWordsWithoutChangingPostition 
{
	public static void reverse(String ar)
	{
		String emp="";
		String[] p=ar.split(" ");
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=p[i].length()-1;j>=0;j--)
			{
				
				System.out.print(p[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		
		
	}
	public static void main(String[] args) 
	
	{
		System.out.println("Welcome to String reverse coding:-");
		// Scanner s = new Scanner(System.in);
		 //   System.out.print(s.nextLine());
		    
		    String pop="hey you listen to me ! Drao na jeyona tumi";
		    reverse(pop);

	}

}
