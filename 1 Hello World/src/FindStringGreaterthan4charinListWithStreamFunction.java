import java.util.ArrayList;
import java.util.List;

public class FindStringGreaterthan4charinListWithStreamFunction {

	public static void main(String[] args) {
		//Stream creates another parallel collection in no time.

		List <String> list = new ArrayList<>();
		
		list.add("Abishek");
		list.add("Berry");
		list.add("Jerry");
		list.add("Arjun");
		list.add("Arya");
		
		list.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		/*if you want to just show first result from above then following code
		
		list.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		*/
		
	}

}
