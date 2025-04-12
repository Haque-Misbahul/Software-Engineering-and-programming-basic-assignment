/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misbahulhaque
 */
    public enum Rank {
    Ace(1), Deuce(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);
    
    public int valueofrank;
    Rank(int valueofrank)
    {
        this.valueofrank = valueofrank;
    }
    public int getRank()
    {
        return this.valueofrank;
    }
    
    
    }
