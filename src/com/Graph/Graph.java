package com.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    //Hashmap to store our key-value pair.
    private HashMap<String, ArrayList<String>> adjacencyList = new HashMap<String, ArrayList<String>>();

    //Add vertex method.
    public boolean addVertex(String vertex) {
        //check to see if this vertex is already in our list.
        if (adjacencyList.get(vertex) == null) {
            //insert the key-value.
            adjacencyList.put(vertex, new ArrayList<String>());
            return true;
        }

        return false;
    }

    //ADD EDGE.
    public boolean addEdge(String vertex1, String vertex2) {

        //check to see if our list contains the provided vertices.
        if (adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null) {
            //Create a relationship by adding each vertex into the opposite's vertex's list.
            adjacencyList.get(vertex1).add(vertex2);
            adjacencyList.get(vertex2).add(vertex1);
            return true;
        }

        //Provided vertices were not located in our hashmap/list.
        return false;
    }

    //REMOVE EDGE.
    public boolean removeEdge(String vertex1, String vertex2) {
        //check to see if both vertices exist in our list.
        if (adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null) {
            //Locate and remove each vertex.
            adjacencyList.get(vertex1).remove(vertex2);
            adjacencyList.get(vertex2).remove(vertex1);
            return true;
        }

        //No vertex was located.
        return false;
    }

    //REMOVE VERTEX.
    public boolean removeVertex(String vertex) {
        if (adjacencyList.get(vertex) == null) {
            return false;
        }
        for (String connectedString : adjacencyList.get(vertex)) {
            //Traversing through each connected vertex's list and remove the connection.
            adjacencyList.get(connectedString).remove(vertex);
        }
        adjacencyList.remove(vertex);
        return true;
    }

    //PRINT THE GRAPH.
    public void printGraph() {
        System.out.println(adjacencyList);
    }

}
