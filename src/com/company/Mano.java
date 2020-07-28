package com.company;

public class Mano {

    Carta hand[] = new Carta[5];
    Vec valor = new Vec(6);




    public Mano(Carta c0, Carta c1, Carta c2, Carta c3, Carta c4){
        hand[0] = c0;
        hand[1] = c1;
        hand[2] = c2;
        hand[3] = c3;
        hand[4] = c4;
        //valor = Analizador.analizaMano(hand);
    }
}
