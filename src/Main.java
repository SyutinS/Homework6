public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Установите другую операционную систему !!!");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int ClientDeviceYear = 2013;
        byte clientOS = 1;
        if (ClientDeviceYear >= 2015 && clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (ClientDeviceYear >= 2015 && clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        if (ClientDeviceYear < 2015 && clientOS == 0)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (ClientDeviceYear < 2015 && clientOS ==1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2320;
        int yearEach4 = year % 4;
        int yearEach100 = year % 100;
        int yearEach400 = year % 400;

        if (yearEach100 == 0 && yearEach400 != 0)
            System.out.println(year + " год не является високостным");
        else if (yearEach4 != 0)
            System.out.println(year + " год не является високостным");
        else
            System.out.println(year + " год является високостным");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte deliveryDistance = 25;
        byte daysDelivery = 1;
        if (deliveryDistance < 20)
            System.out.println("Потребуется: " + daysDelivery + " день");
        else if (deliveryDistance >= 20 && deliveryDistance < 60)
            System.out.println("Потребуется: " + (daysDelivery + 1) + " дня");
        else if (deliveryDistance >= 60 && deliveryDistance <= 100)
            System.out.println("Потребуется: " + (daysDelivery + 2) + " дня");
        else System.out.println("Доставки нет !");
    }
    public static void task5() {
        byte monthNumber = 7;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц № " + monthNumber + " - зима / месяц - январь");
                break;
            case 2:
                System.out.println("Месяц № " + monthNumber + " - зима / месяц - февраль");
                break;
            case 3:
                System.out.println("Месяц № " + monthNumber + " - весна / месяц - март");
                break;
            case 4:
                System.out.println("Месяц № " + monthNumber + " - весна / месяц - апрель");
                break;
            case 5:
                System.out.println("Месяц № " + monthNumber + " - весна / месяц - май");
                break;
            case 6:
                System.out.println("Месяц № " + monthNumber + " - лето / месяц - июнь");
                break;
            case 7:
                System.out.println("Месяц № " + monthNumber + " - лето / месяц - июль");
                break;
            case 8:
                System.out.println("Месяц № " + monthNumber + " - лето / месяц - август");
                break;
            case 9:
                System.out.println("Месяц № " + monthNumber + " - осень / месяц - сентябрь");
                break;
            case 10:
                System.out.println("Месяц № " + monthNumber + " - осень / месяц - октябрь");
                break;
            case 11:
                System.out.println("Месяц № " + monthNumber + " - осень / месяц - ноябрь");
                break;
            case 12:
                System.out.println("Месяц № " + monthNumber + " - зима / месяц - декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует !!!");
        }

    }
}
