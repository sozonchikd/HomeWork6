public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1. Циклы.
        System.out.println("Задание 1.1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 1.2");
for (int i = 10; i >0; i--) {
    System.out.println(i);
}

        System.out.println("Задание 1.3");
for (int i = 0; i <=17; i+=2) {
            System.out.println(i);
        }

        System.out.println("Задание 1.4");
for (int i = 10; i >= -10; i--) {
    System.out.println(i);
}
        //Домашнее задание 2
        System.out.println("Задание 2.1");
for (int y = 1904; y <= 2096; y+=4) {
    System.out.println(y + " год является високосным");
}

        System.out.println("Задание 2.2");
for (int i = 7; i <= 98; i+=7) {
    System.out.println(i);
}

        System.out.println("Задание 2.3");
for (int d = 1; d <= 512; d*=2) {
    System.out.println(d);
}
//Домашнее задание 3
        System.out.println("Задание 3.1");
int money = 29_000;
int month = 1;
for (money = 29_000; month <= 12; money+=29000, month++) {
    System.out.println(money + " месяц " + month);
}

    }
}