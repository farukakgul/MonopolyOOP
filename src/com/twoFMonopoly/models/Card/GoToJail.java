package com.twoFMonopoly.models.Card;

import com.twoFMonopoly.models.Player;

public class GoToJail implements JailStrategy {
    @Override
    public void act(Player player) {
        player.setJailStatus(1);
        //player.setCurrentLocationIndex(jailLocation);
        // TODO
    }
}