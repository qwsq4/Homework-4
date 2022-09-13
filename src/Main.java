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

        //Домашнее задание 2
        //Задача 1
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

        //Домашнее задание 3
        //Задача 1
        System.out.println("   ДЗ №3. Задание 1");
        boolean needGoToKindergarten = age >= 2 && age <=6;
        boolean needGoToSchool = age >= 7 && age <=18;
        boolean needGoToCollege = age > 18 && age <=24;
        boolean needGoToWork = age > 24;
        if (needGoToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }else{
            if (needGoToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            }else{
                if (needGoToCollege) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                }else{
                    if (needGoToWork) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                    }
                }
            }
        }

        //Задача 2
        System.out.println("   ДЗ №3. Задание 2");
        boolean cannotRideTheAttraction = age < 5;
        boolean canRideWithAnAdult = age >= 5 && age < 14;
        boolean canRideTheAttraction = age > 14;
        if (cannotRideTheAttraction) {
            System.out.println("Ребенку нельзя кататься на аттракционе");
        }else{
            if (canRideWithAnAdult) {
                System.out.println("Ребенку можно кататься в сопровождении взрослого");
            }else{
                if (canRideTheAttraction){
                    System.out.println("Ребенку можно кататься на аттракционе");
                }
            }
        }

        //Задача 3
        System.out.println("   ДЗ №3. Задание 3");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two) {
            if (two < three) {
                System.out.println("Число " + three + " - больше всех");
            }else{
                System.out.println("Число " + two + " - больше всех");
            }
        }else{
            if (one < three) {
                System.out.println("Число " + three + " - больше всех");
            }else{
                System.out.println("Число " + one + " - больше всех");
            }
        }
    }
}