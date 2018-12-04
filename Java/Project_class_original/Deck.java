package gameplatform;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    int index = 0;


    public Deck(){
        for (int i = 1; i < 13; i++) {
            deckOfCards.add( new Card(i,'\u2660'));
        }
        for (int i = 1; i < 13; i++) {
            deckOfCards.add( new Card(i,'\u2764'));
        }
        for (int i = 1; i < 13; i++) {
            deckOfCards.add( new Card(i,'\u2663'));
        }
        for (int i = 1; i < 13; i++) {
            deckOfCards.add( new Card(i,'\u2666'));
        }
        shuffle();
    }
    public Card removeCard(){
        Card remove = deckOfCards.get(index);
        index++;
        return remove;
    }

    public void shuffle(){
        Collections.shuffle(deckOfCards);
    }
}
