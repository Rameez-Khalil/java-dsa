package com.coding.quetions.hashtable;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {

    }

    //ITEMS IN COMMON.
    public static boolean itemsInCommon(int[] arr1, int[] arr2) {
        //Read every item from arr1 and store it inside a hashmap.
        //Read every item from arr2 and for every item, call the get method and return true if its
        //not null, otherwise return false.

        HashMap<Integer, Boolean> map = new HashMap<>();

        //Read every item from arr1
        for (int i : arr1) {
            map.put(i, true);
        }

        //Read every item from arr2.
        for (int j : arr2) {
            if (map.get(j) != null) {
                return true;
            }

        }
        return false;
    }

    //FIND DUPLICATES.
    public static List<Integer> findDups(int[] arr) {
        //Convert the arr into a hashmap each item will share the no. of times it appears in the array.
        //Read the hashmap and only push the items into the arraylist where count > 1.

        //Result
        List<Integer> list = new ArrayList<>();

        //Hashmap.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        //Read the hashmap and return the values only when the count is > 1.
        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            if (me.getValue() > 1) {
                list.add(me.getKey());
            }
        }
        return list;
    }


    //NON-REPEATING CHARACTER.
    //APPROACH:
    // Read every item and store its count in hashmap.
    // Return the key where count=1.

    public static Character nonRepeatingChar(String s) {
        //Result.
        HashMap<Character, Integer> map = new HashMap<>();

        //Converting string into char array.
        char[] charArray = s.toCharArray();

        //Read every character from string, and maintain the count for each item.
        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
        }

        //Read every item from hashmap and return when the count is 1.
        for (Map.Entry<Character, Integer> me : map.entrySet()) {
            if (me.getValue() == 1) {
                return me.getKey();
            }
        }
        return null;
    }

    //GROUP ANAGRAMS.
    public static List<List<String>> groupAnagram(String[] strings) {

        //Initialize a map that can hold a string and a list of strings.
        HashMap<String, List<String>> map = new HashMap<>();

        //Read every string and find its canonical form by sorting each string item, based off of the character.
        for (String str : strings) {
            char[] characters = str.toCharArray();
            //if we get 'eat', then it will become 'aet' this will help us find all the other elements which can be resolved to this form.
            Arrays.sort(characters);

            //Canonical Representation.
            String canonical = new String(characters);

            //Group the anagrams.
            //For every unique string, create a new list that can hold the anagrams based off of the canonical form.
            //e.g. ate, eat will be grouped into one container as both have a canonical form of aet.

            if (map.containsKey(canonical)) {
                map.get(canonical).add(str);
            } else {
                List<String> groupedList = new ArrayList<String>();
                groupedList.add(str);
                map.put(canonical, groupedList);
            }
        }

        return new ArrayList<>(map.values());
    }

    //TWO SUM.
    public int[] twoSum(int[] nums, int target) {
        //Initialize a map.
        HashMap<Integer, Integer> map = new HashMap<>();

        //Loop through the array and find complement against each item.
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(num, i);
        }

        return new int[]{};
    }

    //SUB-ARRAY SUM.

}
