public class MyStack {
    private int[] array;
    private int top;
    private int maxSize;

    // Конструктор, создаем стек заданного размера
    public MyStack(int size) {
        this.array = new int[size];
        this.top = -1;
        this.maxSize = size;
    }

    // Метод для добавления элемента в стек
    public void push(int item) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full! Cannot push " + item);
        } else {
            array[++top] = item;
            System.out.println("Pushed " + item + " to stack at position " + top);
        }
    }

    // Метод для удаления элемента из стека
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot pop");
            return -1;
        } else {
            int item = array[top--];
            System.out.println("Popped " + item + " from stack");
            return item;
        }
    }

    // Метод для получения верхнего элемента стека
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot peek");
            return -1;
        }
        return array[top];
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    // Метод для получения размера стека
    public int size() {
        return top + 1;
    }

    // Метод для отображения состояния стека
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("Stack elements (top to bottom):");
        System.out.print("[ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        // Показываем физическое расположение в массиве
        System.out.println("Physical array representation (with indices):");
        System.out.print("Indices: [ ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        System.out.print("Values:  [ ");
        for (int i = 0; i < maxSize; i++) {
            if (i <= top) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print("- ");
            }
        }
        System.out.println("]");
    }
}
