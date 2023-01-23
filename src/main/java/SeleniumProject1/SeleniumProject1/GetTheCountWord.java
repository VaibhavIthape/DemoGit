package SeleniumProject1.SeleniumProject1;

public class GetTheCountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My My Name is Java I am Java";

		String[] strarr = str.split(" ");
		System.out.println(strarr.length);
		

		for (int i = 0; i < strarr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < strarr.length; j++) {
				if (strarr[i].equals(strarr[j])) {
					count++;
					strarr[j]="0";
				}
				
			}
			if(strarr[i]!="0") {
			System.out.println(strarr[i]+" "+count);
			}
			
			
		}

	}

}
