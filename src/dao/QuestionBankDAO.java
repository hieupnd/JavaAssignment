/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import model.Profile;
import model.QuestionBank;
/**
 *
 * @author Phan Duc Hieu
 */
public class QuestionBankDAO {
    public void problem(String coachName) {
        FileDAO fileDao = new FileDAO();
        Profile pro = new Profile();
        CheckValiadate checkValid = new CheckValiadate();
        Scanner input = new Scanner(System.in);
        System.out.println("ADD NEW PROBLEM");
        
        Random rand = new Random();
        String id = "ID" + rand.nextInt(100000);
        
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        String date = day + "/" + month + "/" + year;
        System.out.println("Id: " + id);
        System.out.print("Problem name: ");
        String name = input.nextLine();
        while(!checkValid.checkEmptyString(name)){
            System.out.println("Name is not valid. Please input again: ");
            name = input.nextLine();
        }
        System.out.println("Short description: ");
        String shortDescription = input.nextLine();
        while(!checkValid.checkEmptyString(shortDescription)){
            System.out.println("Short description is not valid. Please input again: ");
            shortDescription = input.nextLine();
        }
        System.out.println("Full decription: ");
        String fullDescription = input.nextLine();
        while(!checkValid.checkEmptyString(fullDescription)){
            System.out.println("Full description is not valid. Please input again: ");
            fullDescription = input.nextLine();
        }
        System.out.print("Mark weight(>=0 and <=10): ");
        
        int markWeight = Integer.parseInt(input.nextLine());
        
        while(!checkValid.checkEmptyString((String.valueOf(markWeight))) || !checkValid.checkScore(markWeight)){
            System.out.println("Mark weight is not valid. Please input again: ");
            markWeight = Integer.parseInt(input.nextLine());
        }
        System.out.println("Category (sql, cea, csi, prf, mae) : ");
        String category = input.nextLine();
        while(!checkValid.checkEmptyString(category) || !checkValid.checkTypeQuestion(category)){
            System.out.println("Category is not valid. Please input again: ");
            category = input.nextLine();
        }
        
        String author = coachName;
        QuestionBank newQuestion = new QuestionBank(id,date,name,shortDescription,fullDescription,markWeight,category,author);
        fileDao.AddToFile("QuestionBank.dat", newQuestion.toString());
    }  
    
    public void findId(String id){
        FileDAO fd = new FileDAO();
        String str = fd.printFileContent("Contest_TimeStamp.txt");
        try
        {
           String contest = fd.subString(str, "Contest Id: " + id, "---"); 
           System.out.println("\n------------------\n" + contest);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Can not find this Id");
        }
    }
    
    // Sap xep theo Id
    public void sortProblemById() throws IOException {

        String[] lines = Files.readAllLines(new File("Questionbank.dat").toPath()).toArray(new String[0]);
            Arrays.sort(lines);

        FileWriter fw = new FileWriter("Questionbank.dat");
        BufferedWriter bw = new BufferedWriter(fw);

        try {            
            for (String line : lines) {
                bw.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("ERROR AT sortProblemById");
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
