package com.company.Classes;

import com.company.Interfaces.Mano;

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

    public static boolean esColor(Carta [] hand){
        boolean b = true;
        for(int i = 1; i<CANT_CARTAS && b; i++)
            b = hand[0].getPalo() == hand[i].getPalo();
        return b;
    }

    public static boolean esEscalera(Carta [] hand){ //tomar en cuenta el AS
        int n1 = hand[0].getNumero();
        boolean b= true;
        for(int i = 1; i<CANT_CARTAS && b; i++)
            b = (n1+i == hand[i].getNumero()) || (n1+i+9 == hand[i].getNumero());
        return b;
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
