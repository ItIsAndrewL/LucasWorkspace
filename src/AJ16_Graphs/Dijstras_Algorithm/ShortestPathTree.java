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
                Vertex sourc = vertices.get(source);
                Vertex current = vertices.get(i);
                if(graph[source][i] != 0 && unvisited.contains(current) && graph[source][i] + sourc.getDistance() < current.getDistance()){
                    current.setDistance(graph[source][i] + sourc.getDistance());
                    current.setPrevious(sourc);
                    unvisited.remove(current);
                    unvisited.add(current);
                }
            }
            source = vertices.indexOf(unvisited.peek());
        }
    }
}
