
public class Retire {
	/**
	 * Abdullah Hamad
	 * @param args
	 */
	public static void main(String args[]) {
		if (args.length > 0) {
			try {
				/**
				 * Command line args are set to each variable needed
				 */
				double intialBalance = Double.parseDouble(args[0]);
				int monthlyAdd = Integer.parseInt(args[1]);
				/**
				 * if statement checks if the monthly addition exceeds the set federal yearly limit. 
				 */
				if (monthlyAdd > 1541.67) {
					System.out.println("Monthly addition cannot exceed $1541.67 per month for the annual contribution limit of $18,500.");
					System.exit(1);
				}
				/**
				 * checks if rate of return is greater than 1 and gives an error statement.
				 */
				double rateReturn = Double.parseDouble(args[2]);
				if (rateReturn > 1) {
					System.out.println("Rate of return cannot be greater than 1. Try again.");
					System.exit(1);
				}else if (rateReturn < 0) {
					System.out.println("Rate of return cannot be less than 0. Try again.");
					System.exit(1);
				}
				/**
				 * checks if rate of inflation is greater than 1 and gives an error statement.
				 */
				double rateInflation = Double.parseDouble(args[3]);
				if (rateInflation > 1) {
					System.out.println("Rate of return cannot be greater than 1. Try again.");
					System.exit(1);
				}else if (rateInflation < 0) {
					System.out.println("Rate of return cannot be less than 0. Try again.");
					System.exit(1);
				}
				int yearToRetirement = Integer.parseInt(args[4]);
				int numMonth = yearToRetirement * 12;
				double newBalance = intialBalance;
				double intrMade = 0;
				double totalIntrest = 0;
				/**
				 * for loop calculates the interest made and the new balance for each month.
				 * math.round to round the values to the correct decimal place. The values rounded are first multiplied so that math.round does the correct rounding. Then it divides to bring the numbers back. 
				 */
				for(int i=1; i<=numMonth;i++) {
					intrMade = Math.round((((((1+rateReturn)/(1+rateInflation))-1)/12) * newBalance)*100.0)/100.0;
					newBalance = Math.round((newBalance + intrMade + monthlyAdd) * 100.0)/100.0;
					System.out.println("Month		Interest		Balance");
					System.out.println(i+"		"+intrMade+"		"+newBalance);
					totalIntrest = Math.round((totalIntrest + intrMade) * 100.0)/100.0;	
				}
				System.out.println("Total Intrest Earned: $ " + totalIntrest);
				System.out.println("Total Nest Egg: $ " + newBalance);
				
			} catch (NumberFormatException nfe) {
				System.out.println("No input.");
			}
		}
	}

}
