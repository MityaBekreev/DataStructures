import java.util.ArrayList;
import java.util.List;

public class Set<T extends Comparable<T>> {
    private List<T> elements;

    public Set() {
        elements = new ArrayList<>();
    }

    // Добавление элемента в множество
    public void add(T item) {
        if (!contains(item)) {
            elements.add(item);
        }
    }

    // Добавление нескольких элементов в множество
    public void addRange(Iterable<T> items) {
        for (T item : items) {
            add(item);
        }
    }

    // Удаление элемента из множества
    public void remove(T item) {
        elements.remove(item);
    }

    // Проверка наличия элемента в множестве
    public boolean contains(T item) {
        return elements.contains(item);
    }

    // Получение количества элементов в множестве
    public int count() {
        return elements.size();
    }

    // Получение итератора для перебора элементов
    public Iterable<T> getEnumerator() {
        return elements;
    }

    // Объединение множеств (Union)
    public Set<T> union(Set<T> other) {
        Set<T> result = new Set<>();
        result.addRange(this.elements);
        result.addRange(other.elements);
        return result;
    }

    // Пересечение множеств (Intersection)
    public Set<T> intersection(Set<T> other) {
        Set<T> result = new Set<>();
        for (T item : this.elements) {
            if (other.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Разность множеств (Difference)
    public Set<T> difference(Set<T> other) {
        Set<T> result = new Set<>();
        for (T item : this.elements) {
            if (!other.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    // Симметрическая разность множеств
    public Set<T> symmetricDifference(Set<T> other) {
        Set<T> union = this.union(other);
        Set<T> intersection = this.intersection(other);
        return union.difference(intersection);
    }
}
