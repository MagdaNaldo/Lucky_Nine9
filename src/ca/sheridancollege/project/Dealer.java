/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

/**
 * This class +++ Insert class description here +++
 *
 * @author Charisse Pineda 
 */
import java.util.Random;
import java.util.Scanner;

public class Dealer extends Player {
  
    int finalPSum;
    int finalDSum;
    int plSum;
    
    
    int player;
    int dealer;
    
    int playerScore = 0;
    int compScore = 0;
    int rounds;
  
    //stack of cards
    //shuffle cards
    //player gets two cards
    //dealer gets two cards
    //play round (while loops )
    
    @Override
    public void play() {
    /*    Scanner input = new Scanner(System.in);
        //PLAYER
        GroupOfCards[] deal = new GroupOfCards[2];
        
        Random random = new Random();
        
        for(int i=0; i<deal.length; i++) {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards grp = new GroupOfCards(eqval, val);
            deal[i] = grp;
        }
        
        System.out.println("Cards dealt for player: ");
        int pSum = 0;
        for(GroupOfCards g:deal) {
            System.out.println("Card: " + g.getValue() + " Value: " + g.getEqValue());
            pSum = pSum + g.getEqValue();
        }
        if(pSum > 9)
        {
            int plSum = pSum - 10;
            
            System.out.println("Sum for player is: " + plSum );
         
       
        }
        
     
        else
        {
           System.out.println("Sum for player is: " + pSum );
        }
            
        
        //DEALER
        for(int i=0; i<deal.length; i++) {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards grp = new GroupOfCards(eqval, val);
            deal[i] = grp;
        }
        
        System.out.println("\nCards dealt for dealer: ");
        int dSum = 0;
        for(GroupOfCards g:deal) 
        {
            System.out.println("Card: " + g.getValue() + " Value: " + g.getEqValue());
            dSum = dSum + g.getEqValue();
        }
        
        if(dSum > 9)
        {
            int dlSum = dSum - 10;
            System.out.println("Sum for player is: " + dlSum );
            
            
        }
        else
        {
           System.out.println("Sum for player is: " + dSum );
        }
        
        
        
        
        
        
         
        //STAND OR HIT for player
        System.out.println("\nStand or Hit? Press 1 for 'STAND' and 2 for 'HIT'.");
        int ans = input.nextInt();
        //STAND
        if(ans == 1 ) 
        {
            finalPSum = pSum;
            if(pSum > 9)
            {
            System.out.println("\nYour final value is: " +( pSum - 10));
            }
            
            else
             {
            System.out.println("\nYour final value is: " + pSum);
            }   
            
        }
        //HIT
        else {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards hit = new GroupOfCards(eqval, val);
            
            System.out.println("\nYour additional card is a " + hit.getValue() + " with a value of " + hit.getEqValue());
            finalPSum = pSum + hit.getEqValue();
            System.out.println("Your new sum is: " + finalPSum);
            
            if(finalPSum > 9)
            {
            System.out.println("\nYour final value is: " +( finalPSum - 10));
            }
            else
            {
            System.out.println("\nYour final value is: " + finalPSum );
            }
            
        }
        
        //STAND OR HIT for dealer
        Random comp = new Random();
        int dAns = comp.nextInt(2);
        int dAnsFinal = dAns + 1;
        
        
        System.out.println("\nDealer chose: " + dAnsFinal);
        
        if(dAnsFinal == 1) 
        {
            finalDSum = dSum;
            if(finalDSum > 9)
            {
            System.out.println("\nYour final value is: " +( finalDSum - 10));
            }
            
            else
             {
            System.out.println("\nYour final value is: " + finalDSum);
            } 
        }
        else {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards hit = new GroupOfCards(eqval, val);
            
            System.out.println("\nThe dealer's additional card is a " + hit.getValue() + " with a value of " + hit.getEqValue());
             finalDSum = dSum + hit.getEqValue();
            System.out.println("Dealer's new sum is: " + finalDSum );
            
             if(finalDSum > 9)
            {
            System.out.println("\nYour final value is: " +( finalDSum - 10));
            }
            else
            {
            System.out.println("\nYour final value is: " + finalDSum );
            }
        }
        
        //WINNER 
       
         //if the sum is over 9
            if(finalPSum > 9)
            {
                player = finalPSum - 10;
                System.out.println("\nFinal Player sum is: " + player);
            }
        //if the sum is less than 9
            else if(finalPSum < 9) 
            {
                player = finalPSum;
                System.out.println("\nFinal Player sum is: " + player);
            }

        //if the sum is over 9 
            if(finalDSum > 9)
            {
                dealer = finalDSum - 10;
                System.out.println("Final Dealer sum is: " + dealer);
            }
        //if the sum is less than 9
            else if(finalDSum < 9) 
            {
                dealer = finalDSum;
                System.out.println("Final Dealer sum is " + dealer);
            }
            
            //if Hit new sum > 9
            if(player > 9)
            {
                player = player -10;
            }
            else {
                player = player;
            }
            
            if(dealer > 9) 
            {
                dealer = dealer - 10;
            }
            else 
            {
                dealer = dealer;
            }
            
        //to determine the final winner
        playerScore = 0;
        compScore = 0;
             
        //checking the winner 
        
        if( finalPSum > finalDSum) 
        {
            System.out.println("\nPlayer won this round!");
            playerScore++;
           
        }
        else if(finalDSum > finalPSum) 
        {
            System.out.println("\nDealer won this round!");
            compScore++;
        }
        else 
        {
            System.out.println("\n Player and Dealer is draw .");
        }    
        
           
        
    }
    */

    /**
     *
     */
    
    }
    
