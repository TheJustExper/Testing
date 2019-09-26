public class index {
	
	public static void main(String[] args) {
		Kettle k = new Kettle("Red", "IBM", 1000, 0); // Initialising a new kettle with arguments "Red", "IBM", 1000, 0
		k.fillUp(1000); // Calling fillUp function with value of 1000
		k.pour(100); // Calling pour function with value 100
	}
}
