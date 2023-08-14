package training;

public class StrngOperations {

	public static void main(String[] args) {
		//Returns the character at the specified index (position)
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		
		//The concat() method appends (concatenate) a string to the end of another string.
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));

		//The equals() method compares two strings, and returns true if the strings are equal, and false if not.
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		String myStr3 = "Another String";
		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
		System.out.println(myStr1.equals(myStr3)); // false
		
		
		//The toLowerCase() method converts a string to lower case letters.

		//The toUpperCase() method converts a string to upper case letters.
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		
		
		//The trim() method removes whitespace from both ends of a string.
		
		String myStr5 = "       Hello World!       ";
		System.out.println(myStr5);
		System.out.println(myStr5.trim());
		
	}

}
