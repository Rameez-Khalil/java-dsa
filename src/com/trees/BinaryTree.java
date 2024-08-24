package com.trees;

import java.util.*;

/*
  Binary tree can either have 0 or two nodes.
  Full - Either have 0 or two nodes.
  Perfect - All levels are filled.
  Complete - Insertion should start from left most.

  BST - Maintains a property where left node is smaller than the right ones.
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
            else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }

        }

        return false;
    }

    //BFS
    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        //check to see after every attempt that the queue is valid.
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            results.add(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return results;
    }

    //DFS - PreOrder.
    public List<Integer> preOrdder() {
        ArrayList<Integer> list = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                list.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(root);
        return list;
    }


    //DFS - Post Order.
    public List<Integer> postOrder() {
        List<Integer> list = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                list.add(currentNode.value);
            }
        }

        new Traverse(root);
        return list;
    }

    //DFS In Order.
    public List<Integer> inOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);

                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;

    }


}
