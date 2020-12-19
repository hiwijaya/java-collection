package com.hiwijaya.collection;

import com.hiwijaya.collection.data.Player;
import com.hiwijaya.collection.data.PlayerComparator;

import java.util.*;

/**
 * @author Happy Indra Wijaya
 *
 * - SortedSet is sorted Set
 * - If the element is descendent of Comparable, it will automatically sorted using it
 * - If not, we must create Comparator class to define how to sorting those element
 * - TreeSet not allow any null object element
 * - SortedSet only have 1 concrete class, TreeSet
 *
 * [NavigableSet]
 * - add advanced functions to navigate searching elements
 * - use TreeSet for implementation too
 *
 */
public class SortedSetApp {

    private void treeSet(){

        Player player1 = new Player(9, "Rajon Rondo");
        Player player2 = new Player(23, "LeBron James");
        Player player3 = new Player(3, "Anthony Davis");
        Player player4 = new Player(4, "Alex Caruso");
        Player player5 = new Player(14, "Danny Green");

        SortedSet<Player> players = new TreeSet<>(new PlayerComparator().reversed());
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        System.out.println(players);

        var lastPlayer = players.last();
        System.out.println(lastPlayer);

    }

    private void navigableSet(){

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Derrick Rose", "Jason Kidd", "Amare Stoudemire", "Kevin Garnett"));

        var namesDesc = names.descendingSet();
        var headNames = names.headSet("Jason Kidd", true);  // inclusive mean included given element
        var higherName = names.higher("Derrick Rose");

        System.out.println(names);
        System.out.println(namesDesc);
        System.out.println(headNames);
        System.out.println(higherName);

    }


    private void immutableSortedSet(){

        SortedSet<String> empty = Collections.emptySortedSet();

        SortedSet<String> names = new TreeSet<>();
        names.add("Kobe Bryant");
        names.add("Paul Pierce");

        SortedSet<String> immutableNames = Collections.unmodifiableSortedSet(names);
        immutableNames.add("Ray Allen");    // raised UnsupportedOperationException

        System.out.println(immutableNames);
    }

    public static void main(String[] args) {

        SortedSetApp app = new SortedSetApp();
        app.treeSet();
        app.navigableSet();
        app.immutableSortedSet();

    }
}
