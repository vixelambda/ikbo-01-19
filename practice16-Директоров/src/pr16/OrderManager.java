package pr16;

import java.util.ArrayList;

public class OrderManager {
    private Order[] orders;

    public void add(Order order, int tableNumber) {
        orders[tableNumber] = order;
    }

    public void addItem(Item item, int tableNumber) {
        orders[tableNumber].add(item);
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers() {
        ArrayList<Integer> ln = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                ln.add(i);
            }
        }
        int[] numbers = new int[ln.size()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ln.get(i);
        }
        return numbers;
    }

    public int itemQuantity(String itemName) {
        int c = 0;
        for (Order order : orders) {
            c += order.itemQuantity(itemName);
        }
        return c;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double s = 0;
        for (Order order : orders) {
            s += order.costTotal();
        }
        return s;
    }
}