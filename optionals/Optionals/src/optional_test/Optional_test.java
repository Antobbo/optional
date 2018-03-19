package optional_test;
import java.util.Optional;

public class Optional_test {


	public static void main(String[] args) {
		Optional<Customer> customer1 = Optional.ofNullable(new Customer("John", "Doe"));
		Optional<Customer> customer2 = Optional.empty();
			
		customer1.ifPresent(value -> {
			System.out.println(value);
		});		
		
		/*customer2.ifPresent(value -> {
			System.out.println(value);
		});*/
		System.out.println(customer2.orElse(new Customer("Unknown", "Unknown")));

	}

}
