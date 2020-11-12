/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import model.Profile;

/**
 *
 * @author Phan Duc Hieu
 */
public class ProfileDAO {

    // tach dong
    public String[] seperateLines() throws IOException {
        {
            String[] lines = Files.readAllLines(new File("Profile.dat").toPath()).toArray(new String[0]);
            return lines;
        }
    }
    
    // kiem tra username va password
    public boolean checkInfor(Profile info) throws IOException {
        for (String line : seperateLines()) {
            String[] parameter = line.split(", ", 3);
            if (parameter[0].equals(info.getUsername()) || parameter[1].equals(info.getPassword())) {
                return true;
            }
        }
        return false;
    }
}