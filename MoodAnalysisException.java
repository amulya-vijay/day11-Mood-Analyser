package com.moodAnalyserTest;


@SuppressWarnings("serial")
public class MoodAnalysisException extends Throwable {
	 
	public enum error_type{
		
		EMPTY_INPUT,
		NULL_INPUT
	}

	public MoodAnalysisException(String error) {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public error_type exceptionType(String s) {
		
		if(s==null) {
			return error_type.NULL_INPUT;
		}else if(s==" "){
			return error_type.EMPTY_INPUT;
		}else {
		return null;
		}
	}

}
