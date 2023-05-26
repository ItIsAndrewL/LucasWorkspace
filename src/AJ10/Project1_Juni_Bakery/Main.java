package AJ10.Project1_Juni_Bakery;
class Main {
  public static void main(String[] args) {

    Bakery juniBakery = new Bakery("Juni Bakery", "Juni Street");

    juniBakery.hireWorkers(2);
    juniBakery.addBakedGoods(1);
    System.out.println(juniBakery);
  }
}
/*What are the 3 main elements of a java class, and what do they do?
Answer Here: 1) 2) 3)

What does the private access modifier do?
Answer Here:

Can you think of some cases in which we would want to use encapsulation and mark our fields as private?
Hint: In class I mentioned the case when our phone stores our Social Security Number (SSN), and how we don't want just any other code (say the Jetpack Joyride game) to have access to our SSN.

Answer Here:*/


/*
Nested class - is a class inside of a class
Two types:
static nested class
  regular classes that have been put inside of another class for convenience

inner class
  create objects that live inside of an instance.

*/
