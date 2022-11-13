import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        int totalExpenses = 0;
        for (int total = 0; total < arr.length; total++) {
               totalExpenses += arr[total];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        System.out.println();
        System.out.println("Задача 2");

       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;

        for (int waste = 0; waste < arr.length; waste++) {
            int dailyConsumption = arr[waste];
             min = Math.min(min, dailyConsumption);
             max = Math.max(max, dailyConsumption);
        }

        System.out.println("Минимальная сумма трат за день составила : " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила : " + max + " рублей");

        System.out.println();
        System.out.println("Задача 3");

        int averageConsumption = totalExpenses / arr.length;
        System.out.println("Средняя сумма трат за месяц составила : " + averageConsumption + " рублей");

        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
           for (int name = reverseFullName.length - 1; name >=0; name--) {
                System.out.print(reverseFullName[name]);
        }

    }
}









