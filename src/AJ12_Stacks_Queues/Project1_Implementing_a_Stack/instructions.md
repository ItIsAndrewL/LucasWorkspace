# Stacks

A **stack** is a data structure where we can only add and remove the last element. 
We often think of stacks as growing vertically instead of horizontally like we do with arrays and lists. 
Because of this, we call the end of the stack the **top**.

A stack’s two main functions are **push**, in which a new item is added to the top, and **pop**, in which we remove the item on top.

Because the last thing we push onto the stack will be the first thing we pop off, we call a stack a **Last In First Out (LIFO)** data structure.

The stack we will be implementing will employ the following operations:
- **Push** - add an item to the top of the stack.
- **Pop** - remove the most recently added item from the stack.
- **Top** - return the item on the top of the stack.
- **Empty** - return true if the stack is empty.

A stack can be implemented using either an array or a linked list. You can think of a stack as a new set of rules that are applied to a regular data structure (such as an array or linked list).

# AJ12 Project 1: Implementing a Stack

A stack is a Last In First Out (LIFO) data structure where we can only access the top. We can push to add something to the top, and we can pop to remove from the top. There are many ways to implement a stack, but one of the simplest involves an array. Using the starter code, implement a stack with an array.A stack is a Last In First Out (LIFO) data structure where we can only access the top. We can push to add something to the top, and we can pop to remove from the top. There are many ways to implement a stack, but one of the simplest involves an array. Using the starter code, implement a stack with an array.

**NOTE**: We decided to use a Linked List instead! So you shouldn't have to reference these instructions!