    public void UserScore()
    {
       //if the sum is over 9
           Scanner input = new Scanner(System.in);
        //PLAYER
        GroupOfCards[] deal = new GroupOfCards[2];
        
        Random random = new Random();
        
        Scanner askRounds = new Scanner(System.in);
        System.out.println("How many rounds? ");
        rounds = askRounds.nextInt();
        
        int j = 0;//counter
        while (j < rounds){
        for(int i=0; i<deal.length; i++) {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards grp = new GroupOfCards(eqval, val);
            deal[i] = grp;
        }
        
        System.out.println("Cards dealt for player: ");
        int pSum = 0;
        for(GroupOfCards g:deal) {
            System.out.println("Card: " + g.getValue() + " Value: " + g.getEqValue());
            pSum = pSum + g.getEqValue();
        }
        if(pSum > 9)
        {
            int plSum = pSum - 10;
            
            System.out.println("Sum for player is: " + plSum );
        }
        else
        {
           System.out.println("Sum for player is: " + pSum );
        }

        //DEALER
        for(int i=0; i<deal.length; i++) {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards grp = new GroupOfCards(eqval, val);
            deal[i] = grp;
        }
        
        System.out.println("\nCards dealt for dealer: ");
        int dSum = 0;
        for(GroupOfCards g:deal) 
        {
            System.out.println("Card: " + g.getValue() + " Value: " + g.getEqValue());
            dSum = dSum + g.getEqValue();
        }
        
        if(dSum > 9)
        {
            int dlSum = dSum - 10;
            System.out.println("Sum for dealer is: " + dlSum );
        }
        else
        {
           System.out.println("Sum for dealer is: " + dSum );
        }
         
        //STAND OR HIT for player
        System.out.println("\nStand or Hit? Press 1 for 'STAND' and 2 for 'HIT'.");
        int ans = input.nextInt();
        //STAND
        if(ans == 1 ) 
        {
            finalPSum = pSum;
            if(finalPSum > 9)
            {
            System.out.println("\nYour final value is: " +( finalPSum - 10));
            }
            
            else
             {
            System.out.println("\nYour final value is: " + finalPSum);
            }   
            
        }
        //HIT
        else 
        {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards hit = new GroupOfCards(eqval, val);
            
            System.out.println("\nYour additional card is a " + hit.getValue() + " with a value of " + hit.getEqValue());
            finalPSum = pSum + hit.getEqValue();
            System.out.println("Your new sum is: " + finalPSum);
            
            if(finalPSum > 9)
            {
            System.out.println("\nYour final value is: " +( finalPSum - 10));
            }
            else
            {
            System.out.println("\nYour final value is: " + finalPSum );
            }
            
        }
        
        //STAND OR HIT for dealer
        Random comp = new Random();
        int dAns = comp.nextInt(2);
        int dAnsFinal = dAns + 1;
        
        System.out.println("\nDealer chose: " + dAnsFinal);
        
        if(dAnsFinal == 1) 
        {
            finalDSum = dSum;
            if(finalDSum > 9)
            {
            System.out.println("\nDealer's final value is: " +( finalDSum - 10));
            }

            else
             {
            System.out.println("\nDealer's final value is: " + finalDSum);
            } 
        }
        else {
            Value eqval = Value.values()[random.nextInt(13)];
            Value val = Value.values()[random.nextInt(13)];
            GroupOfCards hit = new GroupOfCards(eqval, val);
            
            System.out.println("\nThe dealer's additional card is a " + hit.getValue() + " with a value of " + hit.getEqValue());
             finalDSum = dSum + hit.getEqValue();
            System.out.println("Dealer's new sum is: " + finalDSum );
            
             if(finalDSum > 9)
            {
            System.out.println("\nDealer's final value is: " +( finalDSum - 10));
            }
            else
            {
            System.out.println("\nDealer's final value is: " + finalDSum );
            }
        }
        
        //WINNER 

         //if the sum is over 9
            if(finalPSum > 9)
            {
                player = finalPSum - 10;
                System.out.println("\nFinal Player sum is: " + player);
            }
        //if the sum is less than 9
            else if(finalPSum < 9) 
            {
                player = finalPSum;
                System.out.println("\nFinal Player sum is: " + player);
            }

        //if the sum is over 9 
            if(finalDSum > 9)
            {
                dealer = finalDSum - 10;
                System.out.println("Final Dealer sum is: " + dealer);
            }
        //if the sum is less than 9
            else if(finalDSum < 9) 
            {
                dealer = finalDSum;
                System.out.println("Final Dealer sum is " + dealer);
            }
            
            //if Hit new sum > 9
            if(player > 9)
            {
                player = player -10;
            }
            else {
                player = player;
            }
            
            if(dealer > 9) 
            {
                dealer = dealer - 10;
            }
            else 
            {
                dealer = dealer;
            }
            
        //to determine the final winner
      // playerScore = 0;
       // compScore = 0;
             
        //checking the winner 
        
        if(player > dealer) 
        {
            System.out.println("\nPlayer won this round!");
             playerScore++;
            System.out.printf("Player score vs Computer Score is: %d %d\n",playerScore, compScore);
            
        }
        else if(player < dealer) 
        {
            System.out.println("\nDealer won this round!");
            compScore++;
            System.out.printf("Player score vs Computer Score is: %d %d\n",playerScore, compScore);
        }
        else if (dealer == player)
        {
            System.out.printf("\n Player and Dealer is draw. Player score vs Computer Score is: %d %d\n",playerScore, compScore);
        }
        j++; //counter
        } 
    }

    public int getPlayerScore()
    {
        return this.playerScore;   
    }
    
     public int getCompScore()
    {
        return this.compScore;   
    }
     
     
}
