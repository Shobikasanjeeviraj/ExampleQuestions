 
public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {50, 24, 204, 10, 2, 45, 54, 19, 7};		 
	    
	    int max = arr[0];
	    int min = arr[0];
	   
	    for(int i = 1; i < arr.length; i++){
	      if(max < arr[i]){
	        max = arr[i];
	      }else if(min > arr[i]){
	        min = arr[i];
	      }		   		   
	    }
	    System.out.println("Maximum number = "+ max);		
	    System.out.println("Minimum number = " + min);
	}

}
