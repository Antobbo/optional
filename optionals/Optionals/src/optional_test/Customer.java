package optional_test;

import java.util.Optional;

public class Customer {
	private String name;
	private String surname;
	public Customer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public Optional<String> getName() {
		return Optional.ofNullable(this.name);
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public Optional<String> getSurname() {
		return Optional.ofNullable(this.surname);
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString(){
		return "Name: " + getName().get() + ". Surname: " + getSurname().get();
	}
}
