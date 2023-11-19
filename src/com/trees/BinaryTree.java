package com.trees;

/*
  Binary tree can either have 0 or two nodes.
  Full - Either have 0 or two nodes.
  Perfect - All levels are filled.
  Complete - Insertion should start from left most.
   */
public class BinaryTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }


    //Insert method:
    public boolean insert(int value) {
        //creating a node.
        Node newNode = new Node(value);

        //Tree initializer
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            //Since we don't want dups.
            if (newNode.value == temp.value) {
                return false;
            }
            //Initializing left and right.
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }

            //Initializing right hand side.
            else {
                //check to see if right hand is blank/nul.
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }

        }

    }

    //contains method:
    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            //check on left hand side.
            if (value < temp.value) {
                temp = temp.left;
            }
            //check on right hand.
            else if(value> temp.value){
                temp = temp.right;
            }
            else{
                return true;
            }

        }

        return false;
    }
}
