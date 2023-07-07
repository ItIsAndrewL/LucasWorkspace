package AJ13_Priority_Queues_Maps.Project2_Letter_Frequencies;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sanner= new Scanner(System.in);
        String curleadstr = "";
        int curleadint = -1;
        String perleadstr = "";
        int perleadint = -1;
        System.out.println("Type in a sentence: ");
        String sentence = sanner.nextLine();
        sanner.close();
        Map<String, Integer> letfreq = new TreeMap<>();

        int senlen = sentence.length();
        for(int i=0;i<senlen-1;i++){
            if(!sentence.substring(i, i+1).equals(" ")) {
                if (letfreq.containsKey(sentence.substring(i, i + 1)) == false) {
                    letfreq.put(sentence.substring(i, i + 1), 1);
                } else {
                    letfreq.put(sentence.substring(i, i + 1), letfreq.get(sentence.substring(i, i + 1)) + 1);
                }
            }
        }

        int it = 0;
        while(letfreq.isEmpty() == false){
            if(it >= letfreq.keySet().size()){
                it = 0;
                System.out.println(curleadstr + ": " + curleadint);
                letfreq.remove(curleadstr);
                curleadstr = "";
                curleadint = -1;
            }
            else{
                for(String i : letfreq.keySet()){
                    if(letfreq.get(i) > curleadint){
                        curleadstr = i;
                        curleadint = letfreq.get(i);
                        if(letfreq.get(i) > perleadint){
                            perleadstr = i;
                            perleadint = letfreq.get(i);
                        }
                    }
                    it++;
                }
            }
        }
        System.out.println("The most used letter was " + perleadstr + " with a total of " + perleadint + " uses!");
    }
}
