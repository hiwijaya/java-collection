package com.hiwijaya.collection;

import com.hiwijaya.collection.data.Player;

import java.util.*;

/**
 * @author Happy Indra Wijaya
 *
 * - Map is key-value collection
 *
 * [HashMap]
 * - Distributed key with hashCode() function
 * - HashMap performance very depends on the value from hashCode()
 *
 * [WeakHashMap]
 * - Similar with HashMap
 * - If not using anymore GC will delete it
 * - Suitable for storing cache data
 *
 * [IdentityHashMap]
 * - Similar with HashMap
 * - IdentityHashMap not use equals() to identify same data, but use operator == (reference equality)
 * - It mean data called same if reference to same memory alocation
 *
 * [LinkedHashMap]
 * - Implemented Map using Doubly Linked List
 * - Ensure the data will be ordered when adding the element
 * - WARNING, get data process will slower because it must iterate the Linked List first
 * - Please use LinkedHashMap only if the order data is more important
 *
 * [EnumMap]
 * - Use Enum as key
 * - more optimal than hashCode()
 *
 */
public class MapApp {

    private enum Role {
        USER, ADMIN
    }

    private void hashMap(){

        Player player1 = new Player(23, "LeBron James");
        Player player2 = new Player(3, "Anthony Davis");
        Player player3 = new Player(9, "Rajon Rondo");

        Map<String, Player> players = new HashMap<>();
        players.put("PG", player3);
        players.put("SF", player1);
        players.put("PF", player2);

        // get value by key
        Player sf = players.get("SF");
        System.out.println(sf);

        // get all keys
        Set<String> keys = players.keySet();
        System.out.println(keys);

        // iterating all values
        for (String key : keys) {
            Player p = players.get(key);
            System.out.println(p);
        }

        // iterating with for-loop
        for(Map.Entry<String, Player> entry : players.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    private void weakHashMap(){

        Map<Integer, Integer> map = new WeakHashMap<>();

        for(var i = 0; i < 1_000_000; i++){
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());
    }

    private void identityHashMap(){

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Happy");
        map.put(key2, "Happy");

        System.out.println(map.size());

    }

    private void linkedHashMap(){

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Happy");
        map.put("middle", "Indra");
        map.put("last", "Wijaya");

        Set<String> keys = map.keySet();
        for(var key : keys){
            System.out.println(key);
        }

    }

    private void enumMap(){

        Map<Role, String> map = new EnumMap<>(Role.class);
        map.put(Role.USER, "user");
        map.put(Role.ADMIN, "admin");

        for(var key : map.keySet()){
            System.out.println(map.get(key));
        }



    }

    public static void main(String[] args) {

        MapApp app = new MapApp();
//        app.hashMap();
//        app.weakHashMap();
//        app.identityHashMap();
//        app.linkedHashMap();
        app.enumMap();
    }

}
