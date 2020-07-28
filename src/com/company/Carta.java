package com.company;

public class Carta implements Comparable{
    int numero;
    int palo;
    
    public Carta(int n){ // Un ordinal de 0 a 51 para cada posible carta
        this.numero = n%13;
        this.palo = n/13;
    }

    
    public Carta(int numero, int palo){
        this.numero = numero;
        this.palo = palo;
    }
    
    public int getNumero(){return this.numero;}
    public int getPalo(){return this.palo;}
    public int getOrdinal(){ return palo*13+this.numero;}
    
    public int compareTo(Carta c){
        return this.getOrdinal()-c.getOrdinal();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
