/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAL.DangNhapDAL;

/**
 *
 * @author huyng
 */
public class DangNhapBUS {
     public static boolean checkLoginCredentials(String username, String password, String userType){
     return DangNhapDAL.checkLoginCredentials(username, password, userType);}
}
