public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "buckets";
		
		while (beerNum > 0) {			
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("You take one down");
			System.out.println("You Pass it round");
			beerNum = beerNum - 1;
			
			if (beerNum == 1) {
				word = word.substring(0, word.length() - 1); // singular word				
			}
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");					
			}	else {
				System.out.println("No more " + word + "s" + " of beer on the wall.");				
			} // end else
			
		} // end of while loop
			
	} // end of main method
	
} // End of class