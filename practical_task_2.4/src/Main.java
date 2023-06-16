import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
//        task_1();
//        task_2();
        task_3();
    }

    public static void task_1() {
        System.out.print("Enter the line: ");
        String line = empty_line_blocker();
//        First and last characters
        System.out.println("The string is: \"" + line + "\"");
        System.out.println("The first character in the string is: \"" + line.substring(0, 1) + "\"");
        System.out.println("The last character in the string is: \"" + line.substring(line.length() - 1) + "\"");
//        Middle character
        if (line.length() % 2 != 0) {
            System.out.print("The length of the given string is odd. Therefore, the middle character is: \"");
            System.out.println(line.substring(line.length() / 2, line.length() / 2 + 1) + "\"");
        } else {
            System.out.println("The length of the given string is even. Therefore, there will be no middle character.");
        }

//        Dots
        if (line.contains(".")) {
            System.out.print("This string contains dots, the part of the string up to the first dot encountered, including the dot is: ");
            String[] split_line = line.split("[.]");
            System.out.println("\"" + split_line[0] + "." + "\"");
        } else {
            System.out.println("This string does not contain dots.");
        }
//        Spaces
        if (line.contains(" ")) {
            int counter = 0;
            char ch = ' ';
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ch) {
                    counter++;
                }
            }
            System.out.println("This string contain " + counter + " spaces.");
        } else {
            System.out.println("This string does not contain spaces.");
        }
        System.out.println();
    }

    public static void task_2() {
        System.out.println("Task 2");
        System.out.print("Enter the string: ");
        String line = empty_line_blocker();  // Read user input string
        System.out.print("Enter the replacement substring: ");
        String sub_line = empty_line_blocker();  // Read user input replacement substring
        System.out.print("Enter the new substring: ");
        String new_sub_line = empty_line_blocker();  // Read user input  new substring
        if (line.contains(sub_line)) {
            System.out.println("New line is: \"" + line.replace(sub_line, new_sub_line) + "\"");
        } else {
            System.out.println("This string does not contain the substring you are looking for.");
        }
        System.out.println();
    }

    //    Longest word
    public static void task_3() {
        System.out.println("Task 3");
        System.out.print("Enter a string separated by spaces: ");
        String line = empty_line_blocker();  // Read user input string
        while (!line.contains(" ")) {
            System.out.println("This string does not contain spaces, please enter a string containing spaces: ");
            line = empty_line_blocker();
        }
        String[] split_line = line.split(" ");
        String longest_word = "";
        for (String s : split_line) {
            if (s.length() > longest_word.length()) {
                longest_word = s;
            }
        }
        System.out.println("---------Word list---------");
        int j = 0;
        while(j < split_line.length){
            System.out.println(split_line[j]);
            j++;
        }
        System.out.println("---------------------------");
        System.out.println("Longest word in this line: \"" + longest_word +"\"");
    }

    public static String empty_line_blocker() {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        String line = scan.nextLine();  // Read user input
        while (line.isEmpty()) {
            System.out.println("This line is empty, please enter a non-empty line. ");
            line = scan.nextLine();
        }
        return line;
    }
}