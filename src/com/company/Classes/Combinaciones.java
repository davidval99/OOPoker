package com.company.Classes;

import java.util.Arrays;
public class Combinaciones {

static Carta[] combinations2(Carta[] arr, int len, int startPosition, Carta[] result) {


    if (len == 0){

        System.out.println(Arrays.toString(result));
        return result; }
    for (int i = startPosition; i <= arr.length-len; i++){
        result[result.length - len] = arr[i];
        combinations2(arr, len-1, i+1, result); }
    return result;
}
}