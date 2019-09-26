
public class Kettle {
	
	String colour; // Type string for colour
	String manufacturer; // Type string for manufacturer
	
	int maxCapacity; // Type int for maxCapacity
	int currentCapacity; // Type int for currentCapacity
	
	
	public Kettle(String c, String m, int mC, int cC) {
		this.colour          = c; // Settings the value of the variable to c
		this.manufacturer    = m; // Settings the value of the variable to m
		this.maxCapacity     = mC;// Settings the value of the variable to mC
		this.currentCapacity = 0; // Settings the value of the variable to 0
		
		// Printing the kettles colour
		System.out.println("A kettle has been created with a colour of " + this.colour);
	}
	
	public void fillUp(int amount) { // Integer amount
		// If amount is less than or equal to 0 throw the error as you cant fill up with nothing
		if (amount <= 0) throw new Error("Can't fill kettle up with 0 ml or less than 0");
		
		// If the current capacity + the amount is bigger than the map (Overflowing)
		if (this.currentCapacity + amount > this.maxCapacity) {
			// Make the current the max as it's overflowed
			this.currentCapacity = this.maxCapacity;
		} else {
			// Because it's not overflowing add the amount to the current capacity
			this.currentCapacity += amount;
		}
		
		// Print out the kettles capacity
		System.out.println("Kettle is at " + this.currentCapacity);
	}
	
	public void pour(int amount) { // Integer amount
		// If the amount is less than or equal to 0 or is bigger than the capacity throw error
		if (amount <= 0 || amount > this.currentCapacity) throw new Error("Can't pour");
		
		// If the current capacity - the amount is less than 0, you have poured all of it
		if (this.currentCapacity - amount < 0) {
			// Set the current to 0 as there is none left
			this.currentCapacity = 0;
		} else {
			// Else if its not less than 0 - the amount from the current
			this.currentCapacity -= amount;
		}
		
		// Print kettles current capacity
		System.out.println("Kettle is at " + this.currentCapacity);
	}
}
