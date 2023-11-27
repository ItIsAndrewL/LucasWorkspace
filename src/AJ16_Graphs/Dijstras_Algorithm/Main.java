package AJ16_Graphs.Dijstras_Algorithm;

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

        //adjacency matrix
        int[][] graph = new int[][] {/*
                        0  1  2  3  4
                /*0*/ { 0, 0, 3, 2, 0},
                /*1*/ { 0, 0, 0, 6, 1},
                /*2*/ { 3, 0, 0, 2, 5},
                /*3*/ { 2, 6, 2, 0, 0},
                /*4*/ { 0, 1, 5, 0, 0}};

        System.out.println("\nDijkstra's Shortest Path:\n");
        ShortestPathTree tree = new ShortestPathTree();
        tree.dijkstra(graph, 0);
        System.out.println(tree.vertices.get(0).getDistance());
        System.out.println(tree.vertices.get(1).getDistance());
        System.out.println(tree.vertices.get(2).getDistance());
        System.out.println(tree.vertices.get(3).getDistance());
        System.out.println(tree.vertices.get(4).getDistance());

        int[][] graph2 = new int[][] {/*
                        0  1  2  3  4  5  6
                /*0*/ { 0, 1, 0, 0, 2, 0, 0},
                /*1*/ { 1, 0, 14, 2, 0, 30, 0},
                /*2*/ { 0, 14, 0, 0, 0, 8, 1},
                /*3*/ { 0, 2, 0, 0, 3, 4, 0},
                /*4*/ { 2, 0, 0, 3, 0, 0, 0},
                /*5*/ { 0, 30, 8, 4, 0, 0, 0},
                /*6*/ { 0, 0, 1, 0, 0, 0, 0}};

        System.out.println("\nDijkstra's Shortest Path Part 2:\n");
        ShortestPathTree treer = new ShortestPathTree();
        treer.dijkstra(graph2, 0);
        for(int i=0;i<7;i++){
            System.out.println(treer.vertices.get(i));
        }
    }
}

