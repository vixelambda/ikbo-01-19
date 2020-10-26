package pr16;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    private int size;
    private Item[] items;

    public void add(Item item) {
        if (size > items.length) {
            Item[] t = items.clone();
            items = new Item[size+1];
            System.arraycopy(t, 0, items, 0, t.length);
        }
        items[size] = item;
        size++;
    }

    public boolean remove(String itemName) {
        boolean b = false;
        int ind = items.length;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                ind = i + 1;
                items[i] = null;
                b = true;
                break;
            }
        }
        for (int i = ind; i < items.length - 1; i++) {
            items[i] = items[i+1];
        }
        items[items.length - 1] = null;
        return b;
    }

    public int removeAll(String itemName) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                items[i] = null;
                c++;
            }
        }
        Item[] x = new Item[items.length];
        int ind = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                x[ind] = items[i];
                ind++;
            }
        }
        items = x;
        return c;
    }

    public int itemQuantity() {
        return size;
    }

    public int itemQuantity(String itemName) {
        int c = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) c++;
        }
        return c;
    }

    public Item[] getItems() {
        return items;
    }

    public double costTotal() {
        int k = 0;
        for (Item item : items) {
            k += item.getPrice();
        }
        return k;
    }

    public Item[] sortedItemsByCostDesc() {
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                double razn = i2.getPrice() - i1.getPrice();
                return (int)razn;
            }
        });
        return items;
    }
    
    public String[] dishesNames() {
        String[] names = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            names[i] = items[i].getName();
        }
        return names;
    }
}