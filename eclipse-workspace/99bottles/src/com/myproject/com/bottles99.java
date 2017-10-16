package com.myproject.com;
//Grant McGregor
//16/10/2017
public class bottles99 {
//This program displays the 99 bottles song instantaneously
	
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		//Loop that triggers if the integer beernum is above 0
		while (beerNum > 0) {
			
			//Prints lines of the song to the screen
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			//Removes 1 bottle from the song each time 99 to 98 etc
			beerNum = beerNum - 1;
			//Edited: staement moved from above println code to enforce statement at correct place.
			//If the number of beer becomes equal to 1 the singular will be used instead of the plural.
			if (beerNum == 1) {
				word = "bottle";
			}
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {//Stops Program from looping again
				System.out.println("No more bottles of beer on the wall");
				
			}
	}
	}
}
