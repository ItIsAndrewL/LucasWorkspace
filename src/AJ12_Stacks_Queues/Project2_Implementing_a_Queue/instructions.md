# Queue


A **queue** is a data structure where we add to the back and remove from the front. “Queue” is a fancy word for a line that we wait in. 
Think of queues in computer science in the same way: new elements are added to the back of the line, and they wait until they get to the front to be removed.

A queue’s two basic functions are **enqueue**, in which a new item is added to the back, and **dequeue**, in which the first item (the first in) is removed from the front.

Because the first thing that we enqueue will be the first thing we dequeue, we call a queue a **First In First Out (FIFO)** data structure.

The queue we will be implementing will employ the following operations:
- **Enqueue** - add an item to the end of the queue.
- **Dequeue** - remove the item from the front from the queue.
- **Front** - return the item at the front of the queue.
- **Empty** - return true if the queue is empty.

A queue, like a stack, can be implemented via an array or a linked list.
**NOTE**: Try doing it with a queue :)

# Project 2 Instructions

A queue is a First In First Out (FIFO) data structure where we add to the back and remove from the front. There are many ways to implement a queue, but one of the simplest includes using an array. Using the starter code, implement a queue with an array.