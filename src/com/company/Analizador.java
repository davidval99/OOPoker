package com.company;

public class Analizador{

    static final int CANT_CARTAS = 5;

    /*
    static Vec analizaMano(Carta [] hand){
        Vec v = new Vec(CANT_CARTAS+1);
        if(esEscaleraReal(hand)){
        //hacer el vector con 9 y ordenando el resto...
            v.set(0,(byte)9);
        }
        else if(esPoker(hand)){

        }
        return v;
        }*/

    
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
    

