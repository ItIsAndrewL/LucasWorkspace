package Google_Maps;

import java.util.*;

public class ShortestPath {

    WeightedGraph<String, Double> graph;

    HashMap<String, Location> locations;

    PriorityQueue<Location> unvisited = new PriorityQueue<>();

    public ShortestPath(WeightedGraph<String, Double> graph, HashMap<String, Location> locations){
        this.graph = graph;
        this.locations = locations;
    }

    public void FindShortestPath(String start, String end){
        for( : locations.keySet())
    }
}
