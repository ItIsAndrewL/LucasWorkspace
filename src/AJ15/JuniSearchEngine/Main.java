package AJ15.JuniSearchEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import AJ15.Project1_HashMap.HashMap;
import java.util.ArrayList;

/*A simplified search engine that takes in keywords from standard input and finds the corresponding url(s). The search results are then printed to the console.*/

public final class Main {
    //C:\Users\lucas.briddle\IdeaProjects\LucasWorkspaceCloud\src\AJ15\JuniSearchEngine\tech.txt
    private static HashMap<String, ArrayList<String>> webstite = new HashMap<>(196533);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a filename");
        String input = scan.nextLine();
        input = "C:\\Users\\lucas.briddle\\IdeaProjects\\LucasWorkspaceCloud\\src\\AJ15\\JuniSearchEngine\\" + input;
        File file = new File(input);
        try{
            Scanner text = new Scanner(file);
            while(text.hasNextLine()){
                String link = text.nextLine();
                String[] keywords = text.nextLine().split(" ");
                for(int i=0;i<keywords.length;i++){
                    if(!webstite.has(keywords[i])){
                        ArrayList<String> current = new ArrayList<>();
                        webstite.insert(keywords[i], current);
                    }
                    ArrayList<String> current = webstite.get(keywords[i]);
                    current.add(link);
                }

            }
            text.close();
            while(true){
                System.out.println("Search: ");
                input = scan.nextLine();
                 //Loop through this, new line each time
                webstite.get(input).toArray();
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}