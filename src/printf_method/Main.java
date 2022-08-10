package printf_method;

public class Main {

	public static void main(String[] args) {

		// printf() = an optional method to control, format, and dsiplay text to the
		// console window
		// two arguments = format string + (object/variable/value)
		// %[flags] [precision] [width] [conversion-character]

		// 123 can always be a variable

		boolean myBoolean = false;
		char myChar = 'A';
		double myDouble = -1000;
		String myString = "Alex";
		int num = 10;

		// [conversion-character]
//		System.out.printf("%b", myBoolean);
//		System.out.printf("%c", myChar);
//		System.out.printf("%d", num);
//		System.out.printf("%f", myDouble);
//		System.out.printf("%s", myString);

//		System.out.printf("This is a format string %d", 123);
//		
		System.out.println();
		// [width]
		// minimum number of characters to be written as output
//		System.out.printf("Hello %10s", myString); // add a 10 spaces including the variable

		// [precison]
		// sets number of digits of precision when operating floating point values
//		System.out.printf("You have much money %.1f", myDouble); // set the precision of a number like in tens,
																	// hundreds, thousands e.t.c

		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus (+) or minus (-) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000

		System.out.printf("You have much money %,f", myDouble);

	}

}
