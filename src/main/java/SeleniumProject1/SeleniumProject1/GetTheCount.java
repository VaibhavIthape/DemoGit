package SeleniumProject1.SeleniumProject1;

public class GetTheCount {
	
	
	
	public static void main(String[] args) {
		
		String str="Vaibhav@20";
		
		int upper=0, lower=0,num=0,special=0;
		
		//char[] arr=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			
			  char ch = str.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				lower++;
			}else if(ch>='A' && ch<='Z')
			{
			upper++;	
			}else if(ch>='0' && ch<='9')
			{
				num++;
			}
			else {
				special++;
			}
		}
		
		System.out.println(" Total Number of Upper case "+upper);
		System.out.println(" Total Number of Lower case "+lower);
		System.out.println(" Total Number "+num);
		System.out.println(" Total Number of special characters "+upper);
		
	}

}
