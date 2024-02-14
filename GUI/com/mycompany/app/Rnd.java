package com.mycompany.app;

import java.util.Random;
import java.util.Arrays;

public class Rnd extends Random {
    // "number" and "integer" functions returns are inclusive of max and min
    private int minimum;
    private int maximum;

	public Rnd() {
	   this.minimum = -1;
	   this.maximum = -1;
	}
	public Rnd(int minimum, int maximum) {
	   this.minimum = minimum;
	   this.maximum = maximum;
	}

    public void setMin(int value) {
	    this.minimum = value;
	}
    public int getMin() {
	    return this.minimum;
	}
    public void setMax(int value) {
	    this.maximum = value;
	}
    public int getMax() {
	    return this.maximum;
	}

    public double getNumber() {
		return this.nextDouble() * (this.maximum - this.minimum + 1) + this.minimum;
	}
      
    public int getInteger() {
		return this.nextInt(this.maximum);
	}
	  
	public int zeroOrOne() {
	    return this.nextInt(1);
	}
	
    public <T> T choice(T[] array) {
	    Rnd random = new Rnd(0, array.length-1);	
	    return array[random.getInteger()];
	}
	  
	public static int[] populate(int n, int start, int end) {
	   int array[] = new int[n];
	   Rnd rand = new Rnd(start, end);
	   Arrays.fill(array, rand.getInteger());

	   return array;
	}
}

