import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("How many years do you plan on working?");
	int yearsWorking = input.nextInt();
	int monthsWorking = yearsWorking * 12;
	System.out.println("What is your annual return rate as a percentage?");
	float annualRate = input.nextFloat();
	annualRate /= 100;
	annualRate /= 12;
	System.out.println("How many years will you be retired?");
	int yearsRetired = input.nextInt();
	int monthsRetired = yearsRetired * 12;
	System.out.println("What will your retirement return rate be as a percentage?");
	float retirementRate = input.nextFloat();
	retirementRate /= 100;
	retirementRate /= 12;
	System.out.println("What is your required monthly retirement income?");
	float retirementIncome = input.nextFloat();
	System.out.println("What is your monthly Social Security Income?");
	float SSI = input.nextFloat();
	float neededIncome = retirementIncome - SSI;
	double PV = FinanceLib.pv(retirementRate, monthsRetired, neededIncome, 0, false);
	/*calculates the present value given the retirement rate, months retired
	 * needed monthly income, and desired future value
	 */
	double PMT = FinanceLib.pmt(annualRate, monthsWorking, 0, PV, false);
	/* calculates monthly savings needed given annual rate, months worked
	 * and present value
	 */
	System.out.printf("You have to save $%.2f each month.", PMT);
	}
}
	


