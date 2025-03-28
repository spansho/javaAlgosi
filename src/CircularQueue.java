
public class CircularQueue {
    // Массив для хранения элементов
    private int[] array;
    // Индекс начала очереди (откуда будем брать элементы)
    private int front;
    // Индекс конца очереди (куда будем добавлять элементы)
    private int rear;
    // Максимальный размер
    private int maxSize;
    // Текущее количество элементов
    private int currentSize;

    // Конструктор
    public CircularQueue(int size) {
        // Инициализируем массив
        this.array = new int[size];
        // Начальное значение front = 0
        this.front = 0;
        // Начальное значение rear = -1
        this.rear = -1;
        // Запоминаем максимальный размер
        this.maxSize = size;
        // Изначально пустая очередь
        this.currentSize = 0;
    }

    // Метод для добавления элемента в очередь
    public void push(int item) {
        // Проверяем, не заполнена ли очередь
        if (currentSize == maxSize) {
            // Если очередь полная
            System.out.println("Queue is full! Cannot push " + item);
            return;
        }

        // Увеличиваем индекс конца
        rear = (rear + 1) % maxSize;
        // Добавляем элемент в массив
        array[rear] = item;
        // Увеличиваем счетчик элементов
        currentSize++;
        // Выводим сообщение
        System.out.println("Pushed " + item + " to queue at position " + rear);
    }

    // Метод для удаления и возврата первого элемента очереди
    public int pop() {
        // Проверяем, не пуста ли очередь
        if (isEmpty()) {
            // Если очередь пустая
            System.out.println("Queue is empty! Cannot pop");
            return -1;
        }

        // Получаем значение первого элемента
        int item = array[front];
        // Увеличиваем индекс начала очереди
        front = (front + 1) % maxSize;
        // Уменьшаем счетчик элементов
        currentSize--;
        // Возвращаем извлеченный элемент
        return item;
    }

    // Метод для получения первого элемента очереди без его удаления (peek)
    public int peek() {
        // Проверяем, не пуста ли очередь
        if (isEmpty()) {
            // Если очередь пустая
            System.out.println("Queue is empty! Cannot peek");
            return -1;
        }

        // Возвращаем значение первого элемента
        return array[front];
    }

    // Метод для проверки, пуста ли очередь
    public boolean isEmpty() {
        // Очередь пуста, если количество элементов равно 0
        return currentSize == 0;
    }

    // Метод для получения текущего количества элементов в очереди
    public int size() {
        // Возвращаем счетчик элементов
        return currentSize;
    }

    // Метод для получения индекса начала очереди
    public int getFront() {
        return front;
    }

    // Метод для получения индекса конца очереди
    public int getRear() {
        return rear;
    }

    // Метод для отображения всех элементов очереди
    public void display() {
        // Проверяем, не пуста ли очередь
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Circular Queue elements (in order from front to rear):");
        System.out.print("[ ");

        // Проходим по всем элементам очереди
        int count = 0;
        int i = front;
        while (count < currentSize) {
            System.out.print(array[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }

        System.out.println("]");

        // Показываем физическое расположение в массиве
        System.out.println("Physical array representation (with indices):");
        System.out.print("Indices: [ ");
        for (i = 0; i < maxSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        System.out.print("Values:  [ ");
        for (i = 0; i < maxSize; i++) {
            if ((i >= front && i <= rear && front <= rear) ||
                    ((front > rear) && (i >= front || i <= rear))) {
                // Это активный элемент очереди
                System.out.print(array[i] + " ");
            } else {
                // Это неиспользуемая ячейка
                System.out.print("- ");
            }
        }
        System.out.println("]");
    }
}