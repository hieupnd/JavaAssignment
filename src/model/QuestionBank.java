/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Phan Duc Hieu
 */
public class QuestionBank {
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

    void updateProblem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addProblem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class addProblem{
    void addProblem() {
        Scanner input = new Scanner(System.in);
        System.out.println("ADD NEW PROBLEM");
        
        Random rand = new Random();
        String id = "ID" + rand.nextInt(100000);
        
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        String date = month + " " + day + " " + year;
        
        System.out.print("Problem name: ");
        String name = input.nextLine();
        
        System.out.println("Short description: ");
        String shortDescription = input.nextLine();
        
        System.out.println("Full decription: ");
        String fullDescription = input.nextLine();
        
        System.out.print("Mark weight: ");
        int markWeight = Integer.parseInt(input.nextLine());
        
        System.out.println("Category: ");
        String category = input.nextLine();
        
        System.out.println("Author: ");
        String author = input.nextLine();
        
        QuestionBank newQuestion = new QuestionBank(id,date,name,shortDescription,fullDescription,markWeight,category,author);
        
        
    }
}
