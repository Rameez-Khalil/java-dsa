package com.recursiveBinaryTree;

public class RecursiveBinaryTree {

    //Class of Node
    class Node {
        int value;
        Node left;
        Node right;


        public Node(int value) {
            this.value = value;
        }
    }

    //Head Pointer  - root.
    private Node root;

    //Contains method recursive approach.
    /*
        Check if the root is null, if so then return false.
        Check if the provided value is equal the value we have in hand, if so then return true.
        If the value is smaller than the current node, then move towards the left, if not, then right.
     */

    private boolean rContains(Node currentNode, int value) {
        //Check if the root is null.
        if (currentNode == null) return false;

        //Check if we have the same value at hand - base condition.
        if (currentNode.value == value) return true;

        //Move left or right.
        if (value < currentNode.value) {
            //Move left.
            return rContains(currentNode.left, value);
        } else {
            //Move right.
            return rContains(currentNode.right, value);
        }

    }

    //Contains caller method.
    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private Node insert(Node currentNode, int value) {
        //base condition where our left/right is null.
        if (currentNode == null) return new Node(value);

        //Move left.
        if (value < currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = insert(currentNode.right, value);
        }

        return currentNode;


    }

    //Insert caller.
    public void insert(int value) {

        if (root == null) {
            root = new Node(value);
        }
        insert(root, value);
    }


    private int minValue(Node currentNode) {
        //traverse until the left hand becomes null
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }

        return currentNode.value;
    }

    //Delete node.
    public Node deleteRecursive(Node currentNode, int value) {
        //Check if the value doesn't exist.
        if (currentNode == null) return null;

        //Check if the value exists in either right or left hand.
        if (value < currentNode.value) {
            //move left.
            currentNode.left = deleteRecursive(currentNode.left, value);
        } else if (value > currentNode.value) {
            //move right
            currentNode.right = deleteRecursive(currentNode.right, value);
        } else {
            //Value found.
            //4 edge cases need to be handled.

            //If the node is a leaf node.
            if (currentNode.left == null && currentNode.right == null) {
                currentNode = null;
            } else if (currentNode.left == null) {
                //move right to the root of this sub level.
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            }

            //If the node to be removed is a root node for a sub tree.
            else {
                //Find the minimum value in a subtree's right hand.
                int minValue = minValue(currentNode.right);
                currentNode.value = minValue;

                //Delete the item.
                currentNode.right = deleteRecursive(currentNode.right, minValue);

            }
        }
        return currentNode;

    }
}
