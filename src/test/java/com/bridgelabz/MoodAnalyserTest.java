package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    //First Test case for "Feeling Sad"

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException{
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
        String actualResult = moodanalyser.analyseMood();
        Assertions.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assertions.assertEquals("Happy", actualResult);
    }
}