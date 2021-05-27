package com.moodAnalyserTest;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser(String message) {
		this.message=message;
		// TODO Auto-generated constructor stub
	}

	public MoodAnalyser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String analyseMood(String message) {
		
		if(message.contains("sad")) {
			
			return "SAD";
			
		}else {
			
			return "HAPPY";
		}
		
	}

	public String analyseMood() {
		if(this.message.contains("sad")) {
					
					return "SAD";
					
				}else {
					
					return "HAPPY";
				}
	}

}
