package java22.junit;

import java.util.Scanner;

public class Student {
    
    private int    score = 0;
    private String name  = "";
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString() {
        return "Student [score=" + score + ", name=" + name + "]";
    }

    
    public Student() {
        super();
    }
    
    public Student(int score, String name) {
        super();
        this.score = score;
        this.name = name;
    }
    
    public String getgrade(int score) {
        String result = "";
                
        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }
        return result;
    }
    
}
