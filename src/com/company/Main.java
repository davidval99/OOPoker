package com.company;

public class Main {

    public static void main(String[] args) {

       Deal();
        }




    public static void Deal(){


        /*
        Mazo m = new Mazo();
        int cantJugadores = 2;
        for(int i=0;i<cantJugadores;i++){
            Mano m1 = new Mano(m.deck.get(i),m.deck.get(i+1),m.deck.get(i+2),m.deck.get(i+3),m.deck.get(i+4));

        }
        Mano m1 = new Mano(m.deck.get(0),m.deck.get(1),m.deck.get(1),m.deck.get(1),m.deck.get(1));*/

        Jugador j1 = new Jugador("David");
        Jugador j2 = new Jugador("Pedro");

        Texas thld = new Texas(j1,j2);
        thld.Deal();

        for(int i=0;i<2;i++){
            System.out.println("Numero de carta de " +j1.cartasEnMano.get(i).numero);
            System.out.println("Palo j1 " +j1.cartasEnMano.get(i).palo);

            System.out.println("Numero j2 "  +j2.cartasEnMano.get(i).numero);
            System.out.println("Palo j2 " +j2.cartasEnMano.get(i).palo);

        }


    }
}
