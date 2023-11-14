package AJ16_Graphs.Dijstras_Algorithm;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ShortestPathTree{

    int[][] graph;
    ArrayList<Vertex<Integer>> vertices = new ArrayList<>();
    PriorityQueue<Vertex<Integer>> unvisited = new PriorityQueue<>();

    public void dijkstra(int[][] graph, int source) {
        this.graph = graph;
        for(int i=0;i<graph.length;i++){
            this.vertices.add(new Vertex<Integer>(i));
        }
        this.vertices.get(source).setDistance(0);
        for(Vertex item: vertices){
            unvisited.add(item);
        }
        while(unvisited.size() > 0){
            Vertex<Integer> temp = unvisited.poll();
            for(int i=0;i<graph.length;i++){
                if(graph[source][i] != 0 && unvisited.contains(vertices.get(i)) && graph[source][i] < vertices.get(i).getDistance()){
                    vertices.get(i).setDistance(graph[source][i] + vertices.get(source).getDistance());
                    unvisited.remove(vertices.get(source));
                    unvisited.add(vertices.get(source));
                }
            }
            source = vertices.indexOf(unvisited.peek());
        }
    }
}
