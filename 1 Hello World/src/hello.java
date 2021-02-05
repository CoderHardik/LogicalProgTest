
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// a=256 --> 25+6 --> 13 ->> 1+3 --> 4
public class hello {
// For coding related questions: https://leetcode.com/problemset/all/

	//check

		    public static void main(String[] args) {
		    	 
		    	int A[]= {1,2,3,4,5};
		    	int sum=5;
		    	HashMap <Integer, Integer> hm = new HashMap <Integer, Integer>();
		    	int index=0, count=0;

		    	for (int a: A){
		    	hm.put(count, a);
		    	count++;
		    	}

		    	for (int a:A){

		    	if(hm.containsValue(sum-a)) {
		    	System.out.println(sum-a+" and "+a+" makes the sum");
		    	}
		    	}
		    }//end of main 

	
		   
		    
		   
	
}//end of class


