/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Phan Duc Hieu
 */
public class FileDAO {
    
    // Chỉnh sửa
    public void modifyFile(String filePath, String oldString, String newString){
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        //System.out.println("done");
    }
    
    // Đọc File
    public String readToFile(String filename) {
        String fileContent = "";

        try {
            FileReader file = new FileReader(filename);
            BufferedReader fileStream = new BufferedReader(file);

            String temp = fileStream.readLine();
            while (temp != null) {
                fileContent = fileContent + " " + temp;
                temp = fileStream.readLine();

            }
            fileStream.close();

        } catch (FileNotFoundException e) {

            System.out.println("No file was read");
        } catch (IOException e) {
            System.out.println("There was a problem reading the file");
        }
        return fileContent;
    }
    
    // Thêm đối tượng
    public void AddToFile(String filename, String content){
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
            String myString = "";
            String str;
            while((str = br.readLine()) != null){
                myString = myString + str + "\n";
            }
            br.close();
            
            PrintWriter pw = new PrintWriter(filename);
            myString = myString + content;
            pw.println(myString);
            pw.close();           
        } 
        catch(IOException ex) {
            System.out.println("ERROR AT AddToFile");            
        }
    }
    public String printFileContent(String filename){
        String myString = "";
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
            String str;
            while((str = br.readLine()) != null){
                myString = myString + str + "\n";
            }
            br.close();
            }
        catch(IOException ex) {
            System.out.println("ERROR AT printFileContent");
        }
        return myString;
    }
    public String subString(String stringLine, String begin, String end){
        int beginIndex = stringLine.indexOf(begin);
        String backstr = stringLine.substring(beginIndex);
        int endIndex = backstr.indexOf(end);
        String substr = backstr.substring(0, endIndex);
        return substr;
    }
}
