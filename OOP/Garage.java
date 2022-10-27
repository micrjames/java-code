public class Garage {
    static int numberOfPkgStalls;
	int totalNumStalls;

	Garage(int totalNumStalls) {
	    this.totalNumStalls = totalNumStalls;
	}

    void park(Car car) {
	    String pkgMsg;
	    if(numberOfPkgStalls < this.totalNumStalls) {
		   pkgMsg = String.format("The %s %s is parked in the garage.", car.make, car.model);
		   numberOfPkgStalls++;
		} else {
		   pkgMsg = "The garage is full.";
		}
		System.out.println(pkgMsg);
	}

	static int displayNumStalls() {
	    return numberOfPkgStalls;
	}
}
