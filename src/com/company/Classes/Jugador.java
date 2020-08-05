package com.company.Classes;

import java.util.ArrayList;

public class Jugador {

    String nombre;
    ManoPoker manoPokerFinal;
    ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
    public int Dinero = 1000;

    public Jugador(String name){
        this.nombre = name;
    }

    public Jugador(){
        this.nombre = "NoName";
    }

    public void addCarta(Carta carta){
        cartasEnMano.add(carta);
    }

    public void mostrarCartas(){

    }

    public boolean validarCantidad(int cantidad){

        if (cantidad>this.Dinero){
            return false;
        }
        else return true;

    }

    public boolean Fold(){
        return false;
    }

    public void AllIn(){

        this.Dinero= 0;
    }



    public void Apostar(int cantidad){

        if(validarCantidad(cantidad)){
        this.Dinero = this.Dinero-cantidad;}
        else{
            // All in??
        }

    }

    public void Igualar(int cantidad){

    }

}
