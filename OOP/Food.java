public class Food {
    String name;

	Food(String name) {
	    this.name = name;
	}

	public String toString() {
	    return String.format("The name of the food is %s.", this.name);
	}
}
