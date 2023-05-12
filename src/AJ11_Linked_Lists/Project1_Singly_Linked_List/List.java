package AJ11_Linked_Lists.Project1_Singly_Linked_List;

/*
List Interface:
This interface is to be used to create the linked list!
Not to be confused with the java.util.List interface.
This is a simplified version to be used with this project.
*/

public interface List<T>  {

    //returns the length of the list
    int getLength();

    //returns true if the is empty
    boolean isEmpty();

    //inserts a new node at the front
    void insertFront(T t);

    //inserts a new node at the back
    void insertBack(T t);

    //removes the first node
    void removeFront();

    //removes the last node
    void removeBack();

    //returns the data (of type "T") at the given index. Throws an IndexOutOfBounds exception if the index isn't in the list
    T get(int index);

    //deletes everything in the list
    boolean clearAll();
}

