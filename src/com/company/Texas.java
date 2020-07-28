package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Texas {

    int cantidadJugadores = 2;
    int bigBilnd = 100;
    int smallBilnd = 50;
    Mazo mazo = new Mazo();
    ArrayList<Jugador> ListaJugadores = new ArrayList<Jugador>();
    ArrayList<Carta> Mesa = new ArrayList<Carta>();

    Jugador j1;
    Jugador j2;

    public Texas(Jugador j1, Jugador j2){
        ListaJugadores.add(j1);
        ListaJugadores.add(j2);
    }


    public void Deal(){

        for (int i=0;i<ListaJugadores.size();i++){
            ListaJugadores.get(i).addCarta(mazo.deck.get(0));
            ListaJugadores.get(i).addCarta(mazo.deck.get(1));

            mazo.deck.remove(0);
            mazo.deck.remove(0);
        }

    }

    public void TurnAndRiver(){
        //TurnAndRiver
        Mesa.add(mazo.deck.get(0));
        mazo.deck.remove(0);

    }

    public void Flop(){
        Mesa.add(mazo.deck.get(0));
        Mesa.add(mazo.deck.get(1));
        Mesa.add(mazo.deck.get(2));

        mazo.deck.remove(0);
        mazo.deck.remove(1);
        mazo.deck.remove(2);

    }

    public void cobrarBlinds(){
        ListaJugadores.get(0).Dinero = ListaJugadores.get(0).Dinero-bigBilnd;
        ListaJugadores.get(1).Dinero = ListaJugadores.get(1).Dinero-smallBilnd;

    }

    public void Jugar(){

        Deal();
        cobrarBlinds();


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("");

        String userName = myObj.nextLine();  // Read user input

    }





}
