/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import controller.DataColumn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author FUWTF
 */
@ManagedBean
@ViewScoped
public class ShowData {
    
     ArrayList<String> id ;
     ArrayList<String> firstname;
     ArrayList<String> lastname;
     ArrayList<String> email;
     ArrayList<String> phonenumber;
     ArrayList<String> salary;
    
    public static void main (String[] args) throws SQLException {
      
        DataColumn dcl = new DataColumn();
        dcl.CreateData("name", "a");
       System.out.println( dcl.getId().size());
      for(int i = 0 ; i < dcl.getId().size() ; i++){
            System.out.println(dcl.getId().get(i)+"  "+dcl.getFirstname().get(i)+"  "+dcl.getLastname().get(i)+"  "+
                    dcl.getLastname().get(i)+"  "+dcl.getPhonenumber().get(i)+"  "+dcl.getSalary().get(i));
        }
        
    }
}
