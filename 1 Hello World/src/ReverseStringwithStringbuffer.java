import java.util.Scanner;

public class ReverseStringwithStringbuffer {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String you want to reverese: ");
		String st = s.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb=sb.append(st);
		
		sb=sb.reverse();
		
		System.out.println(sb);

		s.close();
	}

}
