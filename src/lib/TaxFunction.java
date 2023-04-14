package lib;

public class TaxFunction {

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		int penghasilanTidakKenaPajakSingle = 54000000;
	 	int penghasilanTidakKenaPajakChildren = 1500000;
	 	int penghasilanTidakKenaPajakMarried = 54000000 + 4500000;
		int tax = 0;
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (penghasilanTidakKenaPajakMarried + (numberOfChildren * penghasilanTidakKenaPajakChildren))));
		}else {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - penghasilanTidakKenaPajakSingle));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
