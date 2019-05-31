import java.util.ArrayList;
import java.util.List;

public class SortingWithStreams {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Abishek");
		list.add("Berry");
		list.add("Jerry");
		list.add("Arjun");
		list.add("Arya");
		
		list.stream().sorted().forEach(s->System.out.println(s));
		

	}

}
