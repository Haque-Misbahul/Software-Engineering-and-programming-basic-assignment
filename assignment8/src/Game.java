/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misbahulhaque
 */

public class Game {
    
    public Card deck[] = new Card[52];
    public Player players[] = new Player[4];
    public int size;
   
    Game(Player[] players)
    {
        int size = players.length;
        this.size = size;
        int total = 52;
        if(size==3)
        {
            total --;
        }
        total = total / size;
        for(int i = 0; i<size; i++)
        {
            this.players[i] = players[i];
            this.players[i].handsize = total;
        }
        int i = 0;
        for (Suit s : Suit.values()) {
          for (Rank r : Rank.values()) {
            deck[i]= new Card(s,r);
            i++;  // increment i here
          }
        }
    }
    public void deal()
    {
        
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        if(size==3)
        {
            int pos = -1;
            for(int i = 0; i<52; i++)
            {
                if(deck[i].suit==Suit.Clubs && deck[i].rank==Rank.Deuce)
                {
                    pos = i;
                    break;
                }
            }
            if(pos!=51)
            {
               Card temp = deck[pos];
               deck[pos] = deck[51];
               deck[51] = temp;
            }
            int start = 0;
            int cnst = 51/size;
            int dist = cnst;
            for(int i = 0; i<size; i++)
            {
                int cnt = 0 ;
                for(int j = start; j<dist; j++)
                {
                    this.players[i].hand[cnt] = deck[j];
                    cnt++;
                }
                start = dist;
                dist = cnst * (i+2);
            }
           
            
        }
        else
        {
            int start = 0;
            int cnst = 52/size;
            int dist = cnst;
            for(int i = 0; i<size; i++)
            {
                int cnt = 0 ;
                for(int j = start; j<dist; j++)
                {
                    this.players[i].hand[cnt] = deck[j];
                   
                    cnt++;
                }
                start = dist;
                dist = cnst * (i+2);
            }
         
            
        }
        
    }
    public void reset()
    {
        for(int i = 0; i<size; i++)
        {
            this.players[i].hand = null;
        }
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }
    public void displayDeck()
    {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].rank+ " of " + deck[i].suit);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        Player Player1 = new Player();
        Player Player2 = new Player();
        Player arr[] = {Player1, Player2};
        Game game = new Game(arr);
       
        game.deal();
       
        Player1.sortHand();
        game.displayDeck();
        //game.displayDeck();
        
    }

}
