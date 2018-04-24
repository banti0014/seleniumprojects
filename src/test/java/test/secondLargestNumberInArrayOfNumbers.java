package test;

//import com.thoughtworks.selenium.webdriven.commands.FindFirstSelectedOptionProperty;

public class secondLargestNumberInArrayOfNumbers {

	public static void main(String[] args) throws Exception
	{
	
		System.out.println(secondLargestNumber1(new int[] {45, 51, 28, 75, 49, 42}));

		System.out.println(secondLargestNumber1(new int[] {985, 521, 975, 831, 479, 861}));

		System.out.println(secondLargestNumber1(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));

		System.out.println(secondLargestNumber1(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));		

	}
	static int secondLargestNumber1(int[] arr)
	{
		int l=arr.length;
		int firstLargestNum=0;
		int secondLargestNum=0;
		
			if(arr[0]>arr[1])
					{
						firstLargestNum=arr[0];
						secondLargestNum=arr[1];
					}
			else
			{
				firstLargestNum=arr[1];
				secondLargestNum=arr[0];
			}
			
			for(int i=2;i<l;i++)
			{
				if(arr[i]>firstLargestNum)
				{
					
					secondLargestNum=firstLargestNum;
					firstLargestNum=arr[i];
				}
				else if(arr[i]<firstLargestNum && arr[i]>secondLargestNum)
				{
					secondLargestNum=arr[i];
				}
			}
		return secondLargestNum;
	}

}
