
public class VaccineEligibility {

	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	} 
	
	public boolean isEligible() {
		if((age>18 && age<60)||hasHealthCondition) {
			return true;
		}
		else {
			return false;
		}
	}
}
