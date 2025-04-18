import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {

        ArrayHandler handler = new ArrayHandler(10);
        handler.insert(5);
        handler.insert(5);
        handler.insert(8);
        handler.insert(2);
        handler.insert(10);
        handler.insert(7);

        System.out.print("Массив: ");
        handler.printArray();

        var ak=handler.find(5);
        for(int i =0;i<ak.size();i++)
        System.out.println("Найден элемент 5 в индексе: " + ak.get(i));
        handler.delete(5);
        System.out.print("После удаления элемента 5: ");
        handler.printArray();

        System.out.println("Максимальное значение: " + handler.max());
        System.out.println("Минимальное значение: " + handler.min());
        System.out.println("Среднее значение: " + handler.average());
    }

}