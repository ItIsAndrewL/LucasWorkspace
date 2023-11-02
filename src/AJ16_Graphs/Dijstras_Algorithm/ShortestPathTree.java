package AJ16_Graphs.Dijstras_Algorithm;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ShortestPathTree{

    int[][] graph;
    ArrayList<Vertex<Integer>> vertices;
    PriorityQueue<Vertex<Integer>> unvisited;

    public void dijkstra(int[][] graph, int source) {
        this.graph = graph;
        for(int i=0;i<graph.length;i++){
            this.vertices.add(new Vertex<Integer>(i));
        }
    }
}
