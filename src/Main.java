import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;
        short clientDeviceYear = 2016;

        // Example-1
        System.out.println("Example-1:");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        // Example-2
        System.out.println("Example-2:");

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }


        //Example-3
        System.out.println("Example-3:");
        short year = 103;

        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }


        //Example-4
        System.out.println("Example-4:");

        short deliveryDistance = 95;
        byte days = 0;
        if (deliveryDistance < 20) {
            days += 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days += 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days += 3;
        }
        System.out.println("Потребуется дней: " + days);


        //Example-5
        System.out.println("Example-5:");

        byte monthNumber = 8;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
        }

    }
}