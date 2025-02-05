public class CoronaVaccineApp {

	public static void main(String[] args) {
		
		//Creating two instances of User
		User user1 = new User("bapatre",40,true);
		User user2 = new User("avinash",17,false);
		
		Thread t1  = new Thread(()->{
			synchronized(user1) {
				if(user1.isEligible()) {
					try {
						user1.bookDose();//user1 tries to book the dose
						System.out.println("Dose booked successfully for "+user1.getName());
						Thread.sleep(1000); //thread1 goes to sleep so that another thread get a chance
						user1.bookDose(); //user1 tries to book the dose again
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	
				}
				else {
					System.out.println(user1.getName()+" is not eligible for the vaccine.");
				}
			}
			
		});
		t1.start();
		Thread t2  = new Thread(()->{
			synchronized(user2) {
				if(user2.isEligible()) {
					try {
						user2.bookDose();//user2 tries to book the dose
						System.out.println("Dose booked successfully for "+user2.getName());
						Thread.sleep(1000);//thread2 goes to sleep so that another thread get a chance
						//user2.bookDose();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println(user2.getName()+" is not eligible for the vaccine.");
				}
			}
		});
        t2.start();
	}

}
