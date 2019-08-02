package Modul_3_1;//package Modul_3;
//task 1

import java.util.ArrayList;
import java.util.Iterator;

public class Deck {

    private ArrayList<PlayingCard> collection = new ArrayList<>();

//    String draw(){

//    }

    void addPlayingCard(PlayingCard pc){

        collection.add(pc);

    }

    void showAll(){ //should be able to draw a card one by one till the deck ends
        Iterator<PlayingCard> i = collection.iterator();

        while (i.hasNext()) {
            PlayingCard pc = i.next();

            System.out.println("Suit is: " + pc.suit + "; Rank is: " + pc.rank);
        }
    }

}
