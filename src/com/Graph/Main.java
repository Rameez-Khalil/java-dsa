package com.Graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        //ADD VERTICES.
        graph.addVertex("A");
        graph.addVertex("B");

        //ADDING EDGES.
        graph.addEdge("A", "B");

        //PRINT THE GRAPH.
        graph.printGraph();
    }
}
