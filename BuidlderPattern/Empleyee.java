package BuilderDesign;

public class Empleyee {

	private String name;
	private String lastName;
	private String emailAdress;
	@Override
	public String toString() {
		return "Empleyee [name=" + name + ", lastName=" + lastName + ", emailAdress=" + emailAdress + ", department="
				+ department + ", dateOfBirth=" + dateOfBirth + ", ID=" + ID + "]";
	}

	private String department;
	private int dateOfBirth;
	private int ID;

	private Empleyee(Builder builder) {
		this.name = builder.name;
		this.lastName = builder.lastName;
		this.emailAdress = builder.emailAdress;
		this.department = builder.department;
		this.dateOfBirth = builder.dateOfBirth;
		this.ID = builder.ID;
	}

	public static class Builder {
		private String name;
		private String lastName;
		private String emailAdress;
		private String department;
		private int dateOfBirth;
		private int ID;

		public Builder(String name, String LastName, String emailAdress) {
			this.lastName = LastName;
			this.emailAdress = emailAdress;
			this.name = name;
		}

		public Builder department(String department) {
			this.department = department;
			return this;
		}

		public Builder dateOfBirth(int dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public Builder ID(int ID) {
			this.ID = ID;
			return this;
		}

		public Empleyee build() {
			return new Empleyee(this);
		}
	}
}
