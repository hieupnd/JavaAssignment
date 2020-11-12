/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import model.QuestionBank;
/**
 *
 * @author Phan Duc Hieu
 */
public class QuestionBankDAO {
    public String Problem() {
        Scanner input = new Scanner(System.in);
        System.out.println("ADD NEW PROBLEM");
        
        Random rand = new Random();
        String id = "ID" + rand.nextInt(100000);
        
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        String date = day + "/" + month + "/" + year;
        
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
        return newQuestion.toString();
    }  
}
