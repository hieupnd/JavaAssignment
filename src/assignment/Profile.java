/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Phan Duc Hieu
 */
class Profile {
    public String username;
    public String password;
    public String coachId;
    public String coachName;
    public String email;
    public String mobilePhone;
    public String profileInfo="";
    public boolean checkUsername;
    public boolean checkPassword;
    
    
   
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
    
    public Profile(String username, String password) {
        //username va password duoc nhap boi nguoi dung trong main
        this.username = username;
        this.password = password;
    }
    //contructor trống dùng cho main gọi hàm
    public Profile() {
    }
    //constructor này không được dùng trong main  v                             
    //constructor này dùng để tách chuỗi profileInfo đã lấy được ở method readfile
    //Chuỗi profileInfor sẽ được tách ra thành từng phần id, name,... rồi gán vào biến 
    public Profile(String coachId, String coachName, String email, String mobilePhone) {
        this.coachId = coachId;
        this.coachName = coachName;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
     @Override
    public String toString() {
        return "Profile{" + "username=" + username + ", password=" + password + ", coachId=" + coachId + ", coachName=" + coachName + ", email=" + email + ", mobilePhone=" + mobilePhone + '}';
    }
    
    boolean checkUserName() {
        return checkUsername;
    }

    boolean checkPassword() {
        return checkPassword;
    }

   
    void generateNewId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeMobilePhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
