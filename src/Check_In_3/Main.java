package Check_In_3;

import AJ13_Priority_Queues_Maps.Project1_Class_Rank.Student;
import AJ13_Priority_Queues_Maps.Project1_Class_Rank.StudentComparator;
import java.util.Map;

import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {

    ///////////////////////////
    // SUSTAINABLE PROGRAMMING
    //////////////////////////

    //Sustainable-1,2: What is a nested class? What are the two main types of nested classes? What are their major differences?

    //A nested class is a class within a class.

    //Sustainable-3: Write a static nested class called Riddle that stores a riddle and an answer. Instantiate the class and print out the riddle and the answer in this method.

    /*Riddle map = new Riddle("something something", "a map");
    System.out.println(map.riddle);
    System.out.println(map.answer);

    //Sustainable-4: What are generics? Why are they useful?

    //A generic is a placeholder for a variable whos type has not yet been defined. this is useful because we can make classes that can hold different
    //types of variables in them

    //Sustainable-5: Complete the generic class Triple that stores objects of three generic types. Write a constructor and a toString() method. Then instantiate your class in this method to test it.

    Triple<Integer, String, Double> three = new Triple<>(1, "tree", 6.5);
    System.out.println(three);

    //Sustainable-6: What is an exception? What happens when an exception is thrown?

    //An exception is an exception that would normally break our code. When an exception is thrown, it displays an error message and stops the program.

    //Sustainable-7,8: Create a FalseAlarmException class and throw a FalseAlarmException between setting the variable `state` and printing it out. Then catch the exception with a try-catch block.
    String state = "";
    // This is where state is being "set"
    state = "Everything is fine";
    try{
      throw new FalseAlarmException();
    } catch(FalseAlarmException e){
      System.out.println("Nothing is fine");
    }
    System.out.println(state);

    //Sustainable-9: Say we’re trying to get user input with a scanner. If a user types a string when the scanner is expecting an integer, an exception will be thrown and the program will end.
    // Modify the code below so that the program asks for a number until it receives one. Note: Once an exception is thrown you will need to clear the scanner of input by calling scanner.nextLine();
    Scanner scanner = new Scanner(System.in);
    while(1 == 1) {
      System.out.print("Enter a number: ");
      try{
        int number = scanner.nextInt();
        break;
      } catch(InputMismatchException e){
        scanner.nextLine();
        System.out.println("No,");
      }
    }*/

    ///////////////////////////
    // LINKED LISTS
    //////////////////////////

    // LinkedList-1: What is a singly-linked list? Compared to an ArrayList, what advantages and disadvantages does it have?

    // LinkedList-2: Without looking at any previous code, complete the Node inner class in LinkedList.java that has been provided in the starter code. When you’re finished, compare it to what you wrote previously.

    // LinkedList-3: Let's extend our LinkedList class. Write an indexOf() method that takes in an item and returns the index of the item in the list. Return -1 if the item doesn't exist in the list.

    //LinkedList-3: Create a LinkedList that contains at least 5 different strings. Test your method by looking up strings that do and don't exist in the list!

    /*LinkedList<String> strung = new LinkedList<>();
    strung.insertBack("puppy");
    strung.insertBack("fire");
    strung.insertBack("pixel");
    strung.insertBack("P03");
    strung.insertBack("Stoat");
    System.out.println(strung.indexOf("Stoat"));
    System.out.println(strung.indexOf("kittens"));

    // LinkedList-4: What is a doubly linked list? Compared to a singly linked-list, what advantages and disadvantages does it have?

    // LinkedList-5: Finish the Node inner class in the DoublyLinkedList so that it could be used in a doubly linked list. When you’re finished, compare it to what you wrote previously.

    // LinkedList-6: Let's extend our DoublyLinkedList class. Write a remove() method that takes in an item and removes it from the doubly-linked list. Return true if an item is removed, and false if the item isn't in the list.

    DoublyLinkedList<String> strang = new DoublyLinkedList<String>();
    strang.insertBack("puppy");
    strang.insertBack("fire");
    strang.insertBack("pixel");
    strang.insertBack("P03");
    strang.insertBack("Stoat");
    System.out.println(strang.remove("pixel"));
    System.out.println(strang.remove("pixel"));
    System.out.println(strang);*/
    // LinkedList-6: Create a DoublyLinkedList of integers from 0-10. Test your method by printing the list and the length of the list before and after the deletion.

    ///////////////////////////
    // STACKS
    //////////////////////////

    // Stacks-1: What is a stack? What operations does it have? What does it mean to be LIFO?

    // Stacks-2,3: Push every letter of the word "toad" onto a stack. Pop from the stack until it only contains the word "to". You can use java's implementation of a stack.

    /*Stack<String> frog = new Stack<>();
    frog.push("t");
    frog.push("o");
    frog.push("a");
    frog.push("d");
    frog.pop();
    frog.pop();
    System.out.println(frog);
    // Stacks-4: What data structures can be used to implement a stack?

    // Stacks-5: Write a method that takes in a string of key presses and returns the word that the key presses produce. A "#" in the string of key presses represents hitting the backspace button.
    System.out.println(applyBackspaces("ab#cdef##c"));*/
    ///////////////////////////
    // QUEUES
    //////////////////////////

    // Queue-1: What is a queue? What operations does it have? What does it mean to be FIFO?

    // Queue-2: Create a queue that stores the names of five colors: (You can use java's implementation of a queue)
    // “green”, “blue”, “red”, “orange”, “yellow”

    /*Queue<String> color = new java.util.LinkedList();
    color.add("green");
    color.add("blue");
    color.add("red");
    color.add("orange");
    color.add("yellow");

    // Queue-2,3: Deque and enqueue until the colors are arranged in rainbow order: “red”, “orange”, “yellow”, “green”, “blue”.

    color.remove();
    color.remove();
    color.add("green");
    color.add("blue");
    System.out.println(color);

    // Queue-4: What data structures can be used to implement a queue?

    // Queue-5: What is a priority queue? How is it different from a queue?

    // Queue-6,7: Use a priority queue to create a sorted list of 10 random numbers. Then dequeue and print every item in the queue! (Use Java's priority queue)

    PriorityQueue<Integer> pQueue = new PriorityQueue<>(10);
    for(int i=0;i<9;i++){
      pQueue.add((int)(Math.random() * 20));
    }
    for(int i=0;i<9;i++){
      System.out.println(pQueue.remove());
    }*/

    // Queue-8: Can you think of some situations when queues may be useful?

    ///////////////////////////
    // MAPS
    //////////////////////////

    // Map-1: What is a map?

    //A map is a data structure where each node has both a key and a data value

    // Map-2: Henry wants to create a map that pairs his friend’s names with their ages. Combine the two parallel lists into a map! (Use java's implementation of a map)

    String[] names = {"Joe", "Phil", "Cheyenne", "Josh", "Ryan", "Samantha", "Nate", "Addie", "Nichole", "Raegan", "Caroline"};
    int[] ages = {22, 23, 21, 18, 18, 25, 24, 22, 21, 20, 19};

    Map<String, Integer> namage = new TreeMap<>();
    for(int i=0;i<=names.length-1;i++){
      namage.put(names[i], ages[i]);
    }

    // Map-3,4: Iterate through the map and print out each name and age on a separate line.

    for(int i=0;i<=names.length-1;i++){
      System.out.println(names[i]);
      System.out.println(namage.get(names[i]));
    }

    // Map-5: Check if Henry’s friend “Kyle” is in the map. If he is, print “Kyle is in the map!”. If he’s not, add him to the map. Kyle is 22 years old.

    boolean kyle = false;
    for(int i=0;i<=names.length-1;i++){
      if(names[i] == "Kyle" && namage.get(names[i]) == 22){
        System.out.println("Kyle is in the map!");
        kyle = true;
        break;
      }
    }
    if(kyle == false){
      System.out.println("Kyle has not been found.");
    }

    // Map-6: Henry has a second friend named Joe, but he’s 21 years old. Add this second Joe to the map.

    namage.put("Joe", 21);

    //Map-6: Now that you’ve added the second Joe, print the map. What do you notice? Why is this the case?

    for(int i=0;i<=names.length-1;i++){
      System.out.println(names[i]);
      System.out.println(namage.get(names[i]));
    }

    // Map-7: Can you think of some situations when maps may be useful?

  }

private static class Riddle{
    public String riddle;
    public String answer;
    public Riddle(String r, String a){
      this.riddle = r;
      this.answer = a;
    }
}

  private static class Triple<A,B,C> {
    private A a;
    private B b;
    private C c;
    public Triple(A a, B b, C c){
      this.a = a;
      this.b = b;
      this.c = c;
    }
    public String toString(){
      return "It's " + a + " " + b + " " + c;
    }
  }

  public static String applyBackspaces(String message){
    Stack<String> keyboard = new Stack<>();
    for(int i=0;i<message.length();i++){
      if(message.substring(i, i+1).equals("#")){
        keyboard.pop();
      }
      else{
        keyboard.push(message.substring(i, i+1));
      }
    }
    String result = keyboard.toString();
    return result;
  }

}