public class Main {
    public static void main(String[] args) {
        // Создаем объект бинарного дерева
        BinaryTree tree = new BinaryTree();

        // Добавляем элементы
        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);

        // Выводим элементы в порядке "inorder"
        System.out.println("Inorder traversal:");
        tree.inorderTraversal(); // Вывод: 20 30 40 50 60 70 80

        // Проверяем наличие ключа
        int searchKey = 40;
        if (tree.contains(searchKey)) {
            System.out.println("\nКлюч " + searchKey + " найден в дереве.");
        } else {
            System.out.println("\nКлюч " + searchKey + " не найден в дереве.");
        }

        // Удаляем элемент
        tree.remove(30);
        System.out.println("Inorder traversal после удаления 30:");
        tree.inorderTraversal(); // Вывод: 20 40 50 60 70 80
    }
}