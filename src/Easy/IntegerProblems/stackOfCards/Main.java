package Easy.IntegerProblems.stackOfCards;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        List<Card> deck  = Card.getStandardDeck();
        Card.printDeck(deck,"deck of 52 cards as it is", 4);
        Collections.shuffle(deck);
        Card.printDeck(deck,"deck shuffled",4);
        Collections.reverse(deck);
        Card.printDeck(deck,"deck shuffled",4);

        var sortingAlgorithm = Comparator.comparing(Card::getRank).thenComparing(Card::getSuit);
        Collections.sort(deck,sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sorted by rank, suit", 13);


    }

}
