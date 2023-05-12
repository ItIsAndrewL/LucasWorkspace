# Intro to Linked Lists

A **data structure** is a way to store a collection of data elements. Arrays and ArrayLists are two examples of simple data structures. Today we’ll be learning about another data structure called a linked list!

In an array, all data elements are stored **contiguously**, meaning that they’re side by side in memory. This can make it difficult to insert or delete elements. For example, if you were to insert an element, you would have to shift all the succeeding elements up one to make room for the new element. If you were to delete an element, you would have to move all the succeeding elements down one to fill the empty space.

**Linked lists** are built to solve these problems. Like arrays, they also store a collection of elements, but the elements don’t have to be next to each other in memory. Instead, a linked list is made up of a series of nodes that are linked together.

Each **node** contains two things: the data, and a link to the next node in the list. The **link** tells the computer where to find the next element in memory, so they don’t have to be right next to each other!

# Singly Linked Lists

A **singly linked list** is only linked in one direction. That means it’s kind of like a one way street or an escalator that only goes down.
![Singly Linked List Concept Image](https://static.junilearning.com/java_level_3/singlyLinkedList.png)

If we want to get a particular element, we have to start at the beginning and move forward through the list. Once we move forward we can’t move back, unless we want to start all over.

The **head** is the first node in a linked list. It doesn’t store any data, but it does tell us where the linked list begins.

The last node points at **null**, which means nothing. In a singly linked list there’s no way to reach the last node without starting at the beginning and traversing the entire list.

# AJ11 Project 1: Singly Linked List Instructions

A singly linked list consists of nodes that are linked together, but not necessarily next to each other in memory. Each node contains a piece of data and a reference to the next node in the list. Implement a singly linked list given the List interface.

[Video Link](https://static.junilearning.com/java_level_3/aj_11_linked_list.mp4)