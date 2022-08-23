import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int yearToDay = LocalDate.now().getYear();
        checkLeapYear(yearToDay);

        //Задание 2
        String clientOsName = "Android";
        int clientOs = getClientOs(clientOsName);
        int clientDeviceYear = 2021;
        selectApp(clientOs, clientDeviceYear);

        //Задание 3
        int deliveryDistance = 95;
        int totalDeliveryDays = calculateDeliveryDays(deliveryDistance);
        printNumberDays(totalDeliveryDays);

    }


    public static void checkLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }

    public static void selectApp (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static int getClientOs (String name) {
        if (name.equals("Android")) {
            return 1;
        }
        return 0;
    }

    private static int calculateDeliveryDays (int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays++;
        }
        return deliveryDays;
    }
    public static void printNumberDays (int results) {
        System.out.println("Потребуется дней: " + results);
    }
}