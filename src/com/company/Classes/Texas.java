package com.company.Classes;

import com.company.Interfaces.Poker;

import java.util.ArrayList;
import java.util.Scanner;

public class Texas implements Poker {

    int cantidadJugadores = 2;

    int bigBilnd = 100;
    int smallBlind = 50;


    Mazo mazo = new Mazo();
    ArrayList<Jugador> ListaJugadores = new ArrayList<Jugador>();
    ArrayList<Carta> Mesa = new ArrayList<Carta>();
    int Pot = 0;

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

    public void sacarCartasParaLaMesa(int cantidadCartas){


    }


    @Override
    public void repartir() {

    }

    @Override
    public void voltearCartas() {

    }

    public void Jugar(){

        Deal();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("");

        String userName = myObj.nextLine();  // Read user input

    }





}
