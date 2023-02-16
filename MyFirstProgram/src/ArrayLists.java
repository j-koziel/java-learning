import java.util.*;

public class ArrayLists {
  public static void main(String[] args) {
    // ArrayList is a resizable array where
    // elements can be added and removed after
    // the compilation phase
    // stores reference data types

    ArrayList<String> food = new ArrayList<String>();

    food.add("pizza");
    food.add("hamburger");
    food.add("hotdog");

    food.set(0, "sushi");
    food.remove(2);
    food.clear();
    
    // for (int i = 0; i < food.size(); i++) {
    //   System.out.println(food.get(i));
    // }

    
    // 2D ArrayList
    // A list of lists
    // The size of the lists can be changed during runtime
    
    ArrayList<ArrayList<String>> groceryList = new ArrayList();
    
    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    ArrayList<String> produceList = new ArrayList();
    produceList.add("tomatoes");
    produceList.add("zuchinni");
    produceList.add("peppers");

    ArrayList<String> drinksList = new ArrayList();
    drinksList.add("soda");
    drinksList.add("coffee");

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    System.out.println(groceryList.get(2).get(1));
  }
}
