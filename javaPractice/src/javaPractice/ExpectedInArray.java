package javaPractice;

public class ExpectedInArray {
	public static void main(String[] args) {

		String Expected = "50";

		String arr[] = { "20", "30", "40", "50" };
		
		
		boolean status=false;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] == Expected) 
			{
				System.out.println("Element found= " + arr[i]+"  At "+i+" index of an Array ");
				status=true;
				break;
			} 

		}
		if(status==false) {
			System.out.println("Element not found");
		}

	}
}