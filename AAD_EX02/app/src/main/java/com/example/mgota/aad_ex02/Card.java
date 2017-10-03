package com.example.mgota.aad_ex02;

/**
 * Created by mgota on 9/28/2017.
 */

public class Card {
    String suit;
    int val;

    public Card(){

    }

    public Card(String mySuit, int myVal) {
        this.suit = mySuit;
        if(myVal < 1 || myVal > 14) this.val = 1;
        else this.val = myVal;
    }

    int getVal(){
        return val;
    }

    String getSuit(){
        return suit;
    }
}
