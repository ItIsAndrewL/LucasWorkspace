package AJ16_Graphs;

import java.util.*;

public class DirectedGraph<T> implements Graph<T>{
    private HashMap<T, ArrayList<T>> map = new HashMap<>();
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
        return map.containsKey(vertex);
    }

    @Override
    public boolean hasEdge(T source, T destination) {
        if(map.get(source) == null){
            return false;
        }
        for(int i=0;i<map.get(source).size();i++){
            if(map.get(source).get(i) == destination){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addVertex(T vertex) {
        map.put(vertex, null);
    }

    @Override
    public void addEdge(T source, T destination) {
        ArrayList<T> arr = map.get(source);
        arr.add(destination);
        map.put(source, arr);
        numEdges++;
    }
}
