public class PriorityQueue {
    // Массив для хранения элементов
    private int[] array;
    // Текущее количество элементов
    private int size;
    // размер очереди
    private int maxSize;

    // Конструктор очереди
    public PriorityQueue(int maxSize) {
        // Инициализируем массив
        this.array = new int[maxSize];
        // Очередь пустая сначала
        this.size = 0;
        // Запоминаем максимальный размер
        this.maxSize = maxSize;
    }

    // Метод для добавления элемента в очередь с приоритетом
    // Элементы с меньшими значениями будут иметь БОЛЕЕ ВЫСОКИЙ приоритет
    public void push(int item) {
        // Проверяем, не заполнена ли очередь
        if (size == maxSize) {
            // Если очередь полная
            System.out.println("Priority Queue is full! Cannot push " + item);
            return;
        }

        // Если очередь пуста, просто добавляем элемент в начало
        if (size == 0) {
            array[0] = item;
            size++;
            System.out.println("Pushed " + item + " to priority queue at position 0");
            return;
        }

        // Находим место для вставки нового элемента (по сути цикл двигает все элементы больше нашего вправо, освобождая место)
        int i;
        for (i = size - 1; i >= 0; i--) {
            // Если текущий элемент меньше нового, то сдвигаем его ->
            if (array[i] > item) {
                array[i + 1] = array[i];
            } else {
                // Иначе прекращаем поиск и выходим из цикла
                break;
            }
        }

        // Вставляем новый элемент на освобожденное место
        array[i + 1] = item;
        // Увеличиваем размер очереди
        size++;
        // Выводим сообщение
        System.out.println("Pushed " + item + " to priority queue at position " + (i + 1));

    }

    // Метод для удаления и возврата элемента с наивысшим приоритетом
    public int pop() {
        // Проверяем, не пуста ли очередь
        if (isEmpty()) {
            // Если очередь пустая
            System.out.println("Priority Queue is empty! Cannot pop");
            return -1;
        }

        // Получаем элемент с наивысшим приоритетом (первый в массиве)
        int item = array[0];

        // Сдвигаем все остальные элементы влево
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        // Уменьшаем размер очереди
        size--;

        // Возвращаем извлеченный элемент
        return item;
    }

    // Метод для получения элемента с наивысшим приоритетом без его удаления (peek)
    public int peek() {
        // Проверяем, не пуста ли очередь
        if (isEmpty()) {
            // Если очередь пустая
            System.out.println("Priority Queue is empty! Cannot peek");
            return -1;
        }

        // Возвращаем элемент с наивысшим приоритетом (первый в массиве)
        return array[0];
    }

    // Метод для проверки, пуста ли очередь
    public boolean isEmpty() {
        // Очередь пуста, если количество элементов равно 0
        return size == 0;
    }

    // Метод для получения текущего количества элементов в очереди
    public int size() {
        // Возвращаем текущий размер очереди
        return size;
    }

    // Метод для отображения всех элементов очереди
    public void display() {
        // Проверяем, не пуста ли очередь
        if (isEmpty()) {
            System.out.println("Priority Queue is empty!");
            return;
        }

        System.out.println("Priority Queue elements (ordered by priority, smallest first):");
        System.out.print("[ ");

        // Проходим по всем элементам очереди
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("]");
    }
}