/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Scanner;
/**
 *
 * @author Phan Duc Hieu
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sn.nextLine();
        System.out.println("Password: ");
        String password = sn.nextLine();
        //Tao ham khoi tao chua username va password de check trong Profile.java
        //doi tuong info de check username and password
        Profile info = new Profile(username, password);
        //tao mot doi tuong rong de dung cac ham trong Profile.java
        Profile pro = new Profile();
        QuestionBank qs = new QuestionBank();
        if (info.checkUserName()){
            if (info.checkPassword()){
                System.out.println("Press 1 to change profile information");
                System.out.println("Press 2 to add new problem");
                System.out.println("Press 3 to Update information");
                System.out.println("Press 4 to View all problems");
                System.out.println("Press 5 to generate contest");
                System.out.println("Press 6 to print info of a contest by ContestId");
                System.out.println("Press 7 to sort problem");
                //System.out.println("Press 8 to save");
                String check = sn.nextLine();
                //tao cac option cho nguoi dung
                if (check.equals("1")){// tinh nang thay doi thong tin profile
                    System.out.println("Press 1 to change username");
                    System.out.println("Press 2 to change password");
                    System.out.println("Press 3 to generate new id");
                    System.out.println("Press 4 to change name");
                    System.out.println("Press 5 to change email");
                    System.out.println("Press 6 to change mobile phone");
                    String check1 = sn.nextLine();
                    //tu tao bien va viet method de lam, dau vao duoc nhap boi nguoi dung
                    if(check1.equals("1")){
                        //tao ra cac bien moi co gia tri bang gia tri nguoi dung nhap vao
                        //de luu tru new username
                        //cac truong hop khac cung tuong tu
                        pro.changeUsername();
                    }
                    else if (check.equals("2")){
                        pro.changePassword();
                    }
                    else if (check.equals("3")){
                        //luu y su dung ham tao id ngau nhien trong profile.java
                        pro.generateNewId();
                    }
                    else if (check.equals("4")){
                        pro.changeName();
                    }
                    else if (check.equals("5")){
                        pro.changeEmail();
                    }
                    else if (check.equals("6")){ 
                        pro.changeMobilePhone();
                    }
                    
                    
                }
                else if (check.equals("2")){//tinh nang them cau hoi vao question bank
                    
                    qs.addProblem();
                }
                else if (check.equals("3")){//tinh nang cap nhat thong tin cau hoi
                
                }
                else if (check.equals("4")){//tinh nang xem toan bo cau hoi co trong question bank
                
                }
                else if (check.equals("5")){//tinh nang tao bai kiem tra
                
                }
                else if (check.equals("6")){//tinh nang in bai kiem tra dua vao ma de 
                
                }
                else if (check.equals("7")){//tinh nang sap xep cau hoi theo thu tu giam dan dua tren ten cau hoi
                
                }
                //else if (check.equals("8")){
                
                //}
            }
        }
    }
    
}