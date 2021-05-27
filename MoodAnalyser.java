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

	public String analyseMood(String message) throws MoodAnalysisException {
		this.message=message;
		return analyseMood();
		
	}

	public String analyseMood() throws MoodAnalysisException {
		
		try {
			if(message.length()==0) {
		
				throw new MoodAnalysisException("EMPTY");
			}
		
		if(message.contains("sad")) {
			
			return "SAD";
			
		}else {
			
			return "HAPPY";
		}
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("NULL");
		}
		}

}
