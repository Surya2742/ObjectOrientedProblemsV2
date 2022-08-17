package com.bridgelabz.CardsProgram;

import java.util.Comparator;
import java.util.LinkedList;

public class ImplementationOfCard implements DeckOfCardsInterface {

    private String[] decks = new String[52];
    private String[][] playersCards = new String[4][13];
    private int distributedIndex;

    public ImplementationOfCard() {
        init();
    }

    @Override
    public void init() {
        int k=0;
        for (int i = 0; i < cardSuit.length; i++) {
            for (int j = 0; j < cardsRank.length; j++) {
                decks[k] = cardsRank[j] + " Of " + cardSuit[i];
                k++;
            }
        }
    }

    @Override
    public void shuffle() {
        for (int i = 0; i < decks.length; i++) {
            int randomIndex = (int) (Math.random() * decks.length);
            String temp = decks[i];
            decks[i] = decks[randomIndex];
            decks[randomIndex] = temp;
        }
    }

    @Override
    public void distribute() {
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 4; i++) {
                playersCards[i][j] = decks[distributedIndex++];
            }
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < decks.length; i++) {
            System.out.println(decks[i]);
        }
        System.out.print("\n");
    }

    public void printDistributedCards() {
        for (int i = 0; i < 4; i++) {
            LinkedList myList = new LinkedList();
            int playerCounter = i + 1;
            System.out.println("The Player " + playerCounter + " has following Nine Card :");
            for (int j = 0; j < 9; j++) {
                myList.add(playersCards[i][j]);
                System.out.print("[ " + playersCards[i][j] + " ]");
            }
            myList.sort(Comparator.reverseOrder());
            System.out.println("\nCards of Player " + playerCounter + " after arranging in Rank Order :");
            System.out.println(myList + "\n");
        }
    }

    public void playerSortCard() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < decks.length; i++) {
            list.add(decks[i]);
        }
        list.sort(Comparator.reverseOrder());
        System.out.println("One Player has arranged all the cards in Rank Order.");
        System.out.println(list);
    }


}


