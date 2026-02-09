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
		/* For normal print, use following lambda function of java
		company_occurance.forEach((name, count) -> System.out.println(name + " is key and repeated " + count));
		*/
		return result_company;
	}//end of method

}//end of class


/*
Better way to program:
In function;
1. Create a list of companies
2. Create a map with company name and their occurance
3. Find the max occuranc based on collections.max(map.values())
4. Find the key from for loop based on key that is attached to max values

import java.util.*;
public class FindMostRecurringCompany {
    public static void main(String[] args) {
        // Input as an array of strings (simulating the log file lines)
        String[] logs = {
            "Error at time 10:54 is for customer Google",
            "Error at time 11:00 is for customer Apple",
            "Error at time 11:05 is for customer Google",
            "Error at time 11:10 is for customer Apple",
            "Error at time 11:15 is for customer Apple"
        };

        analyzeErrors(logs);
    }

    public static void analyzeErrors(String [] logs){
        ArrayList <String> CompanyList = new ArrayList<>();
        //1. Create Arraylist with list of companies from error log
        for (String comp: logs)
            { if(comp.startsWith("Error")){
                String temp [] = comp.split(" ");
                CompanyList.add(temp[temp.length-1]);
            }//end of if
        }//end of for
        //2. Create map with company and their occurance
        HashMap<String, Integer> hm = new HashMap<>();
        for (String company: CompanyList){
            if (hm.containsKey(company)){
                hm.put(company,hm.get(company)+1);}
                else{
                    hm.put(company,1);
                }  
            } 
        //3. Find the maximum occurance of values of company with collections.max    
        int maxValueInMap=Collections.max(hm.values());
        //4. Find the name of company based on highest occurance found earlier
        for (Map.Entry <String, Integer> me: hm.entrySet()){
            if(me.getValue()==maxValueInMap){
                System.out.println("highest impacted company is "+me.getKey());
            }
        }
    }//End of analyzeError   
}

*/
