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
        for(Location location: locations.values()){
            location.setAll(Double.MAX_VALUE, null);
        }
        locations.get(start).setAll(0, null);
        for(Location location : locations.values()){
            unvisited.add(location);
        }
        while(unvisited.size() > 0){
            Location current = unvisited.poll();
            HashMap<String, Double> currentmap = graph.getEdges(current.getName());
            for(String neighbor: currentmap.keySet()){
                if(!unvisited.contains(neighbor) && current.getDistance() + currentmap.get(neighbor) < locations.get(neighbor).getDistance()){
                    Location updated = locations.get(neighbor);
                    updated.setAll( current.getDistance() + currentmap.get(neighbor), current);
                    unvisited.remove(updated);
                    unvisited.add(updated);
                }
            }
            if(unvisited.contains(locations.get(end))){
                break;
            }
        }
    }
}
