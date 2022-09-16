public class Main {


    public static void main(String[] args) {

        //Домашнее задание 1
        System.out.println("Домашнее задание 1");
        //Задание 1
        System.out.println("Задание 1");
        byte age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием.");
        }

        if (age < 18) {
            System.out.println("Тебе еще нет 18, подожди совершеннолетия.");
        }

        //Задание 2
        System.out.println("Задание 2");
        byte humanAge = 18;
        if (humanAge >= 7) {
            System.out.println("Ребенок ходит в школу.");
        }

        if (humanAge >= 18) {
            System.out.println("Человек уже окончил школу и может отправляться в университет.");
        }

        if (humanAge >= 24) {
            System.out.println("Человек уже окончил университет и может начинать искать работу.");
        }

        //Задание 3
        System.out.println("Задание 3");
        byte countPlace = 102;
        byte countSitPlace = 60;
        byte countStandPlace = (byte) (countPlace - countSitPlace);
        byte busyStandPlace = 37;
        byte busySitPlace = 56;

        if (countSitPlace > busySitPlace) {
            System.out.println("Есть сидячие места.");
        }

        if (countSitPlace == busySitPlace) {
            System.out.println("Нет сидячих мест.");
        }

        if (countStandPlace > busyStandPlace) {
            System.out.println("Есть стоячие места.");
        }

        if (countStandPlace == busyStandPlace) {
            System.out.println("Нет стоячих мест.");
        }

        if (countPlace == (busySitPlace+busyStandPlace)) {
            System.out.println("Вагон полностью забит.");
        }

        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задание 1
        System.out.println("Задание 2.1");

        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием.");
        } else {
            System.out.println("Тебе еще нет 18, подожди совершеннолетия.");
        }

        //Задание 2
        System.out.println("Задание 2.2");

        if (humanAge >= 24) {
            System.out.println("Человек уже окончил университет и может начинать искать работу.");
        }
        else {
            if (humanAge >= 18) {
                System.out.println("Человек уже окончил школу и может отправляться в университет.");
            }
            else {
                if (humanAge >= 7) {
                    System.out.println("Ребенок ходит в школу.");
                }
            }
        }


        //Задание 3
        System.out.println("Задание 2.3");
        if(countSitPlace > busySitPlace) {
            System.out.println("Есть сидячие места.");
        }
        else {
            System.out.println("Нет сидячих мест.");
        }

        if (countStandPlace > busyStandPlace) {
            System.out.println("Есть стоячие места.");
        }
        else {
            System.out.println("Нет стоячих мест.");
        }

        if (countPlace == (busySitPlace+busyStandPlace)) {
            System.out.println("Вагон полностью забит.");
        }


        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 3.1");

        byte personAge = 25;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в детский сад.");
        } else {
            if (personAge >= 7 && personAge <= 18) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в школу");
            }
            else {
                if (personAge > 18 && personAge <= 24) {
                    System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в университет");
                }
                else {
                    System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить на работу");
                }
            }
        }

        //Задание 2
        System.out.println("Задание 3.2");

        byte childAge = 6;
        if (childAge  < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else {
            if (childAge >= 5 && childAge <= 14) {
                System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
            }
            else {
                    System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
            }
        }


        //Задание 3
        System.out.println("Задание 3.3");
        int one = 67;
        int two = 128;
        int free = 93;
        if (one > two && one > free)
        {
            System.out.println("Число "+ one + " большее");
        }
        else {
            if (two > one && two > free)
            {
                System.out.println("Число "+ two + " большее");
            }
            else {
                if (free > one && free > two)
                {
                    System.out.println("Число "+ free + " большее");
                }
            }
        }

    }
}