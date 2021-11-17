package by.overone.lesson25homework;

public class Task2 {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7};
        int i = 5;
        if (i >= 0 && i <= array.length) {
            System.out.println(array[i]);
        } else {
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error! Please change i");
            }
        }
    }
}
