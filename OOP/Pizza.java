public class Pizza {
    String bread;
	String sauce;
	String cheese;
	String topping;

	Pizza(String bread, String sauce, String cheese) {
	    this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
    Pizza(String bread, String sauce, String cheese, String topping) {
	    this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}

	public String toString() {
	    return String.format("Here are the ingredients of your pizza: %s, %s, %s, %s.", this.bread, this.sauce, this.cheese, this.topping);
	}
}
