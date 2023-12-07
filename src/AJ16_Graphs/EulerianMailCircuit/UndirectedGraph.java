package AJ16_Graphs.EulerianMailCircuit;

import AJ16_Graphs.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        arr = map.get(destination);
        arr.add(source);
        map.put(destination, arr);
        numEdges++;
    }

    public String toString(){
        String string = "";
        int oddcount = 0;
        HashMap<T, Boolean> visitor = new HashMap<>();
        T temp = null;
        for(T k : map.keySet()){
            visitor.put(k, false);
            temp = k;
        }
        isGraphConnected(visitor, temp);
        for(T v : visitor.keySet()){
            if(!visitor.get(v)){
                return "There is no valid route, this graph is unconnected";
            }
        }
        for(T k : map.keySet()){
            if(map.get(k).size()%2!=0){
                oddcount++;
            }
        }
        if(oddcount == 2){
            return "There is a Eulerian path";
        }
        else if(oddcount == 0){
            return "There is a Eulerian cycle";
        }
        else{
            return "There is no Eulerian path or cycle";
        }
    }
    public void isGraphConnected(HashMap<T, Boolean> visitor, T key){
        visitor.put(key, true);
        for(T i : map.get(key)){
            if(!visitor.get(i)){
                isGraphConnected(visitor, i);
            }
        }
    }
}
