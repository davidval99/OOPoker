package com.company.Classes;

import static com.company.Classes.Combinaciones.combinations2;

public class Main {

    public static void main(String[] args) {

        Mazo m = new Mazo();

        System.out.println("Estas son todas las cartas del jugador disponibles");
        System.out.println(m.deck.get(0).numero+ "  "+ m.deck.get(0).palo);
        System.out.println(m.deck.get(1).numero+ "  "+ m.deck.get(1).palo);
        System.out.println(m.deck.get(2).numero+ "  "+ m.deck.get(2).palo);
        System.out.println(m.deck.get(3).numero+ "  "+ m.deck.get(3).palo);
        System.out.println(m.deck.get(4).numero+ "  "+ m.deck.get(4).palo);
        System.out.println(m.deck.get(5).numero+ "  "+ m.deck.get(5).palo);
        System.out.println(m.deck.get(6).numero+ "  "+ m.deck.get(6).palo);
        System.out.println("\n");

        Jugador j = new Jugador();

        j.addCarta(m.deck.get(0));
        j.addCarta(m.deck.get(1));
        j.addCarta(m.deck.get(2));
        j.addCarta(m.deck.get(3));
        j.addCarta(m.deck.get(4));
        j.addCarta(m.deck.get(5));
        j.addCarta(m.deck.get(6));



        //ManoPoker mano = new ManoPoker(m.deck.get(0),m.deck.get(1),m.deck.get(2),m.deck.get(3),m.deck.get(4));




        Carta[] arr = {j.cartasEnMano.get(0),j.cartasEnMano.get(1),j.cartasEnMano.get(2),j.cartasEnMano.get(3),j.cartasEnMano.get(4),j.cartasEnMano.get(5),j.cartasEnMano.get(6)};
        Carta[] combinaciones = combinations2(arr, 5, 0, new Carta[5]);


        System.out.println("Combinaciones");
        for(int i = 0; i<combinaciones.length;i++){

            System.out.println(combinaciones[i].numero+"  "  + combinaciones[i].palo);



        }


        }






    public static void Deal(){


        /*
        Mazo m = new Mazo();
        int cantJugadores = 2;
        for(int i=0;i<cantJugadores;i++){
            ManoPoker m1 = new ManoPoker(m.deck.get(i),m.deck.get(i+1),m.deck.get(i+2),m.deck.get(i+3),m.deck.get(i+4));

        }
        ManoPoker m1 = new ManoPoker(m.deck.get(0),m.deck.get(1),m.deck.get(1),m.deck.get(1),m.deck.get(1));*/

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
