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
    System.out.println(y + " год является високосным");}
    //Версия 2

    for (int year = 1904; year <=2096; year++) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год високосный!");
    }
}

        System.out.println("Задание 2.2");
for (int i = 7; i <= 98; i+=7) {
    System.out.println(i);
}

        System.out.println("Задание 2.3");
for (int i = 1; i <= 512; i*=2) {
    System.out.println(i);
}

//Домашнее задание 3
        System.out.println("Задание 3.1");
int money = 29_000;
int month = 0;
for (money = 29_000; month <= 12; money+=29000, month++) {
    System.out.println("Месяц " + month + " сумма накоплении равна " + money);
}
// Вариант 2
int money2 =29000;
int total = 0;
for (int i = 0; i <=12; i++) {
   total  = total + money2; // 0+29000=29000
    System.out.println("Месяц " + i + " сумма накоплении равна " + total);
}
        System.out.println("Задание 3.2");
int moneyRub = 29000;
int total2 = 0;
for (int i = 0; i <= 12; i++) {
    total2 = total2 + total2/100;
    total2 = total2 + moneyRub;
    System.out.println("Месяц " + i + ", сумма накоплении равна " + total2 + " рублей");

}

    }
}