package AJ16_Graphs.EulerianMailCircuit;

import AJ16_Graphs.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class UndirectedGraph<T> implements Graph<T> {
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
        if(!this.hasVertex(vertex)){
            map.put(vertex, new ArrayList<T>());
        }
    }

    @Override
    public void addEdge(T source, T destination) {
        if(!this.hasVertex(source)){
            addVertex(source);
        }
        if(!this.hasVertex(destination)){
            addVertex(destination);
        }
        ArrayList<T> arr = map.get(source);
        arr.add(destination);
        map.put(source, arr);
        numEdges++;
    }

    public String toString(){
        String string = "";
        //for(int i=0;i<this.getVertexCount();i++){
        //
        //}
        for(T key : map.keySet()){
            string = string + key + ": ";
            for(T iter : map.get(key)){
                string = string + iter + " ";
            }
            string = string + "\n";
        }
        return string;
    }
}
