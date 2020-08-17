package com.company.Interfaces;

import com.company.Classes.Player;
import com.company.Classes.Pot;

public interface PokerGame {

    public void run();

    public void playHand();

    public void resetHand();

    public void rotateActor();

    public void dealHoleCards();

    public void dealCommunityCards();

    public void doBettingRound();

    public void notifyMessage(String message, Object... args);

    public void notifyBoardUpdated();

    public int getTotalPot();

    public void notifyPlayersUpdated(boolean showdown);

    public void notifyPlayerActed();



}
