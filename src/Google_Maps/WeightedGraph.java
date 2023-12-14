package Google_Maps;

import java.util.*;

public class WeightedGraph<T, W> implements Network<T,W>{

    private Map<T, HashMap<T, W>> map = new HashMap<>();
    private int numEdges = 0;

    @Override
    public int getVertexCount() {
        return map.size();
    }

    @Override
    public int getEdgesCount() {
        return numEdges;
    }

    @Override
    public boolean hasVertex(T vertex) {
        if(map.get(vertex) != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean hasEdge(T source, T destination) {
        if(map.get(source) != null && map.get(source).get(destination) != null){
            return true;
        }
        return false;
    }

    @Override
    public void addVertex(T vertex) {
        if(!this.hasVertex(vertex)) {
            map.put(vertex, new HashMap<T, W>());
        }
    }

    @Override
    public void addEdge(T source, T destination) {
        addEdge(source, destination, null);
    }

    @Override
    public void addEdge(T source, T destination, W weight) {
        addVertex(source);
        addVertex(destination);
        map.get(source).put(destination, weight);
        map.get(destination).put(source, weight);
        numEdges++;
    }

    @Override
    public HashMap<T, W> getEdges(T vertex) {
        return map.get(vertex);
    }

    public String toString() {
        String string = "";
        for(T vertex : map.keySet()){
            string = string + vertex.toString() + ": {";
            HashMap<T, W> vertexx = map.get(vertex);
            HashMap<T, W> hashmap = vertexx;
            for(T edge : vertexx.keySet()){
                string = string + "(" + edge.toString() + ", " + vertexx.get(edge) + ")";
            }
            string = string + "}\n";
        }
        return string;
    }
}
