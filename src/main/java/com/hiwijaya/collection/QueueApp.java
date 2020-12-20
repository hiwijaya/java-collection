package com.hiwijaya.collection;

import java.util.*;

/**
 * @author Happy Indra Wijaya
 *
 * - Queue is FIFO
 * - Have 3 concrete class. ArrayDeque, LinkedList, PriorityQueue
 * - PiorityQueue is Sorted Queue
 *
 * - Deque(Doubly Ended Queue) mean it can be operate on the front or end
 * - Supported FIFO and LIFO/stack
 *
 */
public class QueueApp {

    private void arrayDeque(){

        Queue<String> names = new ArrayDeque<>();
        names.offer("Kevin Garnett");
        names.offer("Rajon Rondo");
        names.offer("Nate Robinson");
        names.offer("Ray Allen");
        names.offer("Kendrick Perkins");

        for(String next = names.poll(); next != null; next = names.poll()){
            System.out.println(next);
        }
        System.out.println(names.size());

    }

    private void priorityQueue(){

        Queue<String> names = new PriorityQueue<>(5);
        names.add("Kevin Garnett");
        names.add("Rajon Rondo");
        names.add("Nate Robinson");
        names.add("Ray Allen");
        names.add("Kendrick Perkins");

        for(String next = names.poll(); next != null; next = names.poll()){
            System.out.println(next);
        }
        System.out.println(names.size());

    }

    private void deque(){

        Deque<String> deque = new LinkedList<>();
        deque.offerFirst("Kobe Bryant");
        deque.offerFirst("LeBron James");
        deque.offerFirst("Kevin Durant");

        for(var name : deque){
            System.out.println(name);
        }

        System.out.println("---");

        // queue/FIFO
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Kobe Bryant");
        queue.offerLast("LeBron James");
        queue.offerLast("Kevin Durant");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

        System.out.println("---");

        // stack/LIFO
        Deque<String> stack = new LinkedList<>();
        stack.offerLast("Kobe Bryant");
        stack.offerLast("LeBron James");
        stack.offerLast("Kevin Durant");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

    }

    public static void main(String[] args) {

        QueueApp app = new QueueApp();
//        app.arrayDeque();
//        app.priorityQueue();
        app.deque();

    }

}
