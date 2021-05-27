package com.moodAnalyserTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessageReturnMood() {
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("Enter message here");
		System.out.println(mood);
	}

}
