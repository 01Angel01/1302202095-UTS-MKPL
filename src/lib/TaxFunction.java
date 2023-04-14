package lib;

public class TaxFunction {

	 public final int penghasilanTidakKenaPajakSingle = 54000000;
	 public final int penghasilanTidakKenaPajakChildren = 1500000;
	 public final int penghasilanTidakKenaPajakMarried = 54000000 + 4500000;
	
	
	public static int calculateTax(int penghasilanTidakKenaPajakSingle, int penghasilanTidakKenaPajakMarried, int penghasilanTidakKenaPajakChildren, int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
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
