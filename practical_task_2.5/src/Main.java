import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {

        task_1();

//        task_2();

//        task_3();

//        task_4();

//        task_5();
    }

    static float[] initializeArray(int array_length) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float[] list = new float[array_length];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter number " + (i + 1));
            boolean temp = true;
            while (temp) {
                try {
                    list[i] = Float.parseFloat(reader.readLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Please enter a number. ");
                    continue;
                }
                temp = false;
            }
        }
        return list;
    }

    static void max(float[] array) {
        float max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum array element is " + max);
    }

    static void task_1() throws IOException {
        System.out.println(String.format("Enter %d numbers one by one", 20));
        max(initializeArray(20));
    }

    static void task_2() throws IOException {
        System.out.println("Enter 8 of 10 lines one by one:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter string number " + (i + 1));
            list[i] = reader.readLine();
        }
        for (int i = 0; i < list.length; i++) {

            int j = list.length - i - 1;
            System.out.println(String.format("Line %d: %s", list.length - i, list[j]));
        }
    }

    static void task_3() throws IOException {
        System.out.println("Enter 10 lines one by one:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list_of_strings = new String[10];
        int[] list_of_string_lengths = new int[list_of_strings.length];
        for (int i = 0; i < list_of_strings.length; i++) {
            list_of_strings[i] = reader.readLine();
            list_of_string_lengths[i] = list_of_strings[i].length();
        }
        System.out.println();
        System.out.println("List of numbers:");
        for (int i = 0; i < list_of_string_lengths.length; i++) {
            System.out.println(String.format("Line №%d length - %d", i, list_of_string_lengths[i]));
        }
    }

    static void task_4() throws IOException {
        System.out.println(String.format("Enter %d numbers one by one", 10));
        float[] list = initializeArray(10);
        for (int i = 0; i < list.length; i++) {
            int j = list.length - i - 1;
            System.out.println(String.format("Line %d: %s", list.length - i, list[j]));
        }
    }

    static void task_5() throws IOException {
        System.out.println("Enter 20 numbers one by one");
        float[] origin_list = initializeArray(20);
        float[] list_from_1_to_10 = new float[10];
        float[] list_from_11_to_20 = new float[10];
        for (int i = 0; i < origin_list.length; i++) {
            if (i < 10)
                list_from_1_to_10[i] = origin_list[i];
            else
                list_from_11_to_20[i -10] = origin_list[i];
        }
        System.out.println("Second list (values 11 to 20 of the original array):");
        for (int i = 0; i < list_from_1_to_10.length; i++)
            System.out.println(String.format("Value %d: %s",i + 1, list_from_11_to_20[i]));
    }
}