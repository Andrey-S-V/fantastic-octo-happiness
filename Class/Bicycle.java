package Class;
import Main.main;
import java.util.Scanner;
import static Main.main.*;

public class Bicycle extends Vehicle{

    Scanner scan = new Scanner(System.in);

    public double speed() {
        try {
            System.out.println("Скільки швидкостей у велосипеда? ");
            double speed = scan.nextDouble();
            if (speed > 29 || speed < 0) throw new IllegalArgumentException();
            return speed;
        } catch (IllegalArgumentException e) {
            System.out.println(ANSI_RED + "Не вірно вказана кількість швидкостей у велосипедів!" + main.ANSI_RESET);
            return speed();
        }
    }

    @Override
    public String model() {
        System.out.println("Яку модель велосипеда ви хочете додати? ");
        return scan.next();
    }

    @Override
    public String color() {
        System.out.println("Який колір велосипеда? ");
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
            System.out.println(ANSI_RED + "Не вірно вказана швидкість!" + main.ANSI_RESET);
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
            System.out.println(ANSI_RED + "Не вірно вказана ціна!" + main.ANSI_RESET);
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
            System.out.println(ANSI_RED + "Не вірно вказан рік!" + main.ANSI_RESET);
            return year();
        }
    }
}
