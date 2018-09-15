package BuilderDesign;

import BuilderDesign.Vehicle.Builder;

public class car {
	
	public static void main(String[] args) {
		
		Vehicle car = new Vehicle.Builder("yellow", 1234).build(); 
		//car= new Vehicle.Builder("uee", 1243).model("opel").name("audi").build(); 
		
		System.out.println(car);
		
		System.out.println(car.toString()); 
			
				System.out.println(car);
		
		
		
	}

}
