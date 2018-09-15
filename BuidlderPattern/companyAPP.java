package BuilderDesign;

import Lesson2.Employee;

public class companyAPP {
	public static void main(String[] args) {
		
		
		Empleyee emp = new Empleyee.Builder("FirstName", "LastName", "email@gmail.com.pl").dateOfBirth(1987).department("IT").ID(199).build();
		System.out.println(emp);
	}

}
