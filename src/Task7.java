public class Task7 {
    public static int[] changeArray(int value []) {
        value = new int[]{1, 2};
        for (int e:value) {
            System.out.print(e+" ");
        }
        return value;
    }
    public static void main(String[] args) {
        int [] array = {3,4};
        System.out.println("До метода: ");
        for (int e:array) {
            System.out.print(e+" ");
        }

        System.out.println();
        System.out.println("Применили метод:");
        changeArray(array);
        System.out.println();

        System.out.println("Вне метода: ");
        for (int e:array) {
            System.out.print(e+" ");
        }
    }
}
