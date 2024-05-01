//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }

        System.out.println("\nЗадание 2");
            for (int i = 10; i >=1; i--) {
                System.out.println(i);
            }
        System.out.println("\nЗадание 3");
            for (int i = 0; i <= 17; i = i + 2) {
                System.out.println(i);
            }
        System.out.println("\nЗадание 4");
        for (int i = 10; i >= - 10; i--) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 5");
        for (int i = 1984; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("\nЗадание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 8");
        {
            int cash = 29000;
            int total = 0;
            for (int month = 1; month <= 12; month++) {
                total = total + cash;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println("\nЗадание 9");
        {
            int cash = 29000;
            int total = 0;
            for (int month = 1; month <= 12; month++) {
                total = total + (total/100);
                total = total + cash;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            System.out.println("Итого сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nЗадание 10");
        int total = 1;
        for (int i = 1; i <= 10; i++) {
            total = i * 2;
            System.out.println("2 * " + i + " = " + total);
        }
    }
}