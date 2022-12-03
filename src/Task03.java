import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
public class Task03 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            myList.add((int) (Math.random() * 51));
        }
        for (int i = 0; i < myList.toArray().length; i++) {
            System.out.printf("%s   ", myList.toArray()[i]);
        }
        int max = (int) myList.toArray()[0];
        int min = (int) myList.toArray()[0];
        int sum = 0;
        for (int i : myList) {
            sum += i;
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println();
        System.out.printf("Минимальное число из списка равно %s", min);
        System.out.println();
        System.out.printf("Максимальное число из списка равно %s", max);
        System.out.println();
        System.out.printf("Среднее арифметическое всех чисел списка равно %s", (double) sum/myList.toArray().length);
    }
}