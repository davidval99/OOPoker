package com.company;

public class Vec {
    private byte [] v;
    
    public Vec(int tam){
        v = new byte[tam];
    }
       
    public int compareTo(Vec ve){
        for(int i = 0; i<v.length; i++)
            if(v[i] != ve.get(i))
                return v[i]- ve.get(i);
        	return 0;
    }
    
    public void set(int index, byte val){
        this.v[index] = val;
    }
    
    public byte get(int index){
    return v[index];}
}
