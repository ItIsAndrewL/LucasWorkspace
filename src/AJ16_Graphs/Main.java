package AJ16_Graphs;

import java.util.*;

class Main {
    public static void main(String args[]){
        DirectedGraph<Integer> groph = new DirectedGraph<>();
        groph.addVertex(5);
        groph.addVertex(7);
        groph.addVertex(2);
        groph.addEdge(2, 5);
        groph.addEdge(5, 7);
        groph.addEdge(2, 7);
        groph.addVertex(5);
        System.out.println(groph.hasEdge(2, 7));
        System.out.println(groph.hasEdge(5, 2));
        System.out.println(groph.getVertexCount());
        System.out.println(groph.getEdgesCount());
        System.out.println(groph);
    }
}