public class Coordinate {
	/** The number (row) */
	public int num;
	/** The letter (column) */
	public int letter;

	/**
	 * Constructs a Coordinate object
	 * 
	 * @param num
	 *            the numb (row) of this Coordinate
	 * @param letter
	 *            the letter (column) of this Coordinate
	 */
	public Coordinate(int num, int letter) {
		this.num = num;
		this.letter = letter;
	}

	/**
	 * @param pos
	 *            the Coordinate
	 * @return Notated String of Coordinate (IE: a8 or d5)
	 */
	public static String notatedPos(Coordinate pos) {
		char ch = 'a';
		ch += pos.letter;
		return "" + ch + (pos.num + 1);
		// chess board starts at 1
	}

	/**
	 * @param num
	 *            the number (row) of the Coordinate
	 * @param letter
	 *            the letter (column) of the Coordinate
	 * @return Notated String of Coordinate (IE: a8 or d5)
	 */
	public static String notatedPos(int num, int letter) {
		return notatedPos(new Coordinate(num, letter));
	}

	/** @return the notated String (IE: a8 or d5) */
	public String getNotation() {
		return notatedPos(this);
	}

	public static Coordinate decode(String notation) {
		int letter = 'a' - notation.charAt(0);
		int num = Integer.valueOf(notation.charAt(1)) - 1;
		return new Coordinate(num, letter);
	}
}
