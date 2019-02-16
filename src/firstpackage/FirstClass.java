package firstpackage;

import java.util.ArrayList;

public class FirstClass {

	private String name = "Jack";
	
	// method to get the value of name
	public String getName() {
		return name;
	}
	
	// method to set the value of name
	public void setName(String someVal) {
		this.name = someVal;
	}
	
	// static method that can be called directly without creating FirstClass object.
	static void printNumber(int someNumber) {
		System.out.println(someNumber);
	}
	
	// this method runs first when program is executed
	public static void main(String[] args) {
		
		// Basic print
		System.out.println("Hello Woooorld!");
		
		// Create an array of Strings
		String[] array1 = {"hello","world"};
		
		// Print out value of index 0, which is the first element of array1
		System.out.println("array1[0]: " + array1[0]);
		
		// Print out value of index 1, which is the second element of array1
		System.out.println("array1[1]: " + array1[1]);
		
		/* Note: indices begin with 0
		 * Note: indices end with total number of elements minus 1. 
		 * Ex: array1 has 2 elements. The first index is 0. The second (last) index is 1.
		 */
		
		// Array of integers
		int[] array2 = {1,2};
		
		/* Print the values at index 0 (which is the first element) 
		 * and index 1 (which is the second & last element) of array2.
		 */
		System.out.println("array2[0]: " + array2[0]);
		System.out.println("array2[1]: " + array2[1]);
		
		// Use a for loop to print out the values of all elements array1.
		for(int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "]: " + array1[i]);
		}
		
		// Use for a loop to print out the values of all elements array2.
		for(int i = 0; i < array2.length; i++) {
			System.out.println("array2[" + i + "]: " + array2[i]);
		}
		
		System.out.println("------------------");
		
		// Create an object of type FirstClass
		FirstClass fc = new FirstClass();
		System.out.println("FirstClass fc = new FirstClass();");
		
		// Print out the name attribute of the FirstClass object fc.
		System.out.println("fc.name: " + fc.name);
		
		// Print out the getter method of the name attribute of the FirstClass object fc.
		System.out.println("fc.getName(): " + fc.getName());
		
		System.out.println("------------------");
		
		// Set the name using the setName method of the fc object.
		fc.setName("Jacqueline");
		System.out.println("fc.setName(\"Jacqueline\");");
		System.out.println("fc.getName(): " + fc.getName());
		
		System.out.println("------------------");
		
		// Create a SecondClass object named sc.
		SecondClass sc = new SecondClass();
		System.out.println("SecondClass sc = new SecondClass();");
		
		// Print color attribute of SecondClass object.
		System.out.println("sc.color: " + sc.color);
		System.out.println("sc.getName(): " + sc.getName());
		
		System.out.println("------------------");
		
		// Create an ArrayList of type String.
		System.out.println("ArrayList<String> arrayList1 = new ArrayList<String>();");
		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		// Add values of type String in the ArrayList arrayList1.
		arrayList1.add("how");
		arrayList1.add("are");
		arrayList1.add("you");
		
		// Get and print out the values of the ArrayList arrayList1.
		System.out.println("arrayList1.get(0): " + arrayList1.get(0));
		System.out.println("arrayList1.get(1): " + arrayList1.get(1));
		System.out.println("arrayList1.get(2): " + arrayList1.get(2));
		
		System.out.println("------------------");
		
		// Use a for loop to print out the values of the arrayList1.
		for(int i = 0; i < arrayList1.size(); i++) {
			System.out.println(arrayList1.get(i));
		}
		
		System.out.println("------------------");
		
		// Use the for-each loop to quickly iterate through the arrayList1 and print out the values.
		for(String i : arrayList1) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		// Static Example 1
		/* Did not have to create ThirdClass object. Can just call method directly. */
		ThirdClass.printWord("heyy");
		
		// Static Example 2
		printNumber(2);
		
		System.out.println("------------------");
		
		// Class constructor example
		FourthClass fourthClass = new FourthClass();
		
		/* This prints out 'USA' as the Class constructor was called.*/
		System.out.println(fourthClass.getCountry());
		
		/* This prints out 'USA' even though country was initialized to 'Japan' first. */
		System.out.println(fourthClass.country);
		
		/* Prints out language 'Japanese' */
		System.out.println(fourthClass.language);
		
		/*
		 * 1. fourthClass object of class FourthClass is created.
		 * 2. When object is created, country is initialized to 'Japan', language to 'Japanese'.
		 * 3. Then, the Class constructor is called and assigns 'USA' to country.
		 * 4. After object is created, the returned value of fourthClass.getCountry is printed.
		 * 5. Then, the value of the country attribute is printed.
		 * 6. Then, the value of language is printed.
		 */
		
	}
	

}

class SecondClass extends FirstClass{
	String color = "blue";
}

class ThirdClass{
	static void printWord(String someWord) {
		System.out.println(someWord);
	}
}

class FourthClass{
	
	String country = "Japan";
	String language = "Japanese";
	
	
	// Class constructor
	public FourthClass() {
		country = "USA";
	}
	
	public String getCountry() {
		return country;
	}
}



