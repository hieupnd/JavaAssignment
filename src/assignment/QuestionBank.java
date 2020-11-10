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
class QuestionBank {
    public String problemId;
    public String generateDate;
    public String problemName;
    public String shortDescription;
    public String fullDescription;
    public double markWeight;
    public String category;
    public String author;

    public QuestionBank() {
    }

    public QuestionBank(String problemId, String generateDate, String problemName, String shortDescription, String fullDescription, double markWeight, String category, String author) {
        this.problemId = problemId;
        this.generateDate = generateDate;
        this.problemName = problemName;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.markWeight = markWeight;
        this.category = category;
        this.author = author;
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    public String getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(String generateDate) {
        this.generateDate = generateDate;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public double getMarkWeight() {
        return markWeight;
    }

    public void setMarkWeight(double markWeight) {
        this.markWeight = markWeight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "QuestionBank{" + "problemId=" + problemId + ", generateDate=" + generateDate + ", problemName=" + problemName + ", shortDescription=" + shortDescription + ", fullDescription=" + fullDescription + ", markWeight=" + markWeight + ", category=" + category + ", author=" + author + '}';
    }

    void addProblem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
