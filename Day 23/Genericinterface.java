package com.gen;

interface Mathematics<N extends Number> {
    
    int powerOf(N n);
}

class PowerOfThree<N extends Number> implements Mathematics<N>{
    
    public int powerOf(N i){
        
        return i.intValue()*i.intValue()*i.intValue();
    }
}

public class Genericinterface {

    public static void main(String[] args) {
        
        PowerOfThree<Float> pthree = new PowerOfThree<Float>();
        System.out.println("10^2 -> "+pthree.powerOf(5f));
    }
}