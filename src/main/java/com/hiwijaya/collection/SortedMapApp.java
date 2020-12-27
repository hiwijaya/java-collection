package com.hiwijaya.collection;

import com.hiwijaya.collection.data.Player;
import com.hiwijaya.collection.data.PlayerComparator;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Happy Indra Wijaya
 *
 * - SortedMap is sorting Map by key
 * - If the element is descendent of Comparable, it will automatically sorted using it
 * - If not, we must create Comparator class to define how to sorting those element
 * - SortedMap only have 1 concrete class, TreeMap
 * - TODO: EntryMap
 * - Have NavigableMap too!
 *
 *
 */
public class SortedMapApp {

    private void treeMap(){

        Player player1 = new Player(23, "LeBron James");
        Player player2 = new Player(3, "Anthony Davis");
        Player player3 = new Player(21, "JR Smith");

        SortedMap<Player, String> sortedPlayer = new TreeMap<>(new PlayerComparator());
        sortedPlayer.put(player1, "Small Forward");
        sortedPlayer.put(player2, "Center");
        sortedPlayer.put(player3, "Point Guard");

        for(Player key : sortedPlayer.keySet()){
            System.out.println(key.getName());
        }

    }

    public static void main(String[] args) {

        SortedMapApp app = new SortedMapApp();
        app.treeMap();

    }

}
