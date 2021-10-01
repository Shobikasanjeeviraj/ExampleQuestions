
public class SumProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {75, 28, 93, 64, 85};  
        int sum = 0;  
        int product=1;
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i]; 
           product=product*arr[i];
           
        }  
        System.out.println("Sum of all the elements of an array: " + sum); 
        System.out.println("Product of all the elements of an array: " + product); 
	}

}
