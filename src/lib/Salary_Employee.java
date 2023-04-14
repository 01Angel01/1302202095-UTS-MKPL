package lib;
import java.time.LocalDate;
import java.util.List;

public class Salary_Employee {
    private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    private LocalDate dateJoined;
	private int monthWorkingInYear;
	
	private boolean isForeigner;

	private String spouseIdNumber;
	private List<String> childIdNumbers;

    public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			Foreigner();
		}else if (grade == 2) {
			monthlySalary = 5000000;
			Foreigner();
		}else if (grade == 3) {
			monthlySalary = 7000000;
			Foreigner();
		}
	}

    private void Foreigner(){
		if (isForeigner) {
			monthlySalary = (int) (3000000 * 1.5);
		}
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public int getAnnualIncomeTax() {
		
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == dateJoined.getYear()) {
			monthWorkingInYear = date.getMonthValue() - dateJoined.getMonthValue();
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
