package BuilderDesign;


public class Vehicle {
	private String model;
	
	private String color;
	
	private String Distributor;
	private String name;
	
	private int year;
	
	
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", color=" + color + ", Distributor=" + Distributor + ", name=" + name
				+ ", year=" + year + "]";
	}

	private Vehicle(Builder builder)
	{
		this.model= builder.model;
		this.color= builder.color;
		this.name= builder.name;
		this.Distributor=builder.Distributor; 
		this.year=builder.year; 
	}

	public static class Builder
	{
		private String model;
		
		private String color;
		
		private String Distributor;
		private String name;
		
		private int year;
		
		public Builder(String color, int year)
		{
			this.color=color; 
			this.year=year;
		}
		
		public Builder model(String value)
		{
			this.model=value; 
			return this; 
		}
		public Builder name(String value)
		{
			this.name=value; 
			return this; 
		}
		public Vehicle build()
		{
			return new Vehicle(this); 
		}
	}
}



