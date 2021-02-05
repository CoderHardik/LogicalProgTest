import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ErrorLogAmazonQuestion {

	/*
	 * From Array of String (Initially it was going through log file but to simply they made it Array of string).
So from Array of string and one array for example is “Error at time 10:54 is for customer Google”
Here time and company will change.

Now write program where it will go through all array and store how many time different company showed up. 
So op expected is:
Google - 3
Apple -2

And then check which company is affected the most.


	 */
	
	
	
	
	public static void main(String[] args) {
		String input = "Error at time 10:54 is for customer Google";
		String res= errorCheck(input);
		System.out.println(res);
	}
	
	
	public static String errorCheck(String s) {
		
		ArrayList<String> companies = new ArrayList<>();
		String [] temp = s.split(" ");
		if(temp[0].equals("Error")) {
			companies.add(temp[7]);
	}
	
		HashMap<String, Integer> company_occurance = new HashMap<>();
		int highest=1;
		for(String st:companies) {
			if(company_occurance.containsKey(st)) {
				company_occurance.put(st, company_occurance.get(st)+1);
				if(highest<company_occurance.get(st)) {
					highest = company_occurance.get(st);
				}
			}
			else {
				company_occurance.put(st,1);
			}
		}
		
		String result_company="";
		for(Map.Entry<String, Integer> mp: company_occurance.entrySet()) {
			System.out.println(mp.getKey()+" is key and repeated "+mp.getValue());
			if(mp.getValue() ==highest) {
				result_company=mp.getKey();
			}
		}
		
		return result_company;
	}//end of method

}//end of class
