package com.hiwijaya.collection;

import com.hiwijaya.collection.abstractCollection.DoubleQueue;

import java.util.Queue;

/**
 * @author Happy Indra Wijaya
 *
 * Custom collection with Abstract Collection
 *
 */
public class DoubleQueueApp {

    private void doubleQueue() {

        Queue<String> queue = new DoubleQueue<>();

        queue.offer("Happy");
        queue.offer("Indra");
        queue.offer("Wijaya");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());

    }

    public static void main(String[] args) {
        DoubleQueueApp app = new DoubleQueueApp();
        app.doubleQueue();
    }

}
