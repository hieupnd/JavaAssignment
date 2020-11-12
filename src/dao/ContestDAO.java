/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import model.Profile;

/**
 *
 * @author Phan Duc Hieu
 */
public class ContestDAO {
    void contest(){
        Random rand = new Random();
        Profile pro = new Profile();
        String contestId = "ID" + rand.nextInt(100000);
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        String dateOfCreation = day + "/" + month + "/" + year;
        String author = pro.getUsername();
        String contest = "";
        
        try{
            FileReader fr = new FileReader("Questionbank.dat");
            BufferedReader br = new BufferedReader(fr);
            
            String id = "";
            String desc = "";
            String mark = "";
            String questions = "";
            String str;
            int i=0;
            while((str = br.readLine()) != null){
                if(rand.nextInt(3)==1){
                    StringTokenizer st = new StringTokenizer(str);
                    while (st.hasMoreTokens()) {
                        st.nextToken("=");
                        st.nextToken(" ");
                        id = st.nextToken(",");
                        st.nextToken(",");
                        st.nextToken(",");
                        st.nextToken(",");
                        st.nextToken("=");
                        st.nextToken(" ");
                        desc = st.nextToken(",");
                        st.nextToken("=");
                        st.nextToken(" ");
                        mark = st.nextToken(",");
                        st.nextToken("}");
                    }
                    questions = questions + "Question " + (i+1) + " (" + id + "," + mark + " point)" + ": " + desc + "\n";
                    i++;
                }
                if(i>=5){
                    break;
                }
            }
            br.close();
            contest = "Contest Id: " + contestId + "\n" + "Date of creation: " + dateOfCreation + "\n" + "Author: " + author + "\n\n" + questions + "\n------------------------------";
            System.out.println(contest);
        } 
        catch(IOException ex) {
            System.out.println("ERROR AT ContestDAO!");            
        }
        
        System.out.println("Do you want to save this contest: [1]yes [0]no");
        Scanner input = new Scanner(System.in);
        if("1".equals(input.nextLine())){
            FileDAO fd = new FileDAO();
            fd.AddToFile("Contest_TimeStamp.txt", contest);
        }
        
    }
}
