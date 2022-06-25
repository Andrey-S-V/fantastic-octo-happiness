package Class;
import Main.main;
import static Main.main.*;
import java.util.Scanner;

public class Car extends Vehicle {

    Scanner scan = new Scanner(System.in);

    public int door() {
        try {
            System.out.println("Яка кількість дверей у авто? ");
            int door = scan.nextInt();
            if (door > 6 || door < 3) throw new IllegalArgumentException();
            return door;
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Не вірно вказана кількість дверей!" + ANSI_RESET);
            return door();
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
