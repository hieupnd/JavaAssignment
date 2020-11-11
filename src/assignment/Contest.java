/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Phan Duc Hieu
 */
public class Contest {
    public String contestId;
    public String Date;
    public String Author;
    public String QuestionId;

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

    public String getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(String QuestionId) {
        this.QuestionId = QuestionId;
    }
    
    public Contest() {
    }
    
    public Contest(String contestId, String Date, String Author, String QuestionId) {
        this.contestId = contestId;
        this.Date = Date;
        this.Author = Author;
        this.QuestionId = QuestionId;
    }
    
}
