package Google_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        WeightedGraph<String, Double> map = new WeightedGraph<>();
        HashMap<String, Location> locations = new HashMap<>();
        //map.addEdge("Google", "Juni", 5);
        //System.out.println(map);
        Scanner scan = new Scanner(System.in);
        String input = "C:\\Users\\lucas.briddle\\IdeaProjects\\LucasWorkspaceCloud\\src\\Google_Maps\\nyc.txt";
        File file = new File(input);
        try{
            Scanner text = new Scanner(file);
            System.out.println("Starting...");
            while(text.hasNextLine()){
                String[] line = text.nextLine().split(" ");
                String[] coordinates1 = line[0].split(",");
                String[] coordinates2 = line[1].split(",");
                String[] locationnames = line[3].split("--");
                double latitude1 = Double.parseDouble(coordinates1[0]);
                double longitude1 = Double.parseDouble(coordinates1[1]);
                double latitude2 = Double.parseDouble(coordinates2[0]);
                double longitude2 = Double.parseDouble(coordinates2[1]);
                double distance = Double.parseDouble(line[2]);
                String location1 = locationnames[0];
                String location2 = locationnames[1];
                Location locationa = new Location(location1, latitude1, longitude1);
                Location locationb = new Location(location2, latitude2, longitude2);
                locations.putIfAbsent(location1, locationa);
                locations.putIfAbsent(location2, locationb);
                map.addEdge(location1, location2, distance);
            }
            text.close();

            System.out.println("Locations Loaded!");
            System.out.println();
            System.out.println("LOCATIONS:");
            for(String name : locations.keySet()){
                System.out.println(name);
            }
            //System.out.println(map);
            while(true){
                System.out.println("\nEnter a location:");
                String start = scan.nextLine();
                System.out.println("\nEnter a destination:");
                String end = scan.nextLine();
                if(locations.get(start) != null && locations.get(end) != null){

                }
                else{
                    System.out.println("Those are not valid locations!");
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
