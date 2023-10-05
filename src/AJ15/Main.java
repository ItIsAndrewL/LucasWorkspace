package AJ15;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashbrown = new HashMap<>();
        hashbrown.insert(500, "ketchup");
        hashbrown.insert(1, "cheese");
        hashbrown.insert(7900000, "egg");
        hashbrown.insert(23, "salt");

        System.out.println(hashbrown.get(500));
        System.out.println(hashbrown.has(5000));
        System.out.println(hashbrown.has(23));
        System.out.println(hashbrown.remove(7900000));
        System.out.println(hashbrown.size());
        hashbrown.put(23, "pepper");
        System.out.println(hashbrown.toString());
        for(int i=24;i<60;i++){
            hashbrown.insert(i, "potato");
        }
    }
}
