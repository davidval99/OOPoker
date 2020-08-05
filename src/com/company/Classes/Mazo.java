package com.company.Classes;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo{

    public ArrayList<Carta> deck;
    private int actual;
    
    public Mazo(){
        this(true);
    }
    
    public Mazo(boolean barajado){
        actual = 0;
        deck = new ArrayList();
        for(int i = 0; i<52; i++)

            deck.add(new Carta(i));
        if(barajado)
            Collections.shuffle(deck);
    }
    
    public Carta next(){
        if(!isEmpty())
            return deck.get(actual++);
        return null;
    }
    
    public boolean isEmpty(){
        return actual == 52;
    }

}
