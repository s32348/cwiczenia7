import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(6, "Pomidor"));
        items.add(new Item(7, "Jajka"));
        items.add(new Item(8, "Masło"));
        items.add(new Item(9, "Bułka"));
        items.add(new Item(10, "Kawa"));
        items.add(new Item(11, "Boczek"));
        items.add(new Item(12, "Sól"));
        items.add(new Item(13, "Pieprz"));
        items.add(new Item(14, "Szczypiorek"));
        items.add(new Item(15, "Cebula"));

        HashSet<Item> itemsSet = new HashSet<>(items.subList(0, 5));
        for (Item item : itemsSet) {
            System.out.println("ID: " + item.id + ", Name: " + item.name);
        }

    }
}
