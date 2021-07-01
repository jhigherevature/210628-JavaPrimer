package constructors;

import java.util.Date;
import scopes.Data;

/*
 * Import statements allow you to dictate which packages to
 * search for information you are trying to access/objects you
 * want to create from classes
 * 
 * When you include an import statement, you are informing your
 * JVM what locations to search for this data. By default the
 * JVM will only search for classes within the same package or
 * classes within the java.lang package of the JRE. Otherwise
 * you must include an import statement to use that functionality
 * 
 * You can use the Hotkey combination: CTRL + SHIFT + O to attempt
 * automatic importing
 */

public class Simulator {
	public static void main(String[] args) {
		Dog scooby = new Dog("Scooby Doo", 7, 100.0, "Great Dane");
		
		Data d = new Data();
		
		/*
		 * The Fully Qualified Class Name (FQCN) is the entire
		 * package and class of a datatype as it exists within
		 * your project's classpath.
		 * 
		 * Instead of importing a class, you can specify the
		 * FQCN when declaring the datatype, or accessing information
		 * related to the class in question
		 */
		java.util.ArrayList list = new java.util.ArrayList();
		
		Date date = new Date();	// based on the import statement above - java.util.Date
		java.sql.Date sqlDate = new java.sql.Date(0);
	}
}
