
public class MoveNegArray {
	static void segregateElements(int arr[], int n) 
    { 
          
        int temp[] = new int[n]; 
        int j = 0;
        for (int i = 0; i < n; i++) 
            if (arr[i] >= 0) 
                temp[j++] = arr[i]; 
  
        if (j == n || j == 0) 
            return;
        for (int i = 0; i < n; i++) 
            if (arr[i] < 0) 
                temp[j++] = arr[i];
        for (int i = 0; i < n; i++) 
            arr[i] = temp[i]; 
    } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, -1, -3, -2, 7, 5, -11, 6, -79,5}; 
		 System.out.print("Before Moving Array: " );
		 for(int i=0;i<arr.length;i++) {
			 System.out.print( arr[i] + " "); 
			
		 }
		 System.out.println();
        int n = arr.length; 
  
        segregateElements(arr, n); 
        System.out.print("After Moving Array: ");
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
	}

}
