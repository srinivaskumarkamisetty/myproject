package javaPractice;

public class DuplicatewordsinArray {
	public static void main(String[] args) {

		String arr[] = { "java", "python", "c", "c++", "java","python" };
		int count=0;

		for (int i = 0; i < arr.length; i++) 
		{

			for (int j = i + 1; j < arr.length; j++) 
			{
               if(arr[i]==arr[j]) 
               {
            	   System.out.println("Element found duplicate =="+arr[i]);
            	   count++;
            	  
               }
               
               
			}
			
		}

		System.out.println("Total Duplicate Elements Found=="+count);
	}

}
