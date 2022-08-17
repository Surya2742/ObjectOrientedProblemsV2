package com.bridgelabz.CardsProgram;

public interface DeckOfCardsInterface {

    String[] cardSuit = {"Diamond", "Heart", "Club", "Spades"};
    String[] cardsRank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "King", "Queen"};

    public void init();

    public void shuffle();

    public void distribute();

    public void print();

    public void printDistributedCards();

    public void playerSortCard();

}
