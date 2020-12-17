package com.hiwijaya.collection.iterable;

import java.util.Iterator;
import java.util.List;

/**
 * @author Happy Indra Wijaya
 */
public class IterableApp {

    private void iterable() {

        Iterable<String> names = List.of("Happy", "Liam", "Yanna");
        for(var name : names){
            System.out.println(name);
        }

        // iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }


    public static void main(String[] args) {

        IterableApp app = new IterableApp();
        app.iterable();

    }

}
