# Doubly Linked List Concept

A doubly linked list differs from a singly linked list because it’s linked in both directions. We can move both forwards and backwards!
![Doubly Linked List Image](https://static.junilearning.com/java_level_3/doublyLinkedList.png)

Along with a head, a doubly linked list has a tail, which is the last node in the list. 
The tail doesn’t store any data, but it does tell us where our list ends so that we can traverse it backwards.

A doubly linked list allows us more flexibility, but it requires more memory; each node has to store two references instead of one. 
We have to decide which implementation is better suited for our needs.


# Project 2 Instructions

A doubly linked list consists of nodes that are linked together, both forwards and backwards. 
Each node contains a piece of data, a reference to the previous node, and a reference to the next node. 
It also contains a head and a tail, which represent the beginning and end of the list respectively. 
Implement a doubly linked list given the `List` interface.

Bonus #1: Implement an `insertAt()` method that takes an index and a piece of data as input and inserts the data at that particular index.

Bonus #2: Implement a `deleteAt()` method that takes an index as input and deletes the node at that index.