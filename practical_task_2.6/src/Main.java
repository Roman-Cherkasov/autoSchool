import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        task_1();
//        task_2();
//        task_3();
//        task_4();
//        task_5();
//        task_6();
//        task_7();
//        task_8();
//        task_9();
//        task_10();
//        task_11();
//        task_12();
//        task_13();
//        task_14();
//        task_15();
//        task_16();
//        task_17();
        task_18();
    }


    static int check_if_a_number_is_an_integer() {
//        int parsed_number;
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer number");
        boolean temp = true;
        while (temp) {
            try {
                number = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It is not a integer number, please enter a integer");
                continue;
            }
            temp = false;
        }
        return number;
    }

    static void task_1() {
        int a = check_if_a_number_is_an_integer();
        int b = check_if_a_number_is_an_integer();
        if (a < b)
            System.out.println(String.format("Minimum is %d", a));
        else if (b < a)
            System.out.println(String.format("Minimum is %d", b));
        else
            System.out.println("The numbers are equal");
    }

    static void task_2() {
        int a = check_if_a_number_is_an_integer();
        int b = check_if_a_number_is_an_integer();
        int c = check_if_a_number_is_an_integer();
        int d = check_if_a_number_is_an_integer();
        if (a == b && a == c && a == d)
            System.out.println("The numbers are equal");
        else if (a >= b && a >= c && a >= d)
            System.out.println(String.format("Maximum is %d", a));
        else if (b >= a && b > c && b >= d)
            System.out.println(String.format("Maximum is %d", b));
        else if (c >= a && c >= b && c >= d)
            System.out.println(String.format("Maximum is %d", c));
        else if (d >= a && d >= b && d >= c)
            System.out.println(String.format("Maximum is %d", d));
    }

    static void task_3() {
        int a = check_if_a_number_is_an_integer();
        int b = check_if_a_number_is_an_integer();
        int c = check_if_a_number_is_an_integer();
        if (a == b && a == c)
            System.out.println("The numbers are equal");
        else if (a >= b && a >= c && b > c)
            System.out.println(a + " " + b + " " + c);
        else if (a >= b && c >= b && a >= c)
            System.out.println(a + " " + c + " " + b);
        else if (b >= a && b >= c && a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (b >= a && b >= c && c >= a)
            System.out.println(b + " " + c + " " + a);
        else if (b >= a && c >= b && a >= b)
            System.out.println(c + " " + a + " " + b);
        else if (b >= a && c >= b && b >= a)
            System.out.println(c + " " + b + " " + a);
    }

    static void task_4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String first_name = scan.nextLine();
        System.out.println("Enter second name");
        String second_name = scan.nextLine();
        if (first_name.equals(second_name))
            System.out.println("Names are identical");
        else if (first_name != second_name && first_name.length() == second_name.length())
            System.out.println("Name lengths are equal");
    }

    static void task_5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        System.out.print("Enter age. ");
        int age = check_if_a_number_is_an_integer();
        if (age < 18)
            System.out.println("Grow up a little");
    }

    static void task_6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        System.out.print("Enter age. ");
        int age = check_if_a_number_is_an_integer();
        if (age > 20)
            System.out.println("Even 18 is enough");
    }

    static void task_7() {
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        System.out.print("Guess the hidden number. You have 7 tries. ");
        int temp;
        for (int i = 0; i < 7; i++) {
            temp = check_if_a_number_is_an_integer();
            if (secret == temp) {
                System.out.println("You guessed !");
                break;
            } else if (secret != temp && i != 6)
                System.out.print(String.format("Try again. You have %d more tries. ", 6 - i));
            else
                System.out.println("You failed to guess...");
        }
    }

    static void task_8() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    static void task_9() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    static void task_10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter line");
        String line = scan.nextLine();
        int n = check_if_a_number_is_an_integer();
        int i = 0;
        while (i < n) {
            System.out.println(line);
            i++;
        }
    }

    static void task_11() {
        int i = 0;
        while (i < 10) {
            System.out.println("ssssssssss");
            i++;
        }
    }

    static void task_12() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                if (j <= 9)
                    System.out.print(i * j + " ");
                else
                    System.out.println(i * j + " ");
                j++;
            }
            i++;
        }
    }

    static void task_13() {
        for (int i = 1; i <= 100; i += 1)
            System.out.println(i);
    }

    static void task_14() {
        int m = check_if_a_number_is_an_integer();
        int n = check_if_a_number_is_an_integer();
        for (int i = 0; i < m; i++)
            System.out.println("8".repeat(n));
    }

    static void task_15() {
        for (int i = 0; i <= 10; i++)
            System.out.println("8".repeat(i));
    }

    static void task_16() {
        for (int i = 0; i < 10; i++)
            System.out.print("8");
        System.out.println();
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.println("8");
    }

    static void task_17() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        for (int i = 0; i < 10; i++)
            System.out.println(name + " loves me.");
    }

    static void task_18() throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Boom!");
    }
}
