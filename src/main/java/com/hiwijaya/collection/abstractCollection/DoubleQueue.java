package com.hiwijaya.collection.abstractCollection;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Happy Indra Wijaya
 */
public class DoubleQueue<E> extends AbstractQueue<E> {

    private List<E> elements;

    public DoubleQueue(){
        elements = new ArrayList<>();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean offer(E e) {
        if(elements.size() < 2){
            elements.add(e);
            return true;
        }
        return false;
    }

    @Override
    public E poll() {
        if(elements.size() > 0){
            return elements.remove(0);
        }

        return null;
    }

    @Override
    public E peek() {
        if(elements.size() > 0){
            return elements.get(0);
        }

        return null;
    }
}
