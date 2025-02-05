public class User {

	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	public User(String name,int age, boolean healthCondition) {
		super();
		this.name = name;
		this.eligibility = new VaccineEligibility(age,healthCondition);
		this.doseBooking = new DoseBooking();
	}
	
	protected String getName() {
		return name;
	}

	public boolean isEligible() {
		return eligibility.isEligible();
	}
	
	public void bookDose() {
		try {
		doseBooking.bookDose();
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+"for "+name);
		}
	}
	
	public boolean isDoseBooked() {
		return doseBooking.isBooked();
	}
	
}
