public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(2);
        stack.push(9);

        System.out.println("Peek: " + stack.peek());  // Выводит 9, но не удаляет из стека
        System.out.println("Pop: " + stack.pop());    // Вывод 9, удаляя элемент из стека
        System.out.println("Pop: " + stack.pop());    // Вывод 2, удаляя элемент из стека
        System.out.println("Count: " + stack.getCount());  // Выводит количество элементов в стеке
        stack.pop();
        System.out.println(stack.peek()); // происходит исключение, элементов в стеке больше нет
    }
}