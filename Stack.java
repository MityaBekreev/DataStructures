import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Метод для добавления элемента в стек
    public void push(T value) {
        list.addFirst(value);
    }

    // Метод для удаления и возврата верхнего элемента из стека
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.removeFirst();
    }

    // Метод для просмотра верхнего элемента без его удаления
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return list.getFirst();
    }

    // Метод для получения количества элементов в стеке
    public int getCount() {
        return list.size();
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return list.isEmpty();
    }
}