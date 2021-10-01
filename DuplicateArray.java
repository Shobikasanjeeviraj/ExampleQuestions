
public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {1, 27, 3, 4, 27, 7, 85, 85, 3};   
        
        System.out.println("Duplicate elements in given array: ");  
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
	}

}
