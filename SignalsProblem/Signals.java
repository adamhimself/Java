import java.util.Random;
import java.util.Scanner;

class Signals {
	public static void main (String[] args) {
		Random Signal = new Random();
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int number;
		int redTimeRemain;
		int redCount = 0;
		int greenCount = 0;
		int waitTime = 0;
		int numberOfSchoolRuns = 0;
		
		System.out.println("Enter the number of signals Calvin encounters: ");
		int numberOfSignals = reader.nextInt(); // end user can declare how many signals are on the way to school.
		
						
		for (int counter=1; counter<=1; counter++) {
			
			int wandUses = 1; // end user can declare how many uses of the magic wand are available.
			numberOfSchoolRuns++;
			for (int i=1; i<= numberOfSignals; i++) {
				number = Signal.nextInt(2);
				System.out.println("Signal " + i + " encountered!");
				if (number == 0) {
					System.out.println("The signal is Red!");
					redCount++;
					redTimeRemain = (Signal.nextInt(80));
					System.out.println(redTimeRemain + " seconds remaining until signal change!");
					
					/**The below condition ensures that the wand is used on last red signal regardless of duration. */
					if (((wandUses > 0) && (redTimeRemain > 20)) || i==numberOfSignals) { 
						wandUses = wandUses - 1;
						System.out.println("Wand used! Signal has been changed to green! no time added!");
					} else {
					
					waitTime = waitTime + (redTimeRemain);
					System.out.println("Time added = " + waitTime);
					}
					
				} else {
					System.out.println("The signal is green! No time added!");
					greenCount++;
				}
			}					
			
		} // end for loop
		System.out.println("The total number of red signals is " + redCount);
		System.out.println("The total number of green signals is " + greenCount);
		System.out.println("Total wait time is " + waitTime);
		System.out.println("Total number of Calvin's school runs is " + numberOfSchoolRuns);
		System.out.println("The expected wait time per school run is " + (waitTime/numberOfSchoolRuns) + " seconds");
	} // end main method

} // end class