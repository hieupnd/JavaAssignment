/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.FileNotFoundException;
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
    File myObj = new File("File/Profile.txt"); // Specify the filename
    //Lấy giá trị của file duois dạng một String
    public String fileContents = myObj.toString();
    
    
    public void OverwriteLine() throws FileNotFoundException, IOException {
      //Instantiating the File class
      String filePath = "D://input.txt";
      //Instantiating the Scanner class to read the file
      Scanner sc = new Scanner(new File(filePath));
      //instantiating the StringBuffer class
      StringBuffer buffer = new StringBuffer();
      //Reading lines of the file and appending them to StringBuffer
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      System.out.println("Contents of the file: "+fileContents);
      //closing the Scanner object
      sc.close();
      String oldLine = profileInfo;
      String newLine = toString();
      //Replacing the old line with new line
      fileContents = fileContents.replaceAll(oldLine, newLine);
      //instantiating the FileWriter class
      FileWriter writer = new FileWriter(filePath);
      System.out.println("");
      System.out.println("new data: "+fileContents);
      writer.append(fileContents);
      writer.flush();
    }
    
    
    
    public Profile(String username, String password) {
        //username va password duoc nhap boi nguoi dung trong main
        this.username = username;
        this.password = password;
    }
//    public String ReadFile() throws FileNotFoundException {
//        File myObj = new File("File/Profile.txt");
//        //dung Scanner de doc file
//        Scanner myReader = new Scanner(myObj);
//        
//        //viet thuat toan de tach tung dong trong file tai day
//        //moi dong trong file se chua thong tin cua mot coach
//        
//        //tim kiem username trong file
//        //--> nếu thấy thì tìm password ngay trong file đấy (quan trọng)
//        //--> nếu không thấy username -> gán giá trị biến checkUsername=false
//        //ngược lại thì checkUsername=true
//        //--> nếu không thấy password -> gán giá trị biến checkPassword=false
//        //ngược lại thì checkPassord=true
//        //Nếu cả password và username đều xuất hiện trên cùng một dòng trong file
//        //thì tách dòng đấy ra và gán giá trị biến profileInfo bằng giá trị dòng đấy
//        myReader.close();
//        //tra lai gia tri la 1 dong theo dang string
//        return profileInfo;
//      }
    //contructor trống dùng cho main gọi hàm
    public Profile() {
    }
    //constructor này không được dùng trong main
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
