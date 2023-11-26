package com.hashtables;

import java.util.*;

public class HashTable {

    //Size, datamap array.
    private int size = 7;
    private Node[] datamap;

    class Node {
        //this holds value, key, and next.
        int value;
        String key;
        Node next;

        //Constructor.
        Node(String key, int value) {
            this.value = value;
            this.key = key;
        }
    }

    //HT constructor.
    HashTable() {
        datamap = new Node[size];
    }


    //Print table function.
    public void printTable() {
        for (int i = 0; i < datamap.length; i++) {
            System.out.println(i + ":");
            Node temp = datamap[i];
            while (temp != null) {
                System.out.println("{ " + temp.key + ":" + temp.value + " }");
                temp = temp.next;
            }
        }
    }

    //hash function.
    private int hash(String key) {
        int hash = 0;
        //conver this key into chararray.
        char[] charArray = key.toCharArray();
        //read each character and find its asciivalue.
        for (int i = 0; i < charArray.length; i++) {
            int asciiVal = charArray[i];
            hash = (hash + asciiVal * 23) % datamap.length;
        }

        return hash;
    }

    //set method.
    public void setMethod(int value, String key) {
        //setting the value of hashedkey.
        int index = hash(key);

        //creating a node.
        Node newNode = new Node(key, value);

        if (datamap[index] == null) {
            datamap[index] = newNode;
        } else {
            Node temp = datamap[index];
            while (temp.next != null) {
                temp = temp.next;
            }

            //now that we have our final node lets just assign the value to it.
            temp.next = newNode;
        }

    }

    //get method.
    public int getMethod(String key) {
        int index = hash(key);
        Node temp = datamap[index];
        //There are two paths for this.
        //1. If that position contains multiple nodes.
        //2. If that position contains null.

        //Coding for when there are multiple nodes.
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }

    //Keys.
    public List<String> keys() {
        ArrayList<String> list = new ArrayList<String>();
        Node temp;
        for (int i = 0; i < datamap.length; i++) {
            temp = datamap[i];
            while (temp != null) {
                list.add(temp.key);
                temp = temp.next;
            }

        }
        return list;
    }




}
