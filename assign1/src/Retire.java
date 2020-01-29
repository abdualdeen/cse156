
public class Retire {
	public static void main(String args[]) {
		if (args.length > 0) {
			try {
				double intialBalance = Double.parseDouble(args[0]);
				int monthlyAdd = Integer.parseInt(args[1]);
				double rateReturn = Double.parseDouble(args[2]);
				double rateInflation = Double.parseDouble(args[3]);
				int yearToRetirement = Integer.parseInt(args[4]);
				int numMonth = yearToRetirement * 12;
				//TODO: for loop for months
				//Initializing intMade before the for-loop.
				for(int i=1; i<=numMonth;i++) {
					//TODO: formula calc. Begin with interest made. 
					if (i==1){
						double intrMade = intrMade + ((((1+rateReturn)/(1+rateInflation))-1)/12) * intialBalance;
						double newBalance = intialBalance + intrMade + monthlyAdd;
						System.out.println("Month		Interest		Balance");
						System.out.println(i+"		"+intrMade+"		"+newBalance);
						double totalIntrest = totalIntrest + intrMade;
					} else if(i==numMonth) {
						double intrMade = intrMade + ((((1+rateReturn)/(1+rateInflation))-1)/12) * newBalance;
						double newBalance = newBalance + intrMade +monthlyAdd;
						System.out.println("Month		Interest		Balance");
						System.out.println(i+"		"+intrMade+"		"+newBalance);
						double totalIntrest = totalIntrest + intrMade;
						System.out.println("Total Intrest Earned: $ " + totalIntrest);
						System.out.println("Total Nest Egg: $ " + newBalance);
					}
					else {
						double intrMade = intrMade + ((((1+rateReturn)/(1+rateInflation))-1)/12) * newBalance;
						double newBalance = newBalance + intrMade +monthlyAdd;
						System.out.println("Month		Interest		Balance");
						System.out.println(i+"		"+intrMade+"		"+newBalance);
						double totalIntrest = totalIntrest + intrMade;
					}
						
				}
				
			} catch (NumberFormatException nfe) {
				System.out.println("Incorrect input.");
			}
		}
	}

}
