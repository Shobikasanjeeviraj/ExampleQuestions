
public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {19,92,53,34,65,76,27,87,49};
	    System.out.print("Original Array:");
	    System.out.println();
		for (int i = 0; i < arr.length; i++) 
         System.out.print(arr[i] + " ");
      
				System.out.println();
			
			for(int i=0;i<arr.length/2;i++){
				int temp=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
			}
     	System.out.print("Reverse Array:");
     	System.out.println();
			for( int i=0;i<arr.length;i++)
				System.out.print( arr[i]+ " ");
		
		System.out.println();
	}

}
