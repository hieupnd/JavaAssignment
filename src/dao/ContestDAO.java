/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.Profile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Phan Duc Hieu
 */
public class ContestDAO {
    public void contest(String coachName){
        Random rand = new Random();
        
        String contestId = "ID" + rand.nextInt(100000);
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        String dateOfCreation = day + "/" + month + "/" + year;
        String author = coachName;
        String contest = "";
        
        try{
            FileReader fr = new FileReader("Questionbank.dat");
            BufferedReader br = new BufferedReader(fr);
            
            String id = "";
            String name = "";
            String QAuthor = "";
            String desc = "";
            String mark = "";
            String category = "";
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
                        st.nextToken("=");
                        st.nextToken(" ");
                        name = st.nextToken(",");
                        st.nextToken(",");
                        st.nextToken("=");
                        st.nextToken(" ");
                        desc = st.nextToken(",");
                        st.nextToken("=");
                        st.nextToken(" ");
                        mark = st.nextToken(",");
                        st.nextToken("=");
                        st.nextToken(" ");
                        category = st.nextToken(",");
                        st.nextToken("=");
                        st.nextToken(" ");
                        QAuthor = st.nextToken(",");
                    }
                    questions = questions + "Question " + (i+1) + " (" + id + "," + mark + " point)" + ": " + name + ".\nAuthor: " + QAuthor + ".\nCategory: " + category + ".\n\n" + desc + ".\n\n";
                    i++;
                }
                if(i>=5){
                    break;
                }
            }
            br.close();
            contest = "Contest Id: " + contestId + ".\n" + "Date of creation: " + dateOfCreation + ".\n" + "Author: " + author + ".\n\n" + questions + ".\n------------------------------";
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
    public void findContest(String contestId){
        FileDAO fileDao = new FileDAO();
        String content = fileDao.readToFile("Contest_TimeStamp.txt");
        System.out.println(content);
        if (content.contains(contestId)){
            char j;
            for(int i = content.indexOf(contestId); i<=content.indexOf("------------------------------");i++){
                j=content.charAt(i);
                if (j == '.'){
                    System.out.println(j);
                    System.out.println("\n");
                }
                else{
                    System.out.println(j);
                }
            }
        }
    }
}
