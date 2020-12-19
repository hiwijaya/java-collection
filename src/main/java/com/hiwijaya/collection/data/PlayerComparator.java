package com.hiwijaya.collection.data;

import java.util.Comparator;

/**
 * @author Happy Indra Wijaya
 */
public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player1.getName().compareTo(player2.getName());
    }

}
