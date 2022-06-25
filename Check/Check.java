package Check;
import static Main.main.*;
import Class.*;
import DataTime.Data;

import java.io.FileWriter;
import java.util.Scanner;

public class Check {
    public void check(Garage garage) {

        Data data = new Data();
        Scanner scanner = new Scanner(System.in);

        System.out.print(ANSI_GREEN + "Введите Имя и Фамилию клиента!" + "\n - " + ANSI_RESET);
        String clientName = scanner.next();
        System.out.print(" ");
        String clientSecondName = scanner.next();
        System.out.print(ANSI_GREEN + "Введите своё Имя и Фамилию!" + "\n - " + ANSI_RESET);
        String managerName = scanner.next();
        System.out.print(" ");
        String managerSecondName = scanner.next();
        if (garage.size() == 0) {
            System.out.println(ANSI_RED + "\nСписок авто порожній!" + ANSI_RESET);
        } else {
            System.out.print(ANSI_GREEN + "Введите номер авто із списку!" + "\n - " + ANSI_RESET);
            int indexAuto = scanner.nextInt();
            if (indexAuto > garage.size() && indexAuto < garage.size()) {
                System.out.println(ANSI_RED + "\nНемає авто з таким значенням!" + ANSI_RESET);
            } else {
                try {
                    FileWriter fw = new FileWriter("check.txt");
                    fw.write(data.dataTime() + "\n" + "\n" +"Клієнт: " + clientName + " " + clientSecondName + "\n" +
                            "Менеджер: " +
                            managerName + " " + managerSecondName + "\n" + "\n"
                            + "Авто: " + garage.get(indexAuto - 1));
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("\n"+ANSI_GREEN + "Документи оформленно! " + ANSI_RESET + "\n");
            }
        }
    }
}
