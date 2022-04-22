package ru.skypro;

public class Main {

    public static void checkYear (int year) {
        if (( year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
            System.out.println( year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    public static void selectOS (int clientOS, int ClientDeviceYear){
        if (clientOS == 0 && ClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && ClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && ClientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && ClientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }




    public static int calculateDeliveryDays (int DeliveryDistance) {
        if (DeliveryDistance <= 20) {
            return 1;
        } else if (DeliveryDistance > 20 && DeliveryDistance <= 60) {
            return 2;
        } else if (DeliveryDistance > 60 && DeliveryDistance <= 100) {
            return 3;
        } else if (DeliveryDistance > 100) {
            throw new RuntimeException("слишком большое расстояние. Доставки нет.");
        }
        return DeliveryDistance;
    }

    public static void checkDoubles (String s) {
        for (int i = 0; i < s.charAt(i); i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                System.out.println("в строке присутствуют дубли " + s.charAt(i));
                break;
            } else {
                System.out.println("Дублей нет");
            }

        }
    }

    public static void reverseArray (int [] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {
        // Задание 1
        checkYear(1924);

        //Задание 2
        selectOS(1, 2014);


        //Задание 3
        int DeliveryDistance = 80;
        int DeliveryDays = calculateDeliveryDays(DeliveryDistance);
        System.out.println(DeliveryDays);

        //Задание 4
        String s = "aabccddefgghiijjkk";
        checkDoubles(s);


        //Задание 5
        int[] arr = {3, 2, 1, 6, 5};
        reverseArray(arr);
    }
}
