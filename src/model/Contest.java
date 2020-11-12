/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Phan Duc Hieu
 */
public class Contest {
    public String contestId;
    public String Date;
    public String Author;
    public String Question1;
    public String Question2;
    public String Question3;
    public String Question4;
    public String Question5;
    
    public Contest() {
    }
    public Contest(String contestId, String Date, String Author, String Question1, String Question2, String Question3, String Question4, String Question5) {
        this.contestId = contestId;
        this.Date = Date;
        this.Author = Author;
        this.Question1 = Question1;
        this.Question2 = Question2;
        this.Question3 = Question3;
        this.Question4 = Question4;
        this.Question5 = Question5;
    }
    public String getContestId() {
        return contestId;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getQuestion1() {
        return Question1;
    }

    public void setQuestion1(String Question1) {
        this.Question1 = Question1;
    }

    public String getQuestion2() {
        return Question2;
    }

    public void setQuestion2(String Question2) {
        this.Question2 = Question2;
    }

    public String getQuestion3() {
        return Question3;
    }

    public void setQuestion3(String Question3) {
        this.Question3 = Question3;
    }

    public String getQuestion4() {
        return Question4;
    }

    public void setQuestion4(String Question4) {
        this.Question4 = Question4;
    }

    public String getQuestion5() {
        return Question5;
    }

    public void setQuestion5(String Question5) {
        this.Question5 = Question5;
    }
    
    
}
