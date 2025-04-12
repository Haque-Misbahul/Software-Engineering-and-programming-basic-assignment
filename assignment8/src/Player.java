/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misbahulhaque
 */
public class Player {

    /**
     * @param args the command line arguments
     */
    public Card[] hand = new Card[52];
    public int handsize;
    public Card[] getHand()
    {
        return this.hand;
    }
    public void sortHand()
    {
    
    
     
       for(int i = 0; i<handsize; i++)
        {
            for(int j = i+1; j<handsize; j++)
            {
                if(hand[i].suit.valueofsuit > hand[j].suit.valueofsuit )
                {
                     Card temp = hand[i];
                     hand[i] = hand[j];
                     hand[j] = temp;
                }
            }
        }
        int club = 0, diamond = 0, hearts = 0, spade = 0;
        for(int i = 0; i<handsize; i++)
        {
            if(hand[i].suit.valueofsuit == 1)
            {
                club++;
            }
            if(hand[i].suit.valueofsuit == 2)
            {
                diamond++;
            }
            if(hand[i].suit.valueofsuit == 3)
            {
                hearts++;
            }
            if(hand[i].suit.valueofsuit == 4)
            {
                spade++;
            }
        }
        for(int i = 0; i<club; i++)
        {
            for(int j = i+1; j<club; j++)
            {
                if(hand[i].rank.valueofrank > hand[j].rank.valueofrank )
                {
                     Card temp = hand[i];
                     hand[i] = hand[j];
                     hand[j] = temp;
                }
            }
        }
        diamond = club + diamond;
        for(int i = club; i<diamond; i++)
        {
            for(int j = i+1; j<diamond; j++)
            {
                if(hand[i].rank.valueofrank > hand[j].rank.valueofrank )
                {
                     Card temp = hand[i];
                     hand[i] = hand[j];
                     hand[j] = temp;
                }
            }
        }
        hearts = hearts + diamond;
        for(int i = diamond; i<hearts; i++)
        {
            for(int j = i+1; j<hearts; j++)
            {
                if(hand[i].rank.valueofrank > hand[j].rank.valueofrank )
                {
                     Card temp = hand[i];
                     hand[i] = hand[j];
                     hand[j] = temp;
                }
            }
        }
        spade = spade + hearts;
        for(int i = spade; i<spade; i++)
        {
            for(int j = i+1; j<spade; j++)
            {
                if(hand[i].rank.valueofrank > hand[j].rank.valueofrank )
                {
                     Card temp = hand[i];
                     hand[i] = hand[j];
                     hand[j] = temp;
                }
            }
        }
     

     
        
        
    }
    
 
    
}
