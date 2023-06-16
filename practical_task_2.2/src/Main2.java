import com.welcome.Hello;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Hello man = new Hello();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = scanner.nextLine();

        man.setupName(userName);
        man.welcome();
        Main.printHelloWorld();
        man.byeBay();
    }


}
