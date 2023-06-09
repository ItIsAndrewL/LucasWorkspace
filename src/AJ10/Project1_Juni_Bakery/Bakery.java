package AJ10.Project1_Juni_Bakery;
import java.util.*;

public class Bakery {
  private String name;
  private String address;
  private ArrayList<BakedGood> bakedGoods = new ArrayList<>();
  private ArrayList<Worker> workers = new ArrayList<>();

  public Bakery(String n, String a) {
    name = n;
    address = a;
  }

  // NESTED BAKEDGOODS CLASS ----------------------------------------
  private final class BakedGood {
    private String name;
    private String[] ingredients;
    private int numIngredients;
    private String flavour;
    private int batchSize;

    public BakedGood(String n, String[] i, int ni, String f, int b) {
      name = n;
      ingredients = i;
      numIngredients = ni;
      flavour = f;
      batchSize = b;
    }

    public String getFlavour() {
      return flavour;
    }

    public int getNumIngredients() {
      return numIngredients;
    }

    public void setBatchSize(int b) {
      batchSize = b;
    }

    private String returnIngredients() {
      String ingredientsList = "";

      for (int i = 0; i < numIngredients; i++) {
        if (i < numIngredients - 1) {
          ingredientsList += ingredients[i] + ", ";
        } else {
          ingredientsList += ingredients[i];
        }
      }
      return ingredientsList;
    }

    public String toString() {
      return name + "\n\tFlavour: " + flavour + "\n\tIngredients: " + returnIngredients();
    }
  }

  // NESTED WORKER CLASS --------------------------------------------
  private final class Worker {
    private String name;
    private String position;
    private boolean employeeOfTheMonth;
    private double salary;
    private int number;

    public Worker(String n, String p, boolean e, double s) {
      name = n;
      position = p;
      employeeOfTheMonth = e;
      salary = s;
    }

    public String getName() {
      return name;
    }

    public double getSalary() {
      return salary;
    }

    public void giveRaise(double raiseIncrease) {
      salary += raiseIncrease;
    }

    public boolean isEmployeeOfTheMonth() {
      return employeeOfTheMonth;
    }

    public void makeEmployeeOfTheMonth() {
      employeeOfTheMonth = true;
    }

    public String getPosition(){
      return position;
    }

    public void changePosition(String p){
      position = p;
    }

    public String toString() {
      String s = "Name: " + name + "\n\tPosition: " + position + "\n\tSalary: $" + String.format("%.2f", salary) + " per hour";

      if (employeeOfTheMonth) {
        s += "\n\tEmployee of the Month";
      }

      return s;
    }
  }

  //PROVIDED METHODS ------------------------------------------------
  public String getName() {
    return name;
  }
  public String getAddress() {
    return address;
  }
  public int getNumWorkers() {
    return workers.size();
  }

  //BAKERY METHODS --------------------------------------------------

  /**
   * creates the given number of Worker objects and adds them to the workers ArrayList
   * @param numWorkers - the number of Worker objects to create
   **/
  public void hireWorkers(int numWorkers) {
      Scanner s = new Scanner(System.in);
      for (int i = 1; i <= numWorkers; i++) {
        System.out.println("Please enter the Worker " + i + "'s name: ");
        String name = s.nextLine();
        System.out.println("Please enter the Worker " + i + "'s position: ");
        String position = s.nextLine();
        System.out.println("Please enter the Worker " + i + "'s employee of the month status (\"True\" or \"False\"): ");
        String employeemonth = s.nextLine();
        boolean employeebool;
        if (employeemonth == "True") {
          employeebool = true;
        }
        else {
          employeebool = false;
        }
        System.out.println("Please enter the Worker " + i + "'s salary: ");
        String salary = s.nextLine();
        double salarydouble = Double.parseDouble(salary);
        Worker w = new Worker(name, position, employeebool, salarydouble);
        workers.add(w);
      }
  }

  public Worker printWorkers(int requestedworker){
    return workers.get(requestedworker);
  }
  /**
   * creates the given number of BakedGood objects and adds them to the bakedGoods ArrayList
   * @param numBakedGoods - the number of BakedGood objects to create
   **/
  public void addBakedGoods(int numBakedGoods) {
    Scanner s = new Scanner(System.in);
    for (int i = 1; i <= numBakedGoods; i++) {
      System.out.println("Please enter Baked Good " + i + "'s name: ");
      String name = s.nextLine();
      System.out.println("Please enter the number of ingredients in Baked Good " + i);
      String numingredients = s.nextLine();
      int numingredient = Integer.parseInt(numingredients);
      String[] ingredients = new String[numingredient];
      System.out.println("Please enter Baked Good " + i + "'s ingredients: ");
      for(int j=0;j<numingredient;j++) {
        ingredients[j] = s.nextLine();
      }
      System.out.println("Please enter Baked Good " + i + "'s flavor: ");
      String flavor = s.nextLine();
      System.out.println("Please enter Baked Good " + i + "'s batch size: ");
      String batchsizes = s.nextLine();
      int batchsize = Integer.parseInt(batchsizes);
      BakedGood w = new BakedGood(name, ingredients, numingredient, flavor, batchsize);
      bakedGoods.add(w);
    }
  }
  public String toString() {
    String work = "";
    for(Worker w:workers){
      work+="\n";
      work+=w.toString();
    }
    String bake = "";
    for(BakedGood b:bakedGoods){
      bake+="\n";
      bake+=b.toString();
    }
    return "The bakery '" + name + "' can be found at " + address +". We currently employ " + workers.size() + " workers: "
            + work + "\n" + name + " currently has " + bakedGoods.size() + " baked goods to offer. Those baked goods are: " + bake;
  }
}