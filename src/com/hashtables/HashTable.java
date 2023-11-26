package com.hashtables;

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

}
