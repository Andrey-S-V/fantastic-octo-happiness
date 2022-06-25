package Hello;
import DataTime.*;
import static Main.main.*;

public class Hello {

    public void user() {
        Data data = new Data();
        System.out.println("\n" + ANSI_GREEN +"| " + data.dataTime()+"|" + ANSI_RESET);
        System.out.println("|    -- Доброго дня --    |");
        System.out.println("|  Вітаємо вас у системі  |  " + "\n");
        System.out.println("""
                         1 - Додади авто до списку\s
                         2 - Подивится всі авто в салоні\s
                         3 - Видалити авто\s
                         4 - Оформлення авто\s
                         5 - Вихід\s""");
        System.out.print("\n" + ANSI_GREEN + "Виберіть дію: " + ANSI_RESET);
    }
}
