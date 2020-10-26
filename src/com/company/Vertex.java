package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    public String label;
    private boolean beingVisited = false;
    private boolean visited = false;
    public List<Vertex> adjacencyList;

    public Vertex(String label) {
        this.label = label;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbor (Vertex adjacent) {
        this.adjacencyList.add(adjacent);
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public boolean isVisited() {
        return !visited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }
}
