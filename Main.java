public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Первый элемент: " + queue.peek());
        System.out.println("Количество элементов: " + queue.count());

        queue.dequeue();
        System.out.println("Первый элемент после удаления: " + queue.peek());
    }
}