import java.util.ArrayList;
import java.util.List;

public class PrintListwithhelpofStream {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("Abishek");
		list.add("Berry");
		list.add("Jerry");
		list.add("Arjun");
		list.add("Arya");
		
		//list.stream().forEach(s->System.out.println(s)); 
		list.forEach(s->System.out.println(s));//Do not even need to use stream. Can be done only with lambda expression
		//list.forEach(System.out::println); // you can write in any of above method and it is correct
		list.forEach(s->System.out.println(s));
		System.out.println("----Following is with for loop result----");
		
		//This is another way
		//for(String item:list) {
		//	System.out.println(item);
		//}
	}

}
