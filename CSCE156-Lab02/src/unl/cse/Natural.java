package unl.cse;
public class Natural {

	public static void main(String args[]) {
		if(args.length != 1) {
			System.err.println("ERROR: expecting a single integer argument");
			System.exit(1);
		}
		
		Integer n = null;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException nfe) {
			System.err.println("ERROR: expecting a single integer argument");
			System.exit(1);
		}
		
		String zeroToTen[] = new String[11];
		zeroToTen[0] = "zero";
		zeroToTen[1] = "one";
		zeroToTen[2] = "two";
		zeroToTen[3] = "three";
		zeroToTen[4] = "four";
		zeroToTen[5] = "five";
		zeroToTen[6] = "six";
		zeroToTen[7] = "seven";
		zeroToTen[8] = "eight";
		zeroToTen[9] = "nine";
		zeroToTen[10] = "ten";

		//TODO: write a for-loop to compute the sum of 1..n
		int sum = 0;
		for (int i1 = 0; i1<=n; i1++) {
			sum = sum+i1;
		}
		System.out.println(sum);
		System.out.println("=======");
		//TODO: write a while-loop to compute the sum of 1..n
		int i2 = 0;
		int Wsum = 0;
		while (i2<=n) {
			Wsum += i2;
			i2++;
		}
		System.out.println(Wsum);
		System.out.println("=======");

		//TODO: write an enhanced for-loop to iterate over the zeroToTen array 
//		for (String i3:zeroToTen) {
//			if(i3.equals("ten")) {
//				System.out.print(i3+ " = 55");
//			}
//			else {
//					System.out.print(i3+ " + ");
//				}
//					
//		}


	}
}
