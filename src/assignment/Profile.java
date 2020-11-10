/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



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
    public void file()
    {
        try
        {
            // Creating new Text file
               File file = new File("Profile.dat");
//              if (!file.exists())
//                {
//                file.createNewFile();
//                System.out.println("File created Successfully.");
//                }
                FileOutputStream fout=new FileOutputStream("Profile.dat");
                // Writing to new Text file
                String s="Cong hoa xa hoi chu nghia Viet Nam";
                byte b[]=s.getBytes();
                fout.write(b);
                fout.close();
                System.out.println("Writing Complete!");
                FileInputStream fin = new FileInputStream("Profile.dat");
                
                //Reading from Text file
                int i;
                while((i=fin.read())!=-1)
                {
                    System.out.print((char)i);
                }
                fin.close();
                fout=new FileOutputStream("Profile.dat");
                // Modifying Text file
                s="Doc lap-tu do-hanh phuc sighskdfghksgdfsgsdfg";
                b=s.getBytes();
                fout.write(b);
                fout.close();
                System.out.println("\n Modification Complete!");
                fin = new FileInputStream("Profile.dat");
                //Reading from Text file
                while((i=fin.read())!=-1)
                {
                System.out.print((char)i);
                }
                fin.close();
                }
                    
                catch (IOException e)
                {
                    System.out.println("I/O Exception occurred.");
                }
        }   
    public void WriteToFile(String s){
        try{
            File file = new File("Profile.dat");
            FileOutputStream fout=new FileOutputStream("Profile.dat");
        }
        catch (IOException e)
        {
            System.out.println("I/O exception");
        }
    }
    public void ModifyFile(){
        
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

    void changeUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changePassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
