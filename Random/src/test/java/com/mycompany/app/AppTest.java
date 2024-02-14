package com.mycompany.app;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
   static Rnd random;
   @BeforeAll
   static void init() {
	  random = new Rnd(1, 10);
   }
   @Test
   void retrieveMinimum() {
	  int min = random.getMin();
	  assertEquals(1, min);
   }
   @Test
   void retrieveMaximum() {
	  int max = random.getMax();
	  assertEquals(10, max);
   }
   @Test
   void numberGTMin() {
	  int min = random.getMin();
	  assertTrue(random.getNumber() > min);
   }
   @Test
   void numberLTMax() {
	  int max = random.getMax();
	  assertTrue(random.getNumber() < max);
   }
   @Test
   void integerGTMin() {
	  int min = random.getMin();
	  assertTrue(random.getInteger() > min);
   }
   @Test
   void integerLTMax() {
	  int max = random.getMax();
	  assertTrue(random.getInteger() < max);
   }
   @Test
   void zeroOrOne() {
	  int zeroOrOne = random.zeroOrOne();
	  assertTrue(zeroOrOne == 0 || zeroOrOne == 1);
   }
   @Test
   void chooseInt() {
	  int nums[] = {1, 2, 3, 4};
	  int numChoice = random.choice(nums);
	  boolean choice = Arrays.stream(nums).anyMatch(num -> num == numChoice);
	  assertTrue(choice);
   }
   @Test
   void populateArrLength() {
	  int randArr[] = Rnd.populate(3, 1, 50);
	  assertTrue(randArr.length == 3);
   }
   @Test
   void populateArrMatches() {
	  String regex = "^[1-4][0-9]?$|^50";
	  int randArr[] = Rnd.populate(3, 1, 50);
	  for(int rand : randArr)
		 assertTrue(Pattern.matches(regex, Integer.toString(rand)));
   }
}
