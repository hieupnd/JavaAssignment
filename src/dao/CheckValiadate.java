/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author LOVE
 */
public class CheckValiadate {
     public boolean checkScore(double n) {
        
    if(0<=n && n<=10) {
        return true;
    } else {
        return false;
    }
 }
    public boolean checkEmptyString (String e){
    
         if ("".equals(e)) {
             return false;
         } else {
        return true;
    }
    
    }
    public boolean checkTypeQuestion (String q){
        if ( "sql".equals(q) || "cea".equals(q) ||"csi".equals(q) || "prf".equals(q) || "mae".equals(q)) {
        return true;
    } else {
        return false;
    }
    }
    
}
