package com.moodAnalyserTest;


import org.junit.Assert;
import org.junit.Test;



public class MoodAnalyserTest {

	@Test
	public void givenMessageReturnMood() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser(); //Object of MoodAnalyser class
		String mood = moodAnalyser.analyseMood("Enter sad message here"); 
		Assert.assertEquals("SAD",mood); //compares the value of mood with "SAD" 
		System.out.println(mood);
	}

}
