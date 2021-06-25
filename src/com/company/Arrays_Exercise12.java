package com.company;

import java.util.HashMap;

public class Arrays_Exercise12 {
//Make a Map that associates the following employee IDs with names.
//The point here is to associate keys with values, then retrieve values later based on keys.
//Test several valid and invalid ID’s and print the associated name.

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("a1234", "Adrian");
        map.put("b4321", "Vlad");
        map.put("c3241", "Mihai");
        map.put("d1432", "Calin");
        map.put("e2431", "Iulian");

        //associate keys with values
        System.out.println(map);

        //retrieve values based on keys
        System.out.println(map.get("a1234"));
        System.out.println(map.get("b4321"));
        System.out.println(map.get("c3241"));
        System.out.println(map.get("d1432"));
        System.out.println(map.get("e2431"));

        //test invalid ID's
        System.out.println(map.get("12344"));
        System.out.println(map.get(""));
        System.out.println(map.get("a4321"));
        System.out.println(map.get("Calin"));

    }



}
