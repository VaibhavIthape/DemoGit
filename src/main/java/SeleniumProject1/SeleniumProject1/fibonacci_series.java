package SeleniumProject1.SeleniumProject1;

public class fibonacci_series {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int no1=0, no2=1,no3; 
		
		
		for(int i=0;i<=5;i++)
		{
			no3=no1+no2;
			
			no1=no2;
			no2=no3;
			
			System.out.print(no3);
		}
		
	}

}
