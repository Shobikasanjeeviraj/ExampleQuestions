import java.util.Scanner;
public class Investmentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the buying price per share: ");
      double buyingPrice=scan.nextDouble();
      int day=1;
      double closingPrice=0.1;
      
      while(true) {
    	  System.out.println("Enter the closing price of the day "+day +" is:");
    	  closingPrice=scan.nextDouble();
    	 if(closingPrice < 0) {
    		 System.out.println("Your Shares has been Closed");
    		 break;
    	 }
    		 
    	 double earnings=closingPrice - buyingPrice;
    	 if(earnings > 0) {
    		 System.out.println("After day" +day+ " you earned "+earnings+" per shares");
    		 }
    	 else if (earnings < 0) {
    		 System.out.println("After day" +day+ " you losed "+earnings+" per shares"); 
    	 }
    	 else {
    		 System.out.println("After day" +day+ " you have no eranings per shares");
    	 }
    	 day +=1;  
      }
      scan.close();
      
    
	}

}
