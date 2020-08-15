package com.company.Classes;

import com.company.Interfaces.Mano;
import java.util.*;


public class ManoPoker implements Mano {

    Carta hand[] = new Carta[5];
    Carta cartasTemporal[] = new Carta[7];
    Vec valor = new Vec(6);
    static final int CANT_CARTAS = 5;



    public ManoPoker(){

    }

    public ManoPoker(Carta c0, Carta c1, Carta c2, Carta c3, Carta c4, Carta c5, Carta c6){
        cartasTemporal[0] = c0;
        cartasTemporal[1] = c1;
        cartasTemporal[2] = c2;
        cartasTemporal[3] = c3;
        cartasTemporal[4] = c4;
        cartasTemporal[5] = c5;
        cartasTemporal[6] = c6;

        //valor = Analizador.analizaMano(hand);

    }
    public static boolean esEscaleraReal(Carta [] hand){
        boolean b = true;
        if(!(hand == null) && (esColor(hand) == true)){
            int valor1 = 0;
            boolean sal = true;

            for (int i = 0; i < (hand.length - 1) && (sal); i++) { //size o length
                if (hand[i].getNumero() == hand[i+1].getNumero()) {
                    valor1 = hand[i].getNumero();
                    sal = false;
                }
            }
        }
        return b;
    }


    public static boolean esEscaleraColor(Carta [] hand){ //tomar en cuenta el AS
        /*int n1 = hand[0].getNumero();
        boolean b= true;
        for(int i = 1; i<CANT_CARTAS && b; i++)
            b = (n1+i == hand[i].getNumero()) || (n1+i+9 == hand[i].getNumero());
        return b;*/
        boolean salida = false;
        if(esEscalera(hand) == true && esColor(hand) == true){
            salida = true;
        }
        else{
            salida = false;
        }
        return salida;
    }

    public static boolean esPoker(Carta [] m1){
        boolean salida=false;

        if (!(m1 == null)) {
            int valor1 = 0;
            boolean sal = true;

            for (int i = 0; i < (m1.length - 1) && (sal); i++) { //size o length

                if (m1[i].getNumero() == m1[i+1].getNumero()) {
                    valor1 = m1[i].getNumero();
                    sal = false;
                }
            }

            //Resultado
            salida = true;
        }

        return salida;
    }

    public static boolean esFullHouse(Carta [] hand){
        boolean salida = false;
        if(esTrio(hand) == true && esPar(hand) == true){
            salida = true;
        }

        return salida;
    }


    public static boolean esColor(Carta [] hand){
        boolean b = false;
        if(!(hand == null)) {
            for (int i = 1; i < CANT_CARTAS && b; i++)
                b = hand[0].getPalo() == hand[i].getPalo();
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }


    public static boolean esEscalera(Carta [] hand){
        boolean b = true;
        return b;
    }


    public static boolean esTrio(Carta [] m1){
        boolean salida=false;

        if (!(m1 == null)) {
            int valor1=0, valor2=0, cont1=0, cont2=0;
            boolean sal=true;

            for (int i=0; i<(m1.length-1) && (sal); i++) {
                //Obtenemos el valor del trío de m1
                if (m1[i].getNumero()==m1[i+1].getNumero())
                    cont1++;
                else if (cont1==2)
                    valor1=m1[i].getNumero();
                else
                    cont1=0;

                salida = true;
            }

        }

        return salida;
    }


    public static boolean esDoblePar(Carta [] hand){
        boolean b = true;
        return b;
    }

/*ARREGLAR*/
    public static boolean esPar(Carta [] m1){
        boolean salida = false;
        if (!(m1 == null)) {
            int valor1=0, cont1=0;
            boolean sal=true;

            for (int i=0; i<m1.length-1 && (sal); i++) {
                //Obtenemos el valor de la pareja más alta de m1
                if (m1[i].getNumero() == m1[i+1].getNumero())
                    cont1++;
                else {
                    if (cont1 == 1) {
                        if (m1[i].getNumero() > valor1)
                            if (m1[i].getNumero() == 1)
                                valor1 = 14;
                            else
                                valor1 = m1[i].getNumero();
                        cont1 = 0;
                    }
                }
                salida = true;
            }
        }

        return salida;
    }

    public static boolean esCartaAlta(Carta [] m1) {
        boolean salida = false;

        if (!(m1 == null)) {
            int valor1 = m1[0].getNumero();
            boolean sal = true;

            for (int i = 0; i < m1.length && sal; i++) {
                if (m1[i].getNumero() == 1) {
                    valor1 = 14;
                    sal = false;
                } else if (m1[i].getNumero() > valor1)
                    valor1 = m1[i].getNumero();
            }

            salida = true;

        }
        return salida;
    }

    private void sortNumber(Carta[] hand){
        sortNumber(hand, 0, 4);
    }



    private void sortNumber(Carta[] hand, int begin, int end){
        if (begin < end) {
            int partitionIndex = partition(hand, begin, end);

            sortNumber(hand, begin, partitionIndex-1);
            sortNumber(hand, partitionIndex+1, end);
        }
    }

    private int partition(Carta arr[], int begin, int end) {
        int pivot = arr[end].getNumero();
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j].getNumero() <= pivot) {
                i++;

                Carta swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        Carta swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }


}

