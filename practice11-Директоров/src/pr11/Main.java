package pr11;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arr = new ArrayQueue();
        arr.offer(1);
        arr.offer(1);
        arr.offer(10);
        arr.offer(1);
        arr.offer(1);
        System.out.println(arr);
        System.out.println("Удаление первого: " + arr.poll());
        System.out.println(arr);
        System.out.println("Первый: " + arr.peek());
        System.out.println();
        LinkedQueue link = new LinkedQueue();
        link.offer(10);
        link.offer(9);
        link.offer(8);
        link.offer(7);
        link.offer(6);
        System.out.println(link);
        System.out.println("Удаление первого: " + link.remove());
        System.out.println(link);
        System.out.println("Первый: " + link.element());
    }
}