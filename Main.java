public class Main {
    public static void main(String[] args) {
        Set<Integer> setA = new Set<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        Set<Integer> setB = new Set<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);

        Set<Integer> union = setA.union(setB);
        System.out.println("Объединение: " + union.getEnumerator());

        Set<Integer> intersection = setA.intersection(setB);
        System.out.println("Пересечение: " + intersection.getEnumerator());

        Set<Integer> difference = setA.difference(setB);
        System.out.println("Разность: " + difference.getEnumerator());

        Set<Integer> symmetricDifference = setA.symmetricDifference(setB);
        System.out.println("Симметрическая разность: " + symmetricDifference.getEnumerator());
    }
}