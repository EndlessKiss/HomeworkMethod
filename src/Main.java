import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int year = 2024;
        checkLeapYear(year);
        int clientDeviceYear = 2020;
        int nameOS = 1;
        installVersionOS(nameOS, clientDeviceYear);
        int distance = 95;
        int days = deliveryDays(distance);
        System.out.println("Потребуется дней " + days);
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " невисокосный год");
        }
    }

    public static void installVersionOS(int typeOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0 && year >= currentYear) {
            System.out.println("Установите версию для iOS");
        } else if (typeOS == 0 && year < currentYear) {
            System.out.println("Установите облеченную версию для iOS");
        } else if (typeOS == 1 && year >= currentYear) {
            System.out.println("Установите версию для Andriod");

        } else {
            System.out.println("Установите облегченную версию для Andriod");
        }
    }

    public static int deliveryDays(int distance) {
        int day = 1;
        boolean firstZone = distance < 20;
        boolean secondZone = distance >= 20 && distance < 40;
        boolean thirdZone = distance >= 40 && distance < 100;
        if (firstZone) {
            return day;
        } else if (secondZone) {
            day = day + 1;
            return day;
        } else if (thirdZone) {
            day = day + 2;
            return day;
        }
        return day + 3;

    }
}

