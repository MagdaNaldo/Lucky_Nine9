 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author Charisse Pineda 
 */
public class Registration {
    private String username;
    
    public Registration() {
        
        
        
    }
    
    public void userRegister()
    {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("please enter your desired user name:");
        String userName = sc.nextLine();

        System.out.println("UserName: " + userName);
    
    }

   

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

   
    
    
}
