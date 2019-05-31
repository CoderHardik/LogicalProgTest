import java.util.ArrayList;
import java.util.List;

public class FindNumberOfListElementStartingWithspecificWordWith_Stream_ {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("Abishek");
		list.add("Berry");
		list.add("Jerry");
		list.add("Arjun");
		list.add("Arya");
		
		long c = list.stream().filter(s->s.startsWith("A")).count();    //.count();
		
		System.out.println(c);

	}

}
