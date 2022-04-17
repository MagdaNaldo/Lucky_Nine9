package ca.sheridancollege.project;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ken_C
 */
public class RegistrationValidator 
{

    /**
     * Main method cycles through our static utility methods
     * to determine whether the username is valid or not.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isValid=false;
        do
        {
            System.out.println("Please enter a valid username, username must have:");
            System.out.println("A length of at least 3");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            
            if (checkLength(username) && checkSpecialCharacter(username) && checkUpperCase(username))
            {
               isValid=true;
            }

        }while(!isValid);
        System.out.println("Valid username, accepted!");
    }
    
    /**
     * A method to check whether a username is at least length 3
     * @param user - the String to check
     * @return true if length is greater than or equals to 3 and false otherwise
     */
    public static boolean checkLength(String username)
    {
        if(username.length()>=3)
        {
            return true;
        }
        return false;
    }
    //this method is to iterate through length of username to check if there is at least a special character
    public static boolean checkSpecialCharacter(String username){
        
        for (char ch : username.toCharArray()) 
        {
            if (!Character.isLetterOrDigit(ch)) 
            {
                return true;
            }
        }
        return false;
    }
    //this method is to iterate through check length of username if there is at least an uppercase
    public static boolean checkUpperCase(String username){
        for (char ch : username.toCharArray()){
            if(Character.isUpperCase(ch)){
                return true;
            }
        }
        return false;
    }
}