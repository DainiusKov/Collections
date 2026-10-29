import java.util.*;

public class Task1{
  static void printAll(List<String> listName){for(String name:listName){
    System.out.println(name);
  }}

  public static void main(String[] args){
    /*List<String> shoppingList = new ArrayList<>();
    shoppingList.add("Milk");
    shoppingList.add("Butter");
    shoppingList.add("Cream");
    shoppingList.add("Yoghurt");
    shoppingList.add("Cheese");
    shoppingList.add("Chicken");
    shoppingList.add("Pork");
    shoppingList.add("Beef");
    shoppingList.add("Turkey");
    shoppingList.add("Mutton");*/
    List<String> shoppingList = new ArrayList<>(
            List.of("Milk","Butter","Cream","Yoghurt","Cheese"
            ,"Chicken","Pork","Beef","Turkey","Mutton"));
    printAll(shoppingList);
    shoppingList.remove("Turkey");

    System.out.println("");
    printAll(shoppingList);

    shoppingList.add(2,"Kefir");
    System.out.println("");
    printAll(shoppingList);

    //shoppingList.remove("Milk");

    if (shoppingList.contains("Milk")){System.out.println("There is Milk");}
      else{System.out.println("There is no Milk");}

    System.out.println(shoppingList.size());

    List<String> sorted = shoppingList.stream().sorted().toList();
    System.out.println("SORTED LIST:");
    printAll(sorted);

    List<String> sortedRev = shoppingList.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println("REVERSED SORTED LIST:");
    printAll(sortedRev);


  }
}
