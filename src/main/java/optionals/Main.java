package optionals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Vihan", "1234567890V",LocalDate.parse("1980-01-01"),"vihan@mail.com");
		Person nullPerson = null;
		Optional<Person> optional_NoPerson = Optional.ofNullable(nullPerson);
		System.out.println("Optional nopeople isEmpty: "+ optional_NoPerson.isEmpty());
	}

}
