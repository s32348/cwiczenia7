import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Myszka"));
        items.add(new Item(2, "Klawiatura"));
        items.add(new Item(3, "Monitor"));
        items.add(new Item(4, "Glosnik"));
        items.add(new Item(5, "Drukarka"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
        HashMap<Integer, String> itemsMap=new HashMap<>();
        for(Item item:items){
            itemsMap.put(item.id, item.name);
        }
        for (Map.Entry<Integer, String> item : itemsMap.entrySet()) {
            System.out.println("ID: " + item.getKey() + ", Name: " + item.getValue());
        }

    }
}