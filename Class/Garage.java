package Class;

public class Garage {

    private Garage () {

    }

    private static Garage instance = null;

    public static Garage getInstance() {
        if (instance == null) {
            instance = new Garage();
        }
        return instance;
    }

    private String[] array = new String[10];
    private int size = 0;


    public  void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "Элемент не найден";
        }
    }
}
