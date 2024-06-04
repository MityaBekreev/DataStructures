import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    // Добавление элемента в конец очереди
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Удаление элемента из начала очереди
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return list.removeFirst();
    }

    // Получение элемента из начала очереди без удаления
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return list.getFirst();
    }

    // Получение количества элементов в очереди
    public int count() {
        return list.size();
    }

    // Проверка, пуста ли очередь
    public boolean isEmpty() {
        return list.isEmpty();
    }
}