package com.mycompany.app;

import java.util.Random;
import java.util.Arrays;

class Rnd extends Random {
    // "number" and "integer" functions returns are inclusive of max and min
    private int minimum;
    private int maximum;

	Rnd() {
	   this.minimum = -1;
	   this.maximum = -1;

	   this.setSeed(System.currentTimeMillis());
	}
	Rnd(int minimum, int maximum) {
	   this.minimum = minimum;
	   this.maximum = maximum;

	   this.setSeed(System.currentTimeMillis());
	}

    void setMin(int value) {
	    this.minimum = value;
	}
    int getMin() {
	    return this.minimum;
	}
    void setMax(int value) {
	    this.maximum = value;
	}
    int getMax() {
	    return this.maximum;
	}

    double getNumber() {
		return this.nextDouble() * (this.maximum - this.minimum + 1) + this.minimum;
	}
      
    int getInteger() {
		return this.nextInt(this.maximum);
	}
	  
	int zeroOrOne() {
	    return this.nextInt(1);
	}
	
    int choice(int nums[]) {
	    this.minimum = 0;
	    this.maximum = nums.length - 1;
		
	    return nums[this.getInteger()];
	}
	  
	static int[] populate(int n, int start, int end) {
	   int array[] = new int[n];
	   Rnd rand = new Rnd(start, end);
	   Arrays.fill(array, rand.getInteger());

	   return array;
	}
}

