package com.moodAnalyserTest;


import org.junit.Assert;
import org.junit.Test;



public class MoodAnalyserTest {

	@Test
	public void givenMessageReturnMood() throws MoodAnalysisException {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser(); //Object of MoodAnalyser class
		String mood = moodAnalyser.analyseMood("Enter sad message here"); 
		Assert.assertEquals("SAD",mood); //compares the value of mood with "SAD" 
		System.out.println(mood);
	}
	
	@Test
	public void givenAnyMessageReturnMood() throws MoodAnalysisException {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser(); //Object of MoodAnalyser class
		String mood = moodAnalyser.analyseMood("Enter message here"); 
		Assert.assertEquals("HAPPY",mood); //compares the value of mood with "SAD" 
		System.out.println(mood);
		
	}
	
	@Test
	public void givenSadMessageReturnSad() throws MoodAnalysisException {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser("Enter sad message here"); //message is initialized through constructor
		String mood = moodAnalyser.analyseMood(); 
		Assert.assertEquals("SAD",mood); //compares the value of mood with "SAD" 
		System.out.println(mood);
	}
	
	@Test
	public void givenAnyMessageReturnHappy() throws MoodAnalysisException {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser("Enter message here"); //message is initialized through constructor
		String mood = moodAnalyser.analyseMood(); 
		Assert.assertEquals("HAPPY",mood); //compares the value of mood with "SAD" 
		System.out.println(mood);
	}
	
	@Test
	public void givenNullInputHandleException() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			
		 moodAnalyser.analyseMood(null);
		
		}catch(MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.error_type.NULL_INPUT, e.exceptionType(null));
			System.out.println(e.exceptionType(null)+": Enter a proper message");
		}
		
	}
	
	@Test
	public void givenEmptyInputHandleException() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		try {
			
		 moodAnalyser.analyseMood(" ");
		
		}catch(MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.error_type.EMPTY_INPUT, e.exceptionType(" "));
			System.out.println(e.exceptionType(" ")+": Enter a proper message");
		}
		
	}

}
