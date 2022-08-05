package variable;

public class Variables {
	
	/**
	 * There are eight primitive data types
	 * 
	 * 1- boolean size = 1 bit value = true or false
	 * 2-byte 	size =   1 byte value = -128 to 127
	 * 3-short	size =	2 bytes value = -32,768 to 32,767
	 * 4-int	size =	4 bytes value = -2 billion to 2 billion
	 * 5-long	size =	8 bytes value = -9 quintillion to 9 quintillion
	 * 6-float	size =	4 bytes value = stores decimal 6-7 digits
	 * 7-double	size =	8 bytes value= could store up to 15 digits	
	 * 8-char	size =	2 bytes value= single character using single quotes
	 * reference-String varies
	 * 
	 * primitive are 8 types
	 * reference data type are user defined
	 * 
	 * primitive data type stores data
	 * reference data type stores an address
	 * 
	 * primitive data type only holds 1 value
	 * reference data type holds more than 1 value 
	 * 
	 * primitive use less memory
	 * reference data type use more memory
	 * 
	 * primitive is fast
	 * reference is slow
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		int x; // declaration
		
		x = 11;// Assignment

		float fo = 3.142323232323232323232323223232323232323223f;
		System.out.println("This is a float " + fo);
		 
			System.out.printf("My number is %d", x).println();
			// formated string

			int y = 123; // initialization
		 System.out.println(y);

		
	}

	

}
