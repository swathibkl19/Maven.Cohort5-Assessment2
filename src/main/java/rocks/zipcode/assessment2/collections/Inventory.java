package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    Map<String, Integer> storeInventory = new HashMap<String,Integer>();
    List<List<String>> arrList = new ArrayList<>();


    /**
         * @param strings list of strings to add / remove / fetch from
         */
    public Inventory(List<String> strings) {
        List<List<String>> arrList = new ArrayList<>();

        arrList.add(strings);
        arrList.removeAll((Collection<?>) storeInventory);
        arrList.containsAll((Collection<?>) storeInventory);

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        arrList.add(Collections.singletonList(item));


    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        arrList.removeAll(Collections.singleton(item));
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
       // return arrList.get(Integer.parseInt(item));
        return  null;
    }
}
