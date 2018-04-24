package test;

public class stringRevers {

	public static void main(String[] args) {
		String j="Kolkata";
		//int sum=0;
		int p=j.length();
		char[] k=j.toCharArray();
		for(int i=p-1;i>=0;i--)
		{
			System.out.print(k[i]);
			
		}
		System.out.println();
		double o=k[0]*k[2];
		System.out.println(o);
		
		System.out.println();
	}

}
