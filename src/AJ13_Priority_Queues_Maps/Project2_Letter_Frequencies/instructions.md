# Maps

In computer science, a **map** is a collection of key, value pairs. Maps get their name from the fact that keys are mapped to values, meaning that they’re linked together. In a map, we look up a key to get a value.

Python dictionaries are just like maps in Java!

**Keys** are what we use to look up a value. Keys must be unique and immutable, meaning that they can’t be changed after they're created.

**Values** are what we get when we look up a key. Keys can only be mapped to one value. However, a value can be of any type/data structure, including data structures composed of multiple elements!

These are the core operations for any Map implementation:
* **Insert**: Inserts a key, value pair into the map.
* **Has**: returns true if the map contains the provided key, false otherwise.
* **Get**: returns the value associated with the provided key.
* **Put**: updates the value associated with the given key with the new value.
* **Remove**: removes identified key from the map and returns the value associated with the removed key.
* **Size**: returns the size of the map (number of keys).

Maps can either be ordered or unordered. Ordered maps are often implemented with a binary search tree. Unordered maps are often implemented with a hash table. We'll be learning more about these data structures in the future!

# Using a Java Map

[Click Here For Reference Code](https://repl.it/@JuniLearning/AJ13-Maps)

[Click Here for JavaDocs](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Map.html)

In Java, the Map interface that has two main implementations: the TreeMap and the HashMap. The TreeMap is ordered and implemented with a binary search tree. The HashMap is unordered, and implemented with a hashtable. The HashMap is generally faster than the TreeMap, so we should use it unless we need our Map to be ordered.

# Project 2: Letter Frequencies Instructions

Analyze how many times each letter appears in a sentence and determine which one appears the most. First, ask the user for a sentence. Then convert the sentence into a map, where the keys are the letters and the values are the frequencies. Print each letter with its corresponding frequency. Finally, find and print the letter with the highest frequency!

[Click Here for Demo Video](https://static.junilearning.com/java_level_3/aj_13_letter_frequencies.mp4)
