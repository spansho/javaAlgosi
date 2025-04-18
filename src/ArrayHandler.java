import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {
    private int[] array;
    private int size;

    public ArrayHandler(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Метод для вставки элемента в конец массива
    public void insert(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Массив заполнен, невозможно добавить элемент.");
        }
    }

    // Метод для поиска элемента по значению
    public List<Integer> find(int key) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    // Метод для удаления элемента по ключу и сдвига оставшихся
    public void delete(int key) {
        List<Integer> indexes = find(key);

        if (indexes.isEmpty()) {
            System.out.println("Элемент не найден.");
            return;
        }

        // Удаляем элементы с конца, чтобы индексы не смещались
        int shift = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                shift++;
            } else if (shift > 0) {
                array[i - shift] = array[i];
            }
        }

        size -= shift;
    }

    // Метод для нахождения максимального элемента
    public int max() {
        if (size == 0) {
            System.out.println("Массив пуст.");
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Метод для нахождения минимального элемента
    public int min() {
        if (size == 0) {
            System.out.println("Массив пуст.");
            return Integer.MAX_VALUE;
        }
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Метод для нахождения среднего значения элементов массива
    public double average() {
        if (size == 0) {
            System.out.println("Массив пуст.");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return (double) sum / size;
    }

    // Метод для вывода всех элементов массива
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}