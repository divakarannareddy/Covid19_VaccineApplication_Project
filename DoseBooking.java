public class DoseBooking {

	private boolean booked;
	
	public void bookDose() {
		if(this.booked) {
			throw new RuntimeException("Dose already booked ");
		}
		else {
			this.booked = true;
		}
	}
	
	public boolean isBooked() {
		if(booked) {
			return true;
		}
		else {
			return false;
		}
	}
}
