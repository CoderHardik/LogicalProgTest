/*This was asked in Apple TV int F2F
 * Here all variables are in double so work toward optimizing it.
 * 
 */


import java.util.HashMap;

public class HextoDecimal {

public static void main(String args[]){  
		String st = "A3C2";
		hextodec(st);
		System.out.println(Integer.parseInt("A3C2",16));
}
	
	
public static void hextodec(String s) {
    
	String hex = "0123456789ABCDEF";
	String hexnum = s.toUpperCase();
	int num=0;
	
	for(int i=0;i < hexnum.length();i++){
		char a =hexnum.charAt(i);
		int temp = hex.indexOf(a); 
		num = (16*num)+temp ;// try to understand this logic. Basically it should be temp*16powi but if look you will have to multiply 16 next time everytime so they are multiplying it with result itself
}
	
	System.out.println(num);
	
}
	
}//end of class


/*Alternate in built method
 * 
 * public class HexToDecimalExample2{  
public static void main(String args[]){  
System.out.println(Integer.parseInt("a",16));  
System.out.println(Integer.parseInt("f",16));  
System.out.println(Integer.parseInt("121",16));  
}}  

public class HexToDecimalExample1{  
public static void main(String args[]){  
String hex="a";  
int decimal=Integer.parseInt(hex,16);  
System.out.println(decimal);  
}} 
 * 
 * 
 */ 
