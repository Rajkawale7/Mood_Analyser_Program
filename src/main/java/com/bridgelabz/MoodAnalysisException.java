package com.bridgelabz;

public class MoodAnalysisException extends Throwable {
    String message;
    public MoodAnalysisException(String message) {
        this.message = message;
    }
}
