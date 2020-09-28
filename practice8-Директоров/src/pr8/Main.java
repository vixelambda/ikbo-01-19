package pr8;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<Integer> b = new BoundedWaitList<>(3);
        b.add(10);
        b.add(7);
        b.add(12);
        System.out.println(b);
        UnfairWaitList<Integer> u = new UnfairWaitList<>();
        u.add(10);
        u.add(7);
        u.add(5);
        u.add(12);
        u.add(14);
        u.remove(12);
        u.moveToBack(5);
        System.out.println(u);
    }
}
