
public class Nurse extends HospitalEmployee {
	private int numOfPatients;
	void work() {
		System.out.println(name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
	}
	@Override
	public String toString() {
		return name + ' ' + number + " has " + numOfPatients + " patients";
	}
	public int getNumOfPatients() {
		return numOfPatients;
	}
	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}
	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		this.numOfPatients = numOfPatients;
	}
}
