public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        task_1(21, 8);
        System.out.println();

        System.out.println("Task 2");
        task_2(23);
        System.out.println();

        System.out.println("Task 3");
        task_3(4.4f);
        System.out.println();

        System.out.println("Task 4");
        task_4(0, 2, 5);
    }

    static void task_1(int q, int w) {
        int result = q / w;
        float remainder = q % w;
        if (remainder > 0) {
            System.out.println(q + " / " + w + " = " + result + " (Remainder: " + (int)remainder + ")");
        } else {
            System.out.println(q + " / " + w + " = " + result);
        }
    }

    static void task_2(int n) {
        if (n < 10) {
            System.out.println("Please enter a two-digit number");
        } else {
            int tens = n / 10;
            int units = n % 10;
            System.out.println(String.format("Sum of digits of number %s (%s and %d) is %s", n, tens, units, tens + units));
        }
    }

    static void task_3(float n) {
        if (n % 1 == 0) {
            System.out.println("Please enter a number with a non-zero fractional part");
        } else {
            System.out.println(String.format("The number %s rounded to the nearest integer will be equal to %s", n, Math.round(n)));
        }

    }

    static void task_4(int a, int b, int c) {
        c = a + b + c; // old values:        a + b + c
        b = c - a - b - a; // old values:    c - a
        a = c - b - a; // old values:        a + b + c - (c - a) - a  = a + b + c - c + a - a

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}