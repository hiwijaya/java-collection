package com.hiwijaya.collection;

import com.hiwijaya.collection.data.Player;

import java.util.*;

/**
 * @author Happy Indra Wijaya
 *
 * - Element in List can be duplicat
 * - Sorted by sequentially
 * - List have an index
 * - List have 2 implemented class, ArrayList and LinkedList
 *
 * [ArrayList]
 * - ArrayList is implemented List using array
 * - Default capacity is 10
 * - If we add new data in fulled ArrayList, it will automatically create new array with old capacity + new data
 * - If we add new data under capacity, it'll be fast!
 *
 * [LinkedList]
 * - LinkedList is implemented List using "doubly linked list"
 * - Each element of LinkedList store extra data of next and previous pointer
 *
 * add: ArrayList | LinkedList
 * get: ArrayList
 * set: ArrayList
 * remove: LinkedList
 *
 * When to use ArrayList?
 * - You want to access random items frequently
 * - You only need to add or remove elements at the end of the list
 *
 * When to use LinkedList?
 * - You only use the list by looping through it instead of accessing random items
 * - You frequently need to add and remove items
 *
 */
public class ListApp {

    private void arrayList(){

        Player player1 = new Player(9, "Rajon Rondo");
        Player player2 = new Player(23, "LeBron James");
        Player player3 = new Player(3, "Anthony Davis");
        Player player4 = new Player(4, "Alex Caruso");
        Player player5 = new Player(14, "Danny Green");
        Player player6 = new Player(21, "JR Smith");

        List<Player> players = new ArrayList<>();

        // add
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        // add with index
        players.add(3, player6);

        // set will replaced following index
        players.set(5, player6);

        // remove item
        players.remove(5);
        players.removeIf(p -> p.getNumber() == 4);

        // sorting wth implemented Comparable
        Collections.sort(players);
        System.out.println(players);

        // get item by index
        var mvp = players.get(3);
        System.out.println("MVP: " + mvp.getName());

        // iterating with for-loop
        for(Player p : players){
            System.out.println(p.getName() + " #" + p.getNumber());
        }

    }

    private void linkedList(){

        Player player1 = new Player(9, "Rajon Rondo");
        Player player2 = new Player(23, "LeBron James");
        Player player3 = new Player(3, "Anthony Davis");
        Player player4 = new Player(4, "Alex Caruso");
        Player player5 = new Player(14, "Danny Green");
        Player player6 = new Player(21, "JR Smith");

        var players = new LinkedList<Player>();

        // add
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        players.addFirst(player6);

        // remove
        var removedPlayer = players.removeLast();

        // peek - retrieves the head element, but not remove
        var peekPlayer = players.peek();

        // poll - retrieves the head element and removed it
        var pollPLayer = players.poll();

        // push - add an element on the first list
        players.push(player5);

        // pop - pop an element on the first list
        players.pop();

        System.out.println(players);

        // sorting wth implemented Comparable
        Collections.sort(players);

        // iterating with for-loop
        for(Player p : players){
            System.out.println(p.getName() + " #" + p.getNumber());
        }

    }

    private void immutableList() {

        Player player = new Player(3, "Dwayne Wade");
        player.addSkill("3 point");
        player.addSkill("ball handling");

        var skills = player.getSkills();

        unwantedListOperation(skills);

        System.out.println(skills);
    }

    private void unwantedListOperation(List<String> list){
        list.add("rebound");    // raised an exception
    }

    public static void main(String[] args) {

        ListApp app = new ListApp();
//        app.arrayList();
//        app.linkedList();
        app.immutableList();
    }
}
