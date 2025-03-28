import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {

        ArrayHandler handler = new ArrayHandler(10);
        handler.insert(5);
        handler.insert(8);
        handler.insert(2);
        handler.insert(10);
        handler.insert(7);

        System.out.print("Массив: ");
        handler.printArray();

        System.out.println("Найден элемент 10 в индексе: " + handler.find(10));
        handler.delete(10);
        System.out.print("После удаления элемента 10: ");
        handler.printArray();

        System.out.println("Максимальное значение: " + handler.max());
        System.out.println("Минимальное значение: " + handler.min());
        System.out.println("Среднее значение: " + handler.average());
    }

}