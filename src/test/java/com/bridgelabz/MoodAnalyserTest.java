package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    //First Test case for "Feeling Sad"
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {

        //Assuming class MoodAnalyser then creating new class for it
        MoodAnalyser moodAnalyser = new MoodAnalyser();               //creating object of MoodAnalyser
        String result = moodAnalyser.analyseMood("User is Sad");    //calling method "analyseMood"
        Assertions.assertEquals(result,"SAD");
    }
    //Second Test case for "Feeling Happy"
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("User is Happy");
        Assertions.assertEquals(result,"HAPPY");
    }
}