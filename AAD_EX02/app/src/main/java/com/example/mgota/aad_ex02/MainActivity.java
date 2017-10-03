package com.example.mgota.aad_ex02;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mgota.aad_ex02.Card;

import org.w3c.dom.Text;

import java.util.Stack;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ImageView upperSuit, lowerSuit, cardFace;
    private TextView upperText, lowerText;
    Card mCard = new Card();
    Stack<Card> mDeck = new Stack<>();
    int val;
    String suit;

    //Initialize XML components and initial card and deck
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        upperText = (TextView) findViewById(R.id.upperText);
        upperSuit = (ImageView) findViewById(R.id.upperSuit);
        cardFace = (ImageView) findViewById(R.id.cardFace);
        lowerText = (TextView) findViewById(R.id.lowerText);
        lowerSuit = (ImageView) findViewById(R.id.lowerSuit);
        initDeck(mDeck);
        newCard(mCard, mDeck);
    }

    //Generetes all 52 unique cards and shuffles them
    protected void initDeck(Stack<Card> myDeck){
        for(int i = 0; i < 13; ++i)
        {
            myDeck.push(new Card("heart", i+1));
            myDeck.push(new Card("club", i+1));
            myDeck.push(new Card("diamond", i+1));
            myDeck.push(new Card("spade", i+1));
        }
        Collections.shuffle(myDeck);
    }

    //Function that gets called when user touches the screen. Pops a card
    //off the deck and gets its suit and value, then alters the image view
    //
    protected void newCard(Card myCard, Stack<Card> myDeck){
        if(myDeck.isEmpty()) return;
        myCard = myDeck.pop();
        suit = myCard.getSuit();
        val = myCard.getVal();
            if(suit ==  "heart") {
                upperText.setTextColor(Color.RED);
                lowerText.setTextColor(Color.RED);
                upperSuit.setImageResource(R.drawable.heart);
                cardFace.setImageResource(R.drawable.heart);
                lowerSuit.setImageResource(R.drawable.heart);
            }
            else if (suit == "diamond") {
                upperText.setTextColor(Color.RED);
                lowerText.setTextColor(Color.RED);
                upperSuit.setImageResource(R.drawable.diamond);
                cardFace.setImageResource(R.drawable.diamond);
                lowerSuit.setImageResource(R.drawable.diamond);
            }
            else if(suit == "spade") {
                upperText.setTextColor(Color.BLACK);
                lowerText.setTextColor(Color.BLACK);
                upperSuit.setImageResource(R.drawable.spade);
                cardFace.setImageResource(R.drawable.spade);
                lowerSuit.setImageResource(R.drawable.spade);
            }
            else if (suit == "club") {
                upperText.setTextColor(Color.BLACK);
                lowerText.setTextColor(Color.BLACK);
                upperSuit.setImageResource(R.drawable.club);
                cardFace.setImageResource(R.drawable.club);
                lowerSuit.setImageResource(R.drawable.club);
            }

            if(val == 1) {
                upperText.setText("1");
                lowerText.setText("1");
            }
            else if (val == 2){
                upperText.setText("2");
                lowerText.setText("2");
            }
            else if (val == 3) {
                upperText.setText("3");
                lowerText.setText("3");
            }
            else if (val == 4) {
                upperText.setText("4");
                lowerText.setText("4");
            }
            else if(val ==5) {
                upperText.setText("5");
                lowerText.setText("5");
            }
            else if (val == 6) {
                upperText.setText("6");
                lowerText.setText("6");
            }
            else if (val == 7) {
                upperText.setText("7");
                lowerText.setText("7");
            }
            else if (val == 8) {
                upperText.setText("8");
                lowerText.setText("8");
            }
            else if (val == 9) {
                upperText.setText("9");
                lowerText.setText("9");
            }
            else if (val == 10) {
                upperText.setText("10");
                lowerText.setText("10");
            }
            else if (val == 11) {
                upperText.setText("J");
                lowerText.setText("J");
            }
            else if (val == 12) {
                upperText.setText("Q");
                lowerText.setText("Q");
            }
            else if (val == 13) {
                upperText.setText("K");
                lowerText.setText("K");
            }
    }

    public void onTouch(View view) {
        newCard(mCard, mDeck);
    }
}
