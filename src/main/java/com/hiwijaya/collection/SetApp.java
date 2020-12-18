package com.hiwijaya.collection;

import com.hiwijaya.collection.data.Player;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Happy Indra Wijaya
 *
 * - Element in Set is unique
 * - Set doesn't have index, so there is no guarantee the list will be order when adding the element
 * - Because Set doesn't have index, you need iterator to get the element
 * - To declare the unique key from object, you must override equals() and hashCode()
 * - If you need Sorted Set, please refer to SortedSet interface
 *
 * WARN:
 * - if you override equals() you must override hashCode() too
 *
 * [HashSet]
 * - Doesn't maintain the order of insertion element
 * - Better performance(faster), because doesn't maintain the order of element
 *
 * [LinkedHashSet]
 * - Ensure the data will be ordered when adding the element
 * - It can be ordered because LinkedHashSet use "Doubly Linked List" in background
 *
 */
public class SetApp {

    private void hashSet(){

        Player player1 = new Player(9, "Rajon Rondo");
        Player player2 = new Player(23, "LeBron James");
        Player player3 = new Player(3, "Anthony Davis");
        Player player4 = new Player(4, "Alex Caruso");
        Player player5 = new Player(14, "Danny Green");

        Set<Player> players = new HashSet<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        players.add(new Player(3, "Anthony Davis"));

        for(var player : players){
            System.out.println(player.getName());
        }

    }

    private void linkedHashSet(){

        Set<String> names = new LinkedHashSet<>();
        names.add("Gandalf");
        names.add("Aragon");
        names.add("Legolas");
        names.add("Sauron");
        names.add("Elrond");
        names.add("Frodo");

        names.add("Gandalf");

        for(var name : names){
            System.out.println(name);
        }

    }

    private void immutableSet(){

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Happy");

        Set<String> names = new HashSet<>();
        names.add("Frodo");
        names.add("Sam");
        names.add("Pippins");

        Set<String> immutableNames = Collections.unmodifiableSet(names);
        immutableNames.remove("Sam");   // raised UnsupportedOperationException

        // Set.of() return immutableSet and will directly raise exception when add duplicated value
        //Set<String> immutableNames = Set.of("Frodo", "Sam", "Pippins");

        System.out.println(immutableNames);

    }

    public static void main(String[] args) {

        SetApp app = new SetApp();
//        app.hashSet();
//        app.linkedHashSet();
        app.immutableSet();
    }

}
