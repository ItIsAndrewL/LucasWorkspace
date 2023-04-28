# Concept: Exception Handling

[Click Here for Reference Code](https://repl.it/@JuniLearning/AJ10-Exceptions)

Exceptions alert us when something has gone wrong in our program.

```java
class Main {
  public static void main(String[] args) {
    // Throwing an exception
    try {
      throw new IndexOutOfBoundsException();
    } catch (IndexOutOfBoundsException e) { // catching an exception
      System.out.println("Caught IndexOutOfBoundsException");
    }
  }
}
```



Examples of exceptions:

- IndexOutOfBoundsException
- NullPointerException
- IllegalArgumentException

We can use exceptions to handle problems that arise in our code that are out of our control, without leaving it up to undefined behavior.

You can write your own exception by extending the `Exception` class, or any of its subclasses.

## Checked & Runtime Exceptions

**Runtime Exceptions** (aka Unchecked exceptions) - caused by factors *inside* the programs control, could be a logic error or un-expected variable value. 
Only catch these if you know how to fix it.

**Checked Exceptions** - caused by factors *outside* the programs control. Can occur during "normal" conditions, and can indicate an unexpected system state. 
Your program should always anticipate and respond to these. Examples: opening a file that does not exist, working with a stream that is closed, etc.

## Catch or Specify Rule

For **checked exceptions** only. You **must** either use a try-catch block or *specify* using the `throws` keyword on a method signature.
`public void doSomething() throws Exception`

# AJ10 Project 3: Exception Practice

The starter code includes four different methods that throw exceptions. Using try-catch blocks and method declarations, handle all the exceptions so that the program doesn't crash!

1) `printFile()` - The given file name doesn’t exist! Handle the FileNotFoundException.
2) `getInteger()` - Assuming that the user types in something other than an integer, handle the InputMismatchException.
3) `startsWithVowel()` - Assuming that the input word inevitably remains null, handle the NullPointerException.
4) `divide()` - Assuming that method tries to divide by zero, it will throw an ArithmeticException. In order to be more precise, create your own custom exception named DivideByZeroException, and throw it if the second number is 0.

[Project Video](https://static.junilearning.com/java_level_3/aj_10_exception_practice.mp4)