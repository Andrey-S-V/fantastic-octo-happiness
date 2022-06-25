package Main;

import Class.*;
import Check.*;
import Hello.*;

import java.util.Scanner;

public class main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Garage garage = Garage.getInstance();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Lorry lorry = new Lorry();


        int menu = 1;
        do {
            Hello hello = new Hello();
            hello.user();
            int Case = scanner.nextInt();
            switch (Case) {
                case 1:
                    System.out.println("\n" + """
                            1 - Додати авто
                            2 - Додати вантажівку
                            3 - Додати велосипед
                            4 - Повернутися у головне меню""");
                    System.out.print(ANSI_GREEN + "\nВиберіть дію: " + ANSI_RESET);
                    int res = scanner.nextInt();
                    System.out.print("\n");
                    switch (res) {
                        case 1:
                            try {
                                String model = car.model();
                                String color = car.color();
                                String door = Integer.toString(car.door());
                                String maxSpeed = Integer.toString(car.maxSpeed());
                                String year = Integer.toString(car.year());
                                String price = Integer.toString(car.price());
                                garage.add( model + "; Колір - " + color + "; Кількість дверей - " + door + "; Швидкість - " + maxSpeed + "км/год; Рік - " + year + "; Ціна - " + price + "$");
                            } catch (Exception e) {
                                System.out.println(ANSI_RED + "Ви ввели не вірне значення!" + ANSI_RESET);
                            }
                            System.out.println("\n" + ANSI_GREEN + "Транспорт добалено у гараж успішно!" + ANSI_RESET + "\n");
                            break;
                        case 2:
                            try {
                                String model = lorry.model();
                                String color = lorry.color();
                                String wheels = Integer.toString(lorry.wheels());
                                String maxSpeed = Integer.toString(lorry.maxSpeed());
                                String loadCapacity = Integer.toString(lorry.LoadCapacity());
                                String year = Integer.toString(lorry.year());
                                String price = Integer.toString(lorry.price());
                                garage.add( model + "; Колір - " + color + "; Кількість колес - " + wheels + "; Максимальне навантаження - " + loadCapacity + " т; Швидкість - " + maxSpeed + "км/год; Рік - " + year + "; Ціна - " + price + "$");
                            } catch (Exception e) {
                                System.out.println(ANSI_RED + "Ви ввели не вірне значення!" + ANSI_RESET);
                            }
                            System.out.println("\n" + ANSI_GREEN + "Транспорт добалено у гараж успішно!" + ANSI_RESET + "\n");
                            break;

                        case 3:
                            try {
                                String model = bicycle.model();
                                String color = bicycle.color();
                                String speed = Double.toString(bicycle.speed());
                                String maxSpeed = Integer.toString(bicycle.maxSpeed());
                                String year = Integer.toString(bicycle.year());
                                String price = Integer.toString(bicycle.price());
                                garage.add( model + "; Колір - " + color + "; Кількість швидкостей - " + speed + "; Швидкість - " + maxSpeed + "км/год; Рік - " + year + "; Ціна - " + price + "$");
                            } catch (Exception e) {
                                System.out.println(ANSI_RED + "Ви ввели не вірне значення!" + ANSI_RESET);
                            }
                            System.out.println("\n" + ANSI_GREEN + "Транспорт добалено у гараж успішно!" + ANSI_RESET + "\n");
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    if (garage.size() == 0) {
                        System.out.println(ANSI_RED + "\nСписок авто порожній!" + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_GREEN + "\nСписок транспорту у гаражі!" + ANSI_RESET);
                        for (int i = 0; i < garage.size(); i++) {
                            System.out.println((i + 1) + " - " + "Модель - "+ garage.get(i));
                        }
                    }
                    break;
                case 3:
                    if (garage.size() == 0) {
                        System.out.println(ANSI_RED + "\nСписок авто порожній!" + ANSI_RESET);
                    } else {
                        System.out.print(ANSI_GREEN + "\nВведіть номер транспорту із списку, який ви хотіли би видалити - " + ANSI_RESET);
                        int index = scanner.nextInt();
                        if (index > garage.size() && index < garage.size()) {
                            System.out.println(ANSI_RED + "\nНемає траспорту з таким значенням!" + ANSI_RESET);
                        } else {
                            garage.remove(index - 1);
                        }
                    }
                    break;

                case 4:
                    Check check = new Check();
                    check.check(garage);

                    break;

                case 5:
                    menu = 5;
                    break;
            }
        } while (menu != 5);
    }
}
