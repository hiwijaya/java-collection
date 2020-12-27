package com.hiwijaya.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Happy Indra Wijaya
 *
 * Binary search can work ONLY with sorted data
 *
 */
public class BinarySearchApp {

    private void binarySearch(){

        List<Integer> data = new ArrayList<>(1_000);

        for(int i = 1; i <= 1_000; i++){
            data.add(i);
        }

        int index = Collections.binarySearch(data, 745);
        System.out.println(index);


    }

    public static void main(String[] args) {

        BinarySearchApp app = new BinarySearchApp();
        app.binarySearch();

    }

}
