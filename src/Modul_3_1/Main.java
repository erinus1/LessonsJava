package Modul_3_1;//package Modul_3;
//task 1

public class Main {
    public static void main(String[] args) {//    PlayingCard card = new PlayingCard(rank, suit);

        Deck deck = new Deck();

        String ranks[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String suits[] = {"6", "7", "8", "9","10", "Jack", "Queen","King","Ace"};


        for(int a = 0; a < ranks.length; a++){

            for (int b = 0; b <suits.length; b++){
                String rank = ranks[a];
                String suit = suits[b];

                PlayingCard pc = new PlayingCard(rank, suit);

                deck.addPlayingCard(pc);

            }
        }

        deck.showAll();
    }


}
