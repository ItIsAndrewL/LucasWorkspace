# Priority Queues

A **priority queue** is similar to a queue, but the items are sorted by priority. The highest priority items are at the front and the lowest priority items are at the back. It has the following characteristics:
- Every element has a priority.
- An element with high priority is dequeued before an element with low priority.
- If two elements have the same priority, they are served according to their order in the queue

Other than sorting the elements by priority, a priority queue works the same way that a regular queue does. We dequeue from the front and enqueue to the back.

A priority queue is implemented with something called a **binary heap**. A heap is a type of tree data structure, in which items are organized in a hierarchy with multiple levels.

In a **min-heap**, the smallest value is at the top of the tree, and every succeeding level has bigger items. 
In a **max-heap**, the largest value is at the top of the tree, and every succeeding level has smaller items.

# Using a Java Priority Queue

[Reference Code Click Here](https://repl.it/@JuniLearning/AM13-Priority-Queue)

[JavaDocs Click Here](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html)

By default, the Java priority queue orders elements according to their **natural ordering**. 
Natural ordering is specified by all objects that implement the `Comparable` interface. We can order elements a different way by passing a Comparator object to the priority queue constructor.

# Project 1: Class Rank Instructions

Use a `PriorityQueue` to sort students according to their GPA. Create a `Student` class that stores the name and GPA of a student. Then create a `StudentComparator` class that compares two students according to their GPA. Then add 3 students to a priority queue, and poll from the queue until it’s empty. The students should come out of the queue in order from highest to lowest GPA - the priority queue will sort the students for us!

[Click Here For Demo Video](https://static.junilearning.com/java_level_3/aj_13_class_rank.mp4)