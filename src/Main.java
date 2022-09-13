public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        //Задача 1
        System.out.println("   ДЗ №1. Задание 1");
        int age = 13;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не достигнут. Нужно подождать " + (18 - age) + " лет");
        }

        //Задача 2
        System.out.println("   ДЗ №1. Задание 2");
        if (age >= 7) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >= 18) {
            System.out.println("Молодой человек окончил школу и может продолжить обучение в университете");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Задача 3
        System.out.println("   ДЗ №1. Задание 3");
        int trainCarCapacity = 102;
        int seatCount = 60;
        int passengers = 500;
        if (passengers >= trainCarCapacity) {
            System.out.println("Мест в вагоне нет");
        }
        if (passengers < trainCarCapacity) {
            System.out.println("В вагоне есть " + (trainCarCapacity - passengers) + " мест");
            if (passengers >= seatCount) {
                System.out.println("Сидячих мест в вагоне нет");
            }
            if (passengers < seatCount) {
                System.out.println("В вагоне " + (seatCount - passengers) + " сидячих мест");
            }
        }
    }
}