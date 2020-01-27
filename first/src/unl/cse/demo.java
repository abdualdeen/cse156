package unl.cse;

public class demo {
	public static void main(String args[]) {
		int x = 10;
		double pi = 3;
		char initial = 'C';
		// others: long, short, byte, float
		boolean isStudent = true;
		String firstName = "Chris";
		String lastName = "Bourke";
		String fullName = lastName + ", " + firstName;
		String s = "hello";
		String t = s;
		s = "Hello";
		System.out.println(s);
		System.out.println(t);
		// strings are immutable so you need to change variable to change it
		s.toUpperCase();
		String u = s.toUpperCase();
	}

}
