/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//hello
//thang da o day

package assignment;
import dao.ContestDAO;
import dao.FileDAO;
import dao.ProfileDAO;
import dao.QuestionBankDAO;
import model.*;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Phan Duc Hieu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        // chi da o day
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
        FileDAO fileDao = new FileDAO();
        ProfileDAO proDAO = new ProfileDAO();
        QuestionBank qs = new QuestionBank();
        QuestionBankDAO queDao = new QuestionBankDAO();
        ContestDAO conDao = new ContestDAO();
        //gọi thử hàm sửa nội dung file trong class Profile
        //Thay đổi toàn bộ ký tự g trong file thành số 1
       
        //fileDao.AddToFile("QuestionBank.dat", "pham thai ha");
        
        //System.out.println(fileDao.readToFile("Profile.dat"));
        //System.out.println(fileDao.readToFile("Questionbank.dat"));
        
        if (proDAO.checkInfor(info)){
                System.out.println("Login succesfully");
                System.out.println("Press 1 to change profile information");
                System.out.println("Press 2 to add new problem");
                System.out.println("Press 3 to View all problems");
                System.out.println("Press 4 to generate contest");
                System.out.println("Press 5 to print info of a contest by ContestId");
                System.out.println("Press 6 to sort problem");
                //System.out.println("Press 8 to save");
                String check = sn.nextLine();
                //tao cac option cho nguoi dung
                if (check.equals("1")){// tinh nang thay doi thong tin profile
                    System.out.println("Press 1 to change password");
                    System.out.println("Press 2 to generate new id");
                    System.out.println("Press 3 to change name");
                    System.out.println("Press 4 to change email");
                    System.out.println("Press 5 to change mobile phone");
                    String check1 = sn.nextLine();
                    //tu tao bien va viet method de lam, dau vao duoc nhap boi nguoi dung
                    if(check1.equals("1")){
                        //tao ra cac bien moi co gia tri bang gia tri nguoi dung nhap vao
                        //de luu tru new username
                        //cac truong hop khac cung tuong tu
                        System.out.println("Input new password: ");
                        String newPassword = sn.nextLine();
                        info.setPassword(newPassword);
                        System.out.println("Change successfully");
                    }
                    else if (check1.equals("2")){
                        info.setCoachId();
                        System.out.println("New id: " + info.getCoachId());
                    }
                    else if (check1.equals("3")){
                        System.out.println("Input new name: ");
                        String newName = sn.nextLine();
                        info.setCoachName(newName);
                        System.out.println("Change successfully");
                    }
                    else if (check1.equals("4")){
                        System.out.println("Input new email: ");
                        String newEmail = sn.nextLine();
                        info.setEmail(newEmail);
                        System.out.println("Change successfully");
                    }
                    else if (check1.equals("5")){
                        System.out.println("Input new mobile phone: ");
                        String newMobilePhone = sn.nextLine();
                        info.setMobilePhone(newMobilePhone);
                        System.out.println("Change successfully");
                    }
                }
                else if (check.equals("2")){
                    queDao.problem();
                    System.out.println("Success");
                }
                else if (check.equals("3")){
                    System.out.println(fileDao.readToFile("QuestionBank.dat"));
                }

                else if (check.equals("4")){//tinh nang tao bai kiem tra
                    conDao.contest(info.coachName);
                    System.out.println("Generate new contest successfully");
                }
                else if (check.equals("5")){
                    System.out.println("Input contest id: ");
                        
                }
                else if (check.equals("6")){
                    
                }
                //else if (check.equals("8")){
                
                //}
            
            }
        }
    }

