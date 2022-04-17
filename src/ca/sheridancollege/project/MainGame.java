/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *This class +++ Insert class description here +++
 * 
 *@author Charisse Pineda
 */
public class MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
      Registration user = new Registration(); 
      user.userRegister();
   
      Dealer trial = new Dealer(); 
      trial.play();
      
      Dealer score = new Dealer();
      score.UserScore();
      
     
      
      
    }

}
