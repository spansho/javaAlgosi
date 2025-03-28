import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int choice = 0;


        MyStack stack = new MyStack(5); // Размер стека - 5 элементов
        CircularQueue circularQueue = new CircularQueue(5); // Размер очереди - 5 элементов
        PriorityQueue priorityQueue = new PriorityQueue(5); // Размер приоритетной очереди - 5 элементов

        // Бесконечный цикл для меню
        while (true) {
            // Выводим главное меню
            System.out.println("\nChoose an option:");
            System.out.println("1. Test Stack");
            System.out.println("2. Test Circular Queue");
            System.out.println("3. Test Priority Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            choice = scanner.nextInt();

            // выбор главный
            switch (choice) {
                case 1:
                    // Тестируем стек
                    testStack(stack);
                    break;
                case 2:
                    // Тестируем циклическую очередь
                    testCircularQueue(circularQueue);
                    break;
                case 3:
                    // Тестируем приоритетную очередь
                    testPriorityQueue(priorityQueue);
                    break;
                case 4:
                    // Выходим из программы
                    System.out.println("Goodbye!");
                    return;
                default:
                    // Если пользователь ввел неправильный выбор
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    // Метод для тестирования стека
    public static void testStack(MyStack stack) {
        int choice = 0;

        // Цикл для меню стека
        while (true) {
            // состояние стека
            stack.display();

            // Выводим меню стека
            System.out.println("\nChoose an operation for Stack:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Size");
            System.out.println("6. Back to main menu");
            System.out.print("Enter your choice: ");


            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Добавляем элемент в стек
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    // Удаляем элемент из стека
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    // Смотрим верхний элемент стека
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    // Проверяем, пуст ли стек
                    System.out.println("Is stack empty: " + stack.isEmpty());
                    break;
                case 5:
                    // Узнаем размер стека
                    System.out.println("Stack size: " + stack.size());
                    break;
                case 6:
                    // Возвращаемся в главное меню
                    return;
                default:
                    // Если пользователь ввел неправильный выбор
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    // Метод для тестирования циклической очереди
    public static void testCircularQueue(CircularQueue queue) {
        int choice = 0;

        // Цикл для меню циклической очереди
        while (true) {
            // Выводим текущее состояние очереди
            queue.display();

            // Выводим меню циклической очереди
            System.out.println("\nChoose an operation for Circular Queue:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Size");
            System.out.println("6. Back to main menu");
            System.out.print("Enter your choice: ");

            // Считываем выбор пользователя
            choice = scanner.nextInt();

            // Обрабатываем выбор пользователя
            switch (choice) {
                case 1:
                    // Добавляем элемент в очередь
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    queue.push(element);
                    break;
                case 2:
                    // Удаляем элемент из очереди
                    int poppedElement = queue.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    // Смотрим первый элемент очереди
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    // Проверяем, пуста ли очередь
                    System.out.println("Is queue empty: " + queue.isEmpty());
                    break;
                case 5:
                    // Узнаем размер очереди
                    System.out.println("Queue size: " + queue.size());
                    break;
                case 6:
                    // Возвращаемся в главное меню
                    return;
                default:
                    // Если пользователь ввел неправильный выбор
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    // Метод для тестирования приоритетной очереди
    public static void testPriorityQueue(PriorityQueue queue) {
        int choice = 0;

        // Цикл для меню приоритетной очереди
        while (true) {
            // Выводим текущее состояние очереди
            queue.display();

            // Выводим меню приоритетной очереди
            System.out.println("\nChoose an operation for Priority Queue:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Size");
            System.out.println("6. Back to main menu");
            System.out.print("Enter your choice: ");

            // Считываем выбор пользователя
            choice = scanner.nextInt();

            // Обрабатываем выбор пользователя
            switch (choice) {
                case 1:
                    // Добавляем элемент в очередь
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    queue.push(element);
                    break;
                case 2:
                    // Удаляем элемент из очереди
                    int poppedElement = queue.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    // Смотрим элемент с наивысшим приоритетом
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Highest priority element: " + frontElement);
                    }
                    break;
                case 4:
                    // Проверяем, пуста ли очередь
                    System.out.println("Is queue empty: " + queue.isEmpty());
                    break;
                case 5:
                    // Узнаем размер очереди
                    System.out.println("Queue size: " + queue.size());
                    break;
                case 6:
                    // Возвращаемся в главное меню
                    return;
                default:
                    // Если пользователь ввел неправильный выбор
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}

