/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import dao.CheckValiadate;
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // chi da o day

        System.out.println("-:-:-:-:-[CONTEST MANAGEMENT SYSTEM]-:-:-:-:-");
        System.out.println("        *****Develop by G7 group*****");
        Scanner sn = new Scanner(System.in);
        System.out.println("Please login");
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
        CheckValiadate checkValid = new CheckValiadate();
        //gọi thử hàm sửa nội dung file trong class Profile
        //fileDao.AddToFile("QuestionBank.dat", "pham thai ha");
        //System.out.println(fileDao.readToFile("Profile.dat"));
        //System.out.println(fileDao.readToFile("Questionbank.dat"));
        while (!proDAO.checkInfor(info)) {
            System.out.println("Wrong username or password. Please input again");
            System.out.println("Username: ");
            username = sn.nextLine();
            info.setUsername(username);
            System.out.println("Password: ");
            password = sn.nextLine();
            info.setPassword(password);
        }
        if (proDAO.checkInfor(info)) {
            System.out.println("Login succesfully");
            System.out.println("=====MAIN MENU=====");
            System.out.println("Press 1 to change profile information");
            System.out.println("Press 2 to add new problem");
            System.out.println("Press 3 to View all problems");
            System.out.println("Press 4 to generate contest");
            System.out.println("Press 5 to print info of a contest by ContestId");
            System.out.println("Press 6 to sort problem");
            System.out.println("Press 7 to exit");
            //System.out.println("Press 8 to save");
            String check = sn.nextLine();
            while (!check.equals("7")) {
                //tao cac option cho nguoi dung
                if (check.equals("1")) {// tinh nang thay doi thong tin profile
                    System.out.println(proDAO.oldString(info));
                    System.out.println("=====PROFILE=====");
                    System.out.println("Press 1 to change password");
                    System.out.println("Press 2 to generate new id");
                    System.out.println("Press 3 to change name");
                    System.out.println("Press 4 to change email");
                    System.out.println("Press 5 to change mobile phone");
                    System.out.println("Press 6 to back to main menu");
                    String check1 = sn.nextLine();
                    while (!check1.equals("6")) {
                        //tu tao bien va viet method de lam, dau vao duoc nhap boi nguoi dung
                        String oldStr = proDAO.oldString(info);
                        if (check1.equals("1")) {
                            //tao ra cac bien moi co gia tri bang gia tri nguoi dung nhap vao
                            //de luu tru new username
                            //cac truong hop khac cung tuong 
                            System.out.println("Password must have at least 8 character and no special character");
                            System.out.println("Input new password: ");
                            String newPassword = sn.nextLine();
                            while (!checkValid.checkEmptyString(newPassword) || !checkValid.checkPassword(newPassword)) {
                                System.out.println("Password must have at least 8 character and no special character");
                                System.out.println("New password is not valid. Please input again: ");
                                newPassword = sn.nextLine();
                            }
                            info.setPassword(newPassword);
                            fileDao.modifyFile("Profile.dat", oldStr, proDAO.newString(info));
                            System.out.println("Change successfully");
                        } else if (check1.equals("2")) {
                            info.setCoachId();
                            fileDao.modifyFile("Profile.dat", oldStr, proDAO.newString(info));
                            System.out.println("New id: " + info.getCoachId());
                        } else if (check1.equals("3")) {
                            System.out.println("Input new name: ");
                            String newName = sn.nextLine();
                            while (!checkValid.checkEmptyString(newName)) {
                                System.out.println("New name is not valid. Please input again: ");
                                newName = sn.nextLine();
                            }
                            info.setCoachName(newName);
                            fileDao.modifyFile("Profile.dat", oldStr, proDAO.newString(info));
                            System.out.println("Change successfully");
                        } else if (check1.equals("4")) {
                            System.out.println("Input new email: ");
                            String newEmail = sn.nextLine();
                            while (!checkValid.checkEmptyString(newEmail) || !checkValid.checkEmail(newEmail)) {
                                System.out.println("New Email is not valid. Please input again: ");
                                newEmail = sn.nextLine();
                            }
                            info.setEmail(newEmail);
                            fileDao.modifyFile("Profile.dat", oldStr, proDAO.newString(info));
                            System.out.println("Change successfully");
                        } else if (check1.equals("5")) {
                            System.out.println("Input new mobile phone: ");
                            String newMobilePhone = sn.nextLine();
                            while (!checkValid.checkEmptyString(newMobilePhone) || !checkValid.checkPhoneNumber(newMobilePhone)) {
                                System.out.println("New mobile phone is not valid. Please input again: ");
                                newMobilePhone = sn.nextLine();
                            }
                            info.setMobilePhone(newMobilePhone);
                            fileDao.modifyFile("Profile.dat", oldStr, proDAO.newString(info));
                            System.out.println("Change successfully");
                        }
                        System.out.println("=====PROFILE=====");
                        System.out.println("Press 1 to change password");
                        System.out.println("Press 2 to generate new id");
                        System.out.println("Press 3 to change name");
                        System.out.println("Press 4 to change email");
                        System.out.println("Press 5 to change mobile phone");
                        System.out.println("Press 6 to back to main menu");
                        check1 = sn.nextLine();
                    }

                } else if (check.equals("2")) {
                    String check2 = "1";
                    while (!check2.equals("2")) {
                        System.out.println("=====ADD PROBLEMS=====");
                        queDao.problem(info.coachName);
                        System.out.println("Press 1 to continue adding problem");
                        System.out.println("Press 2 to back to main menu");
                        check2 = sn.nextLine();
                        System.out.println("Success");
                    }
                } else if (check.equals("3")) {
                    System.out.println(fileDao.printFileContent("QuestionBank.dat"));
                } else if (check.equals("4")) {//tinh nang tao bai kiem tra
                    String check3 = "1";
                    while (!check3.equals("2")) {
                        System.out.println("=====GENERATE CONTEST=====");
                        conDao.contest(info.coachName);
                        System.out.println("Generate new contest successfully");
                        System.out.println("Press 1 to continue generating contest");
                        System.out.println("Press 2 to back to main menu");
                        check3 = sn.nextLine();
                        System.out.println("Success");
                    }
                } else if (check.equals("5")) {
                    String check4 = "1";
                    while (!check4.equals("2")) {
                        System.out.println("=====PRINT CONTEST BY ID=====");
                        System.out.println("Input contest id: ");
                        queDao.findId(sn.nextLine());
                        System.out.println("Generate new contest successfully");
                        System.out.println("Press 1 to print other contest");
                        System.out.println("Press 2 to back to main menu");
                        check4 = sn.nextLine();
                        System.out.println("Success");
                    }
                } else if (check.equals("6")) {  
                    queDao.sortProblemById();
                    System.out.println("Soft list after sort: ");
                    System.out.println(fileDao.readToFile("Questionbank.dat"));
                }
                //else if (check.equals("8")){

                //}
                System.out.println("=====MAIN MENU=====");
                System.out.println("Press 1 to change profile information");
                System.out.println("Press 2 to add new problem");
                System.out.println("Press 3 to View all problems");
                System.out.println("Press 4 to generate contest");
                System.out.println("Press 5 to print info of a contest by ContestId");
                System.out.println("Press 6 to sort problem");
                System.out.println("Press 7 to exit");
                //System.out.println("Press 8 to save");
                check = sn.nextLine();

            }
        }
    }
}
