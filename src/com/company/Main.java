package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("one", "one");
        hash.put("one", "one");
        hash.put("one", "one");
        System.out.println(hash.size());
    }
}
