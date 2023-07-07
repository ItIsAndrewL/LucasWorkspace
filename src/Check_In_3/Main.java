package Check_In_3;

import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {

    ///////////////////////////
    // SUSTAINABLE PROGRAMMING
    //////////////////////////

    //Sustainable-1,2: What is a nested class? What are the two main types of nested classes? What are their major differences?

    //Sustainable-3: Write a static nested class called Riddle that stores a riddle and an answer. Instantiate the class and print out the riddle and the answer in this method.

    //Sustainable-4: What are generics? Why are they useful?

    //Sustainable-5: Complete the generic class Triple that stores objects of three generic types. Write a constructor and a toString() method. Then instantiate your class in this method to test it.

    //Sustainable-6: What is an exception? What happens when an exception is thrown?

    //Sustainable-7,8: Create a FalseAlarmException class and throw a FalseAlarmException between setting the variable `state` and printing it out. Then catch the exception with a try-catch block.
    String state = "";
    state = "Everything is fine"; // This is where state is being "set"
    System.out.println(state);

    //Sustainable-9: Say we’re trying to get user input with a scanner. If a user types a string when the scanner is expecting an integer, an exception will be thrown and the program will end.
    // Modify the code below so that the program asks for a number until it receives one. Note: Once an exception is thrown you will need to clear the scanner of input by calling scanner.nextLine();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    ///////////////////////////
    // LINKED LISTS
    //////////////////////////

    // LinkedList-1: What is a singly-linked list? Compared to an ArrayList, what advantages and disadvantages does it have?

    // LinkedList-2: Without looking at any previous code, complete the Node inner class in LinkedList.java that has been provided in the starter code. When you’re finished, compare it to what you wrote previously.

    // LinkedList-3: Let's extend our LinkedList class. Write an indexOf() method that takes in an item and returns the index of the item in the list. Return -1 if the item doesn't exist in the list.

    //LinkedList-3: Create a LinkedList that contains at least 5 different strings. Test your method by looking up strings that do and don't exist in the list!

    // LinkedList-4: What is a doubly linked list? Compared to a singly linked-list, what advantages and disadvantages does it have?

    // LinkedList-5: Finish the Node inner class in the DoublyLinkedList so that it could be used in a doubly linked list. When you’re finished, compare it to what you wrote previously.

    // LinkedList-6: Let's extend our DoublyLinkedList class. Write a remove() method that takes in an item and removes it from the doubly-linked list. Return true if an item is removed, and false if the item isn't in the list.

    // LinkedList-6: Create a DoublyLinkedList of integers from 0-10. Test your method by printing the list and the length of the list before and after the deletion.

    ///////////////////////////
    // STACKS
    //////////////////////////

    // Stacks-1: What is a stack? What operations does it have? What does it mean to be LIFO?

    // Stacks-2,3: Push every letter of the word "toad" onto a stack. Pop from the stack until it only contains the word "to". You can use java's implementation of a stack.

    // Stacks-4: What data structures can be used to implement a stack?

    // Stacks-5: Write a method that takes in a string of key presses and returns the word that the key presses produce. A "#" in the string of key presses represents hitting the backspace button.
    System.out.println(applyBackspaces("ab#cdef##c"));

    ///////////////////////////
    // QUEUES
    //////////////////////////

    // Queue-1: What is a queue? What operations does it have? What does it mean to be FIFO?

    // Queue-2: Create a queue that stores the names of five colors: (You can use java's implementation of a queue)
    // “green”, “blue”, “red”, “orange”, “yellow”

    // Queue-2,3: Deque and enqueue until the colors are arranged in rainbow order: “red”, “orange”, “yellow”, “green”, “blue”.

    // Queue-4: What data structures can be used to implement a queue?

    // Queue-5: What is a priority queue? How is it different from a queue?

    // Queue-6,7: Use a priority queue to create a sorted list of 10 random numbers. Then dequeue and print every item in the queue! (Use Java's priority queue)

    // Queue-8: Can you think of some situations when queues may be useful?

    ///////////////////////////
    // MAPS
    //////////////////////////

    // Map-1: What is a map?

    // Map-2: Henry wants to create a map that pairs his friend’s names with their ages. Combine the two parallel lists into a map! (Use java's implementation of a map)

    String[] names = {"Joe", "Phil", "Cheyenne", "Josh", "Ryan", "Samantha", "Nate", "Addie", "Nichole", "Raegan", "Caroline"};
    int[] ages = {22, 23, 21, 18, 18, 25, 24, 22, 21, 20, 19};


    // Map-3,4: Iterate through the map and print out each name and age on a separate line.

    // Map-5: Check if Henry’s friend “Kyle” is in the map. If he is, print “Kyle is in the map!”. If he’s not, add him to the map. Kyle is 22 years old.

    // Map-6: Henry has a second friend named Joe, but he’s 21 years old. Add this second Joe to the map.

    //Map-6: Now that you’ve added the second Joe, print the map. What do you notice? Why is this the case?

    // Map-7: Can you think of some situations when maps may be useful?

  }

  // TODO: Write Riddle Class Here

  private static class Triple<A,B,C> {
    // TODO: Complete Class
  }

  public static String applyBackspaces(String message){
    //TODO: write method
    return null;
  }

}