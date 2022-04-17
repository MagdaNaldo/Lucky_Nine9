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
public enum Value {
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(0), QUEEN(0), KING(0);
        
        private final int eqValue;
        
        public int getEqValue() {
            return eqValue;
        }
        
        private Value(int eqValue) {
            this.eqValue = eqValue;
        }
    }
