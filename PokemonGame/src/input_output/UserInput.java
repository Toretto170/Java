package input_output;
import java.io.*;


public class UserInput {

	
	public UserInput() { };
	
	// prompts the specified String to the screen, without end-of-line
	public static void prompt (String s) {

		System.out.print(s + " ");
		System.out.flush();

  	} // end prompt()


	// reads the user's answer and returns it as a char
	public static char readChar() {

		char returnValue = 'a';
		DataInputStream dis = new DataInputStream(System.in);

		try {
			String userInput = new String(dis.readLine());
			returnValue = userInput.charAt(0); //return just the first character 
				
		}
		catch(Exception e) {
			System.err.println("Exception while reading user's input as a char");	
		}

	return returnValue;
	} // end readChar()


	// reads the user's answer and returns it as a String
	public static String readString() {

		DataInputStream dis = new DataInputStream(System.in);
		String userInput = null;

		try {
			userInput = new String(dis.readLine());
				
		}
		catch(Exception e) {
			System.err.println("Exception while reading user's input as a String");	
		}

	return userInput;
	} // end readString()



	// reads the user's answer and returns it as a short
	public static short readShort() {

		short returnValue = 0;
		DataInputStream dis = new DataInputStream(System.in);

		try {
			String userInput = new String(dis.readLine());
			returnValue = (java.lang.Short.valueOf(userInput)).shortValue();
				
		}
		catch(Exception e) {
			System.err.println("Exception while reading user's input as a short");	
		}

	return returnValue;
	} // end readShort()


	// reads the user's answer and returns it as an int
	public static int readInt() {

		int returnValue = 0;
		DataInputStream dis = new DataInputStream(System.in);

		try {
			String userInput = new String(dis.readLine());
			returnValue = (java.lang.Integer.valueOf(userInput)).intValue();
				
		}
		catch(Exception e) {
			System.err.println("Exception while reading user's input as an int");	
		}

	return returnValue;
	} // end readInt()


	// reads the user's answer and returns it as a float
	public static float readFloat() {

		float returnValue = 0;
		DataInputStream dis = new DataInputStream(System.in);
		
		try {
			String userInput = new String(dis.readLine());
			returnValue = (java.lang.Float.valueOf(userInput)).floatValue();
				
		}
		catch(Exception e) {
			System.err.println("Exception while reading user's input as a float");	
		}

	return returnValue;
	} // end readFloat()


	// reads the user's answer and returns it as a double
	public static double readDouble() {

		double returnValue = 0;
		DataInputStream dis = new DataInputStream(System.in);

		try {
			String userInput = new String(dis.readLine());
			returnValue = (java.lang.Double.valueOf(userInput)).doubleValue();
				
		}
		catch(Exception e) {
			System.err.println("Exception while reading user's input as a double");	
		}

	return returnValue;
	} // end readDouble()


	// this method reads the user's answer and returns it as a long
	public static long readLong() {

		long returnValue = 0;
		DataInputStream dis = new DataInputStream(System.in);

		try {
			String userInput = new String(dis.readLine());
			returnValue = (java.lang.Long.valueOf(userInput)).longValue();
				
		}
		catch(Exception e) {
			System.err.println("Exception while reading user's input as a long");	
		}

	return returnValue;
	} // end readLong()

/*	
	// main class, used to test the various methods
	public static void main(String[] argv) {

		prompt("Enter int: ");
		int tempint = readInt();
		System.out.println("Read int: " + tempint);

		prompt("Enter double: ");
		double tempdouble = readDouble();
		System.out.println("Read double: " + tempdouble);

		prompt("Enter char: ");
		char tempchar = readChar();
		System.out.println("Read char: " + tempchar);

		prompt("Enter String: ");
		String tempString = readString();
		System.out.println("Read String: " + tempString);

		prompt("Enter short: ");
		short tempshort = readShort();
		System.out.println("Read short: " + tempshort);

		prompt("Enter long: ");
		long templong = readLong();
		System.out.println("Read long: " + templong);

		prompt("Enter float: ");
		float tempfloat = readFloat();
		System.out.println("Read float: " + tempfloat);


	} // end main()
*/

} // end class

