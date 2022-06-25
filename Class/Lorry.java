package Class;

import static Main.main.*;
import java.util.Scanner;

public class Lorry extends Vehicle {

    Scanner scan = new Scanner(System.in);

    public int wheels() {
        try{
        System.out.println("Яка кількість колес у вантижівки? ");
        int wheels = scan.nextInt();
        if (wheels>6 || wheels<4) throw new IllegalArgumentException();
        return wheels;
        }catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED +"Не вірна кількість колес!"+ANSI_RESET);
            return wheels();
        }
    }

    public int LoadCapacity() {
        try {
            System.out.println("Яка вантажність авто (в тонні)? ");
            int LoadCapacity = scan.nextInt();
            if (LoadCapacity>22 || LoadCapacity<10) throw new IllegalArgumentException();
            return LoadCapacity;
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED +"Не вірна вантажність вантажівки!"+ANSI_RESET);
            return LoadCapacity();
        }
    }

    @Override
    public String model() {
        System.out.println("Яку модель авто ви хочете додати? ");
        return scan.next();
    }

    @Override
    public String color() {
        System.out.println("Який колір авто? ");
        return scan.next();

    }

    @Override
    public int maxSpeed() {
        try {
            System.out.println("Максимальна швидкість? ");
            int maxSpeed = scan.nextInt();
            if (maxSpeed > 330 || maxSpeed < 0) throw new IllegalArgumentException();
            return maxSpeed;
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Не вірно вказана швидкість!" + ANSI_RESET);
            return maxSpeed();
        }
    }

    @Override
    public int price() {
        try {
            System.out.println("Яка його ціна? ");
            int price = scan.nextInt();
            if (price > 45000000 || price < 0) throw new IllegalArgumentException();
            return price;
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Не вірно вказана ціна!" + ANSI_RESET);
            return price();
        }
    }

    @Override
    public int year() {
        try {
            System.out.println("Рік виготовлення? ");
            int year = scan.nextInt();
            if (year > 2022 || year < 1920) throw new IllegalArgumentException();
            return year;
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Не вірно вказан рік!" + ANSI_RESET);
            return year();
        }
    }
}
