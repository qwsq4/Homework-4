public class Main {
    public static void main(String[] args) {
        //Домашнее задание 2
        //Задача 1
        int age = 13;
        System.out.println("   ДЗ №2. Задание 1");
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не достигнут. Нужно подождать " + (18 - age) + " лет");
        }

        //Задача 2
        System.out.println("   ДЗ №2. Задание 2");
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            if (age >= 18) {
                System.out.println("Молодой человек окончил школу и может продолжить обучение в университете");
            } else {
                if (age >= 7) {
                    System.out.println("Ребёнок ходит в школу");
                }
            }
        }

        //Задача 3
        int trainCarCapacity = 102;
        int seatCount = 60;
        int passengers = 40;
        System.out.println("   ДЗ №2. Задание 3");
        if (passengers >= trainCarCapacity) {
            System.out.println("Мест в вагоне нет");
        }else{
            System.out.println("В вагоне есть " + (trainCarCapacity - passengers) + " мест");
            if (passengers >= seatCount) {
                System.out.println("Сидячих мест в вагоне нет");
            }else {
                System.out.println("В вагоне " + (seatCount - passengers) + " сидячих мест");
            }
        }
    }
}