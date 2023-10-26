public class Task6 {

    // Задача6
    public static int changeValue(int value) {
        return value = 22;
    }

    public static void main(String[] args) {
        int number = 33;
        System.out.println("До метода: ");
        System.out.println(number);
        changeValue(number);
        System.out.println("После метода: ");
        System.out.println(number);
    }
}
