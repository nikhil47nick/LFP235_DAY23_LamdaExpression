package com.bridgelabz.Day23;

import com.bridgelabz.Day21.MoodAnalyzer;
import com.bridgelabz.Day21.MoodAnalyzerException;
import junit.framework.TestCase;
import org.junit.Test;

public class MoodAnalyzerTest extends TestCase {

    @Test
    public  void testMoodAnalysereturnSad() throws com.bridgelabz.Day21.MoodAnalyzerException {
        com.bridgelabz.Day21.MoodAnalyzer mood = new com.bridgelabz.Day21.MoodAnalyzer();
        assertEquals("Sad",mood.analyseMood("I am in Sad Mood"));
    }

    @Test
    public  void testMoodAnalysereturnHappy() throws com.bridgelabz.Day21.MoodAnalyzerException {
        com.bridgelabz.Day21.MoodAnalyzer mood = new com.bridgelabz.Day21.MoodAnalyzer();
        assertEquals("Happy",mood.analyseMood("I am in Happy Mood"));
    }

    @Test
    public  void testMoodAnalyseNullreturnHappy() throws com.bridgelabz.Day21.MoodAnalyzerException {
        com.bridgelabz.Day21.MoodAnalyzer mood = new com.bridgelabz.Day21.MoodAnalyzer();
        assertEquals("Happy",mood.analyseMood(null));
    }

    @Test
    public  void testMoodAnalyseEmptyreturnEmpty() throws MoodAnalyzerException {
        com.bridgelabz.Day21.MoodAnalyzer mood = new MoodAnalyzer();
        assertEquals("Empty",mood.analyseMood(""));
    }
}