

public class Interface_bankExample implements Interface_example{

	public static void main(String[] args) {
		
		Interface_example bank = new Interface_bankExample();
		bank.atmfacility();
		bank.withdrawlimit();
		// The way above is defined interface var = new class()
		// Above is true when class implements interface
		//ex. WebDriver driver = new ChromeDriver();
		// Remember, web driver is interface here and chromedriver is class that implements web driver
		
		//bank.classspecificmethod();
		// Another point here to remember is that above will not work since it is not present in interface.
		//And here we can only access methods in interface because that is how we created this object
		
		// Here you can do multiple inheritance. Assume we want to implement interface swissbank then do following
		//Interface_bankExample implements Interface_example, swissbank
		// but one thing is that bank object will not have methods of swiss bank as it only knows interface_example.
		// you will have to create another object for that
		

	}

	@Override
	public float withdrawlimit() {
		Float amount_limit = null;
		System.out.println("Amount limit is 15000 here maximum");
		
		return amount_limit;
	}

	@Override
	public void atmfacility() {
		System.out.println("Bank need to have functional ATM");
		
	}
	
	public void classspecificmethod() {
		System.out.println("Bank need to have functional ATM");
		
	}

}
