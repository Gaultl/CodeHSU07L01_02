//import ArrayLists
import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        //create an ArrayList of Integers
        //format is ArrayList<E> listName = new ArrayList<E>();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(-573474);
        intList.add(-5082);
        intList.add(503);
        intList.add(839053);
        intList.add(56793);

        //create an ArrayList of Doubles
        ArrayList<Double> dubList = new ArrayList<Double>();
        dubList.add(1234.129304);
        dubList.add(12.34325);
        dubList.add(1.2929);
        dubList.add(4.03538);
        dubList.add(1.301182);

        //create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add(" my");
        stringList.add(" name");
        stringList.add(" is");
        stringList.add(" Leo");

        //print your list of Doubles
        System.out.println(dubList);

        //add a new value to the end list of Integers then print it
        intList.add(-84493);
        System.out.println(intList);

        //add a new value at a specific index in the Integer then print it
        intList.add(2, 57);
        System.out.println(intList);

        //get the item an index 4 in the Integer array list
        int index4 = intList.get(4);
        System.out.println(index4);

        //add a new value of 33 to the Integer array list and get its size
        intList.add(33);
        int size = intList.size();
        System.out.println(size);

        //set the item at index 3 to be 42.0 in the Doubles array, store that element, then
        // print the new list and the replaced value
        double replaced = intList.set(3, 42);
        System.out.println(intList);
        System.out.println(replaced);

        //remove the item at index 2 in the Integers array
        double removed = intList.remove(2);
        System.out.println(removed);
        System.out.println(intList);
        System.out.println(intList.size());



    }
}