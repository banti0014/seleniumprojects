package test;

import java.util.Scanner;

public class Solution {

	    public static void main(String[] args) {

	        int count=0;
	        int p=0;
	        Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        while(n>=0)
	        {
	            int y=n%2;
	            n=n/2;
	            if(y==1)
	            {
	                count=count + 1;
	                if(count>=p)
	                {
	                	p=count;
	                }
	                
	                else
	                	count=0;
	            }
	            
	            
	            
	        }
	      
	        System.out.println(p);
	    }
	}

