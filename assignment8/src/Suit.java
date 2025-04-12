/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misbahulhaque
 */


public enum Suit {    
    Clubs(1), Diamonds(2), Hearts(3), Spades(4);
    public int valueofsuit;
    Suit(int valueofsuit)
    {
        this.valueofsuit = valueofsuit;
    }
    public int getSuit()
    {
        return this.valueofsuit;
    }
}