/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;



/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {
    
   private Value eqval;
   private Value value;
   
   
   public GroupOfCards() {
       
   }
   
   public GroupOfCards(Value eqval, Value value) {
       this.value = value;
       this.eqval = eqval;
   }
   /*
   public Suit getSuit() {
       return suit;
   }
   
   public void setSuit(Suit suit) {
       this.suit = suit;
   }
    */
   public int getEqValue() {
       return value.getEqValue();
   }
   
   public Value getValue() {
       return value;
   }
  
   
   public void setValue(Value value) {
       this.value = value;
   }
    
    
           
    
    
    
    
    
    
    
    /*
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     
    public void setSize(int size) {
        this.size = size;
    }
    */
}//end class
