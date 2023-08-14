package Easy.IntegerProblems.stackOfCards;

import java.util.ArrayList;
import java.util.List;

public class Card {

    protected Suit suit;
    protected  String face;
    protected int rank;

    public Card(Suit suit, String face, int rank) {
        this.suit = suit;
        this.face = face;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0,index);
        return String.format("%s%c(%d)",faceString,suit.getImage(),rank);
    }

    public static Card getNumbericCard (Suit suit,int cardNumber) {
        if(cardNumber > 1 && cardNumber < 11) {
            return new Card (suit, String.valueOf(cardNumber), cardNumber-2);
        }
        System.out.println("Invalid Numeric card selected");
        return null;
    }

    public static Card getFaceCard (Suit suit, char abbrev) {
        int charIndex = "JQKA".indexOf(abbrev);
        if(charIndex > -1) {
            return new Card(suit,"" + abbrev, charIndex + 9);
        }
        System.out.println("Invalid Face card selected");
        return null;
    }
    public static List<Card> getStandardDeck () {
        List<Card> deck = new ArrayList<>(52);
        for(Suit suit: Suit.values()) {
            for(int i = 2; i<=10; i++) {
                deck.add(getNumbericCard(suit,i));
            }
            for(char c: new char[] {'J','Q','K','A'}) {
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }
    public static void printDeck(List<Card> deck, String description, int rows) {
        System.out.println("--------------------------------------------");
        if(description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size()/ rows;
        for(int i = 0; i< rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex,endIndex).forEach(card -> System.out.print(card + " "));
            System.out.println();
        }
    }
    public static void printDeck (List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }

}
