/*
 *  CS312 Assignment 2.
 *  On my honor, Shruti Patel, this programming assignment is my own work.
 *
 *  A program to print out the UT Tower in ASCII art form.
 *
 *  Name: Shruti Patel
 *  email address: shrutipatel@utexas.edu
 *  UTEID: SP44725
 *  Section 5 digit ID: 52550
 *  Grader name: Nathan
 *  Number of slip days used on this assignment:
 */

public class Tower {

	// CS312 students, DO NOT ALTER THE FOLLOWING LINE except for the
	// value of the literal int.
	// You may change the literal int assigned to SIZE to any value from 2 to 100.
	// In the final version of the program you submit set the SIZE to 3.
	public static final int SIZE = 3;

	// create constant variables used throughout the program to reduce redudancy
	public static final int SIZE_TWO = SIZE * 2;
	public static final int SIZE_FIVE = SIZE * 5;
	public static final int SIZE_FOUR = SIZE * 4;
	public static final int TWO_MINUS_ONE = SIZE_TWO - 1;

	public static void main(String[] args) {
		bell();
		towerBody();
		staircase();
		bottom();

	}

	// a method that prints the hashtag structure in the bell
	public static void hashtagDesign() {
		bellSpacing();
		// print the # SIZE * 2 - 1 times
		for (int hashtag = 1; hashtag <= TWO_MINUS_ONE; hashtag++) {
			System.out.print("#");
		}
		System.out.println();
	}

	// a method that prints the line structure in the bell
	public static void bell() {
		// create constant variable, MINUS_TWO, used in bell() only which takes constant, SIZE_TWO, and substracts two
		final int MINUS_TWO = SIZE_TWO - 2;
		hashtagDesign();
		// create a nested for loop to print the lines
		for (int lineHeight = 1; lineHeight <= MINUS_TWO; lineHeight++) {
			bellSpacing();
			for (int lineWidth = 1; lineWidth <= TWO_MINUS_ONE; lineWidth++) {
				System.out.print("|");
			}
			System.out.println();
		}
		hashtagDesign();
	}

	// a method that prints the spacing before the bell
	public static void bellSpacing() {
		// create constant variable, PLUS_TWO, used in bellSpacing() only which takes constant, SIZE_FOUR, and adds two
		final int PLUS_TWO = SIZE_FOUR + 2;
		// create a for loop to bring the spacing for the bell part of the tower
		for (int bellSpace = 1; bellSpace <= PLUS_TWO; bellSpace++) {
			System.out.print(" ");
		}
	}

	// prints the body of the tower by also calling the spacing of the body and the tilde design methods
	public static void towerBody() {
		// for loop that prints the body of the tower
		for (int towerHeight = 1; towerHeight <= SIZE * SIZE; towerHeight++) {
			tildeDesign();
			bodySpacing();
			System.out.print("|-");
			// for loop that prints the middle design of the tower
			for (int towerDesign = 1; towerDesign <= SIZE; towerDesign++) {
				System.out.print("O-");
			}
			System.out.print("|");
			System.out.println();
		}
		tildeDesign();
	}

	// prints the ~ (tilde) design
	public static void tildeDesign() {
		// create constant variable, PLUS_THREE, used in tildeDesign() only which takes constant, SIZE_TWO, and adds three
		final int PLUS_THREE = SIZE_TWO + 3;
		bodySpacing();
		// for loop that prints the tilde design
		for (int tilde = 1; tilde <= PLUS_THREE; tilde++) {
			System.out.print("~");
		}
		System.out.println();
	}

	// prints the spacing of the body of the tower
	public static void bodySpacing() {
		// for loop that prints the spacing of the body of the tower
		for (int bodySpace = 1; bodySpace <= SIZE_FOUR; bodySpace++) {
			System.out.print(" ");
		}
	}

	// prints the staircase design
	public static void staircase() {
		// create constant variable, DIVIDE_TWO, used in staircase() only which takes constant, SIZE, and divides by 2
		final int DIVIDE_TWO = SIZE / 2;
		// create a nested for loop that prints the spacing and design for the staircase portion
		for (int stairHeight = DIVIDE_TWO; stairHeight >= 0; stairHeight--) {
			// create constant variable, ROW_TIMES_THREE, used in staircase() only which takes variable, row, and multiplies by 3
			final int ROW_TIMES_THREE = stairHeight * 3;
			for (int stairSpace = ROW_TIMES_THREE; stairSpace >= 1; stairSpace--) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int stairDesign = 1; stairDesign <= SIZE_FIVE - (ROW_TIMES_THREE); stairDesign++) {
				System.out.print("\"'");
			}
			System.out.println("\"\\");
		}
	}

	// creates a for loop to print the design SIZE amount of times
	public static void bottom() {
		// for loop that prints the bottom design SIZE times
		for (int bottomHeight = 1; bottomHeight < SIZE; bottomHeight++) {
			bottomDesign();
			System.out.println();
		}
		bottomDesign();
	}

	// prints the design of the bottom of the tower
	public static void bottomDesign() {
		System.out.print("/");
		// creates a for loop that prints the design at the bottom of the tower
		for (int designBottom = 1; designBottom <= SIZE_FIVE; designBottom++) {
			System.out.print("\"O");
		}
		System.out.print("\"\\");
	}
}