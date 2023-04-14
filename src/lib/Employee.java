package lib;
import java.time.LocalDate;

public class Employee {
	private LocalDate dateJoined;
	private boolean isForeigner;

	public Employee(String idNumber, LocalDate dateJoined, boolean isForeigner) {
		this.dateJoined = dateJoined;
		this.isForeigner = isForeigner;
	}

	public LocalDate getdateJoined(){
		return dateJoined;
	}

	public boolean isForeigner(){
		return isForeigner;
	}
}
