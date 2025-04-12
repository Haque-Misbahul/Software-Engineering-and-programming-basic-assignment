/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misbahulhaque
 */
public class Card {
    public Suit suit;
    public Rank rank;
    public Card(Suit suit, Rank rank)
    {
         this.suit= suit;
         this.rank= rank;
    }
    public Suit getSuit()
    {
        return this.suit;
    }
    public Rank getRank()
    {
        return this.rank;
    }
    
    
}
