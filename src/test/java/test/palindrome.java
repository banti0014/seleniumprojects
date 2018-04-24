package test;

public class palindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String ar="minerenim";
		char[] h=ar.toCharArray();
		
		//Object p=new char[i];
		
		for(int i=h.length-1;i>=0;i--)
		{
			System.out.print(h[i]);
			
		}
		System.out.println();
		String w=String.valueOf(h);
		
		boolean p=w.equalsIgnoreCase(ar);
		if(p==true)
		{
			System.out.println("Its palindrome");
		}
		
		else
		{
			System.out.println("Its NOT palindrome");

		}
	}

}
